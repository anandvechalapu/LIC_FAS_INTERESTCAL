@Repository
public interface SetCreditOpeningByPolicyIds_PolicyBatchControllerRepository {

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
	CommonResponseDto<Object> setCreditOpeningByPolicyIds(Integer policyId, String policyNumber, String trnxDate, String variant, 
			String policyType, Boolean isBatch, Boolean isAuto, Boolean setOpeningBalance, Boolean recalculate, String licId);

	/**
	 * Fetch the policy details from the database using the policy id provided.
	 * 
	 * @param policyId the policy id for which the opening balance needs to be set
	 * @return policy details
	 */
	PolicyDetails fetchPolicyDetails(Long policyId);

	/**
	 * Retrieve the interest rate variant for the policy.
	 * 
	 * @param policyId the policy id for which the opening balance needs to be set
	 * @return interest rate variant
	 */
	InterestRateVariant retrieveInterestRateVariant(Long policyId);

	/**
	 * Set the batchDto parameters required for setting the opening balance.
	 * 
	 * @param policyId the policy id for which the opening balance needs to be set
	 * @param policyNumber the policy number
	 * @param trnxDate transaction date
	 * @param variant interest rate variant
	 * @param policyType policy type
	 * @param isBatch boolean value indicating if it is a batch process
	 * @param isAuto boolean value indicating if it is an auto process
	 * @param setOpeningBalance boolean value indicating if the opening balance needs to be set
	 * @param recalculate boolean value indicating if the opening balance needs to be recalculated
	 * @param licId the licId
	 * @return batchDto
	 */
	BatchDto setBatchDtoParameters(Long policyId, String policyNumber, String trnxDate, String variant, 
			String policyType, Boolean isBatch, Boolean isAuto, Boolean setOpeningBalance, Boolean recalculate, String licId);

	/**
	 * Call the policyFundCoreService method to set the opening balance.
	 * 
	 * @param batchDto batchDto object with the required parameters
	 * @return boolean value indicating the success or failure of the operation
	 */
	boolean callPolicyFundCoreService(BatchDto batchDto);

	/**
	 * Create an InterestFundResponseDto object with the policy id and the opening balance value.
	 * 
	 * @param policyId the policy id for which the opening balance needs to be set
	 * @param openingBalance opening balance value
	 * @return InterestFundResponseDto object
	 */
	InterestFundResponseDto createInterestFundResponseDto(Long policyId, Double openingBalance);

	/**
	 * Create an InterestFundResponseDto object with the policy id and the error message.
	 * 
	 * @param policyId the policy id for which the opening balance needs to be set
	 * @param errorMessage error message
	 * @return InterestFundResponseDto object
	 */
	InterestFundResponseDto createInterestFundResponseDto(Long policyId, String errorMessage);

}