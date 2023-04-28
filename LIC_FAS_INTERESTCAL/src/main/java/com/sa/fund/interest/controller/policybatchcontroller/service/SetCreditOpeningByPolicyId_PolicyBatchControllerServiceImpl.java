@Service
@Transactional
public class SetCreditOpeningByPolicyId_PolicyBatchControllerServiceImpl implements SetCreditOpeningByPolicyId_PolicyBatchControllerService {

    @Autowired
    private SetCreditOpeningByPolicyId_PolicyBatchControllerRepository setCreditOpeningByPolicyId_PolicyBatchControllerRepository;

    @Override
    public PolicyFundCoreService setOpeningBalanceForQuarterPolicy(int policyId, String policyNumber, String trnxDate, String variant,
            String policyType, boolean isBatch, boolean isAuto, boolean setOpeningBalance, boolean recalculate, String licId) {
        return setCreditOpeningByPolicyId_PolicyBatchControllerRepository.setOpeningBalanceForQuarterPolicy(policyId, policyNumber, trnxDate,
                variant, policyType, isBatch, isAuto, setOpeningBalance, recalculate, licId);
    }

    @Override
    public PolicyFundCoreService setOpeningBalanceForFinancialYearPolicy(int policyId, String policyNumber, String trnxDate, String variant,
            String policyType, boolean isBatch, boolean isAuto, boolean setOpeningBalance, boolean recalculate, String licId) {
        return setCreditOpeningByPolicyId_PolicyBatchControllerRepository.setOpeningBalanceForFinancialYearPolicy(policyId, policyNumber, trnxDate,
                variant, policyType, isBatch, isAuto, setOpeningBalance, recalculate, licId);
    }

    @Override
    public CommonResponseDto<Object> setOpeningBalResponse(BatchDto batchDto, PolicyMasterEntity policyMasterEntity, MembersDto membersDto, boolean success) {
        return setCreditOpeningByPolicyId_PolicyBatchControllerRepository.setOpeningBalResponse(batchDto, policyMasterEntity, membersDto, success);
    }

    @Override
    public void savePolicyFundSummary(InterestFundResponseDto interestFundResponseDto) {
        setCreditOpeningByPolicyId_PolicyBatchControllerRepository.savePolicyFundSummary(interestFundResponseDto);
    }

}