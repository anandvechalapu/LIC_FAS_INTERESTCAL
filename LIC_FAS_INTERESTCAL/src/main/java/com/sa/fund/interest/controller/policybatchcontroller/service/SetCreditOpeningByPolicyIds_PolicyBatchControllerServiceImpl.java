@Service
public class SetCreditOpeningByPolicyIds_PolicyBatchControllerServiceImpl implements SetCreditOpeningByPolicyIds_PolicyBatchControllerService {

	@Autowired
	SetCreditOpeningByPolicyIds_PolicyBatchControllerRepository setCreditOpeningByPolicyIds_PolicyBatchControllerRepository;

	/**
	 * Set the credit opening balance for a list of policy ids through a batch process.
	 * 
	 * @param policyId Integer (mandatory)
	 * @param policyNumber String (optional)
	 * @param trnxDate String (mandatory)
	 * @param variant String (optional)
	 * @param policyType String (optional)
	 * @param isBatch Boolean (mandatory)
	 * @param isAuto Boolean (mandatory)
	 * @param setOpeningBalance Boolean (mandatory)
	 * @param recalculate Boolean (mandatory)
	 * @param licId String (optional)
	 * @return CommonResponseDto<Object> with the following parameters: status: String (SUCCESS or ERROR)
	 *         message: String (a message indicating the success or failure of the operation)
	 *         batchNumber: String (a unique identifier for the batch process)
	 *         responseData: Array of InterestFundResponseDto objects.
	 */
	@Override
	public CommonResponseDto<Object> setCreditOpeningByPolicyIds(Integer policyId, String policyNumber, String trnxDate, String variant, 
			String policyType, Boolean isBatch, Boolean isAuto, Boolean setOpeningBalance, Boolean recalculate, String licId) {

		CommonResponseDto<Object> commonResponseDto = new CommonResponseDto<>();
		List<InterestFundResponseDto> responseData = new ArrayList<>();

		// Fetch the policy details from the database using the policy id provided.
		PolicyDetails policyDetails = setCreditOpeningByPolicyIds_PolicyBatchControllerRepository.fetchPolicyDetails(policyId);
		// Retrieve the interest rate variant for the policy.
		InterestRateVariant interestRateVariant = setCreditOpeningByPolicyIds_PolicyBatchControllerRepository.retrieveInterestRateVariant(policyId);

		// Set the batchDto parameters required for setting the opening balance.
		BatchDto batchDto = setCreditOpeningByPolicyIds_PolicyBatchControllerRepository.setBatchDtoParameters(policyId, policyNumber, trnxDate, variant, 
				policyType, isBatch, isAuto, setOpeningBalance, recalculate, licId);

		// Call the policyFundCoreService method to set the opening balance.
		Boolean isOpeningBalanceSet = setCreditOpeningByPolicyIds_PolicyBatchControllerRepository.callPolicyFundCoreService(batchDto);
		if(isOpeningBalanceSet) {
			// Create an InterestFundResponseDto object with the policy id and the opening balance value.
			responseData.add(setCreditOpeningByPolicyIds_PolicyBatchControllerRepository.createInterestFundResponseDto(policyId, policyDetails.getOpeningBalance()));
			commonResponseDto.setStatus("SUCCESS");
			commonResponseDto.setMessage("Opening balance set successfully");
			commonResponseDto.setBatchNumber(batchDto.getBatchNumber());
			commonResponseDto.setResponseData(responseData);
		} else {
			// Create an InterestFundResponseDto object with the policy id and the error message.
			responseData.add(setCreditOpeningByPolicyIds_PolicyBatchControllerRepository.createInterestFundResponseDto(policyId, "Opening balance set failed"));
			commonResponseDto.setStatus("ERROR");
			commonResponseDto.setMessage("Opening balance set failed");
			commonResponseDto.setBatchNumber(batchDto.getBatchNumber());
			commonResponseDto.setResponseData(responseData);
		}

		return commonResponseDto;
	}

}