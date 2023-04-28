@Repository
public interface SetCreditOpeningByPolicyId_PolicyBatchControllerRepository extends JpaRepository<PolicyMasterEntity, Integer> {

    public PolicyFundCoreService setOpeningBalanceForQuarterPolicy(int policyId, String policyNumber, String trnxDate, String variant, String policyType, boolean isBatch, boolean isAuto, boolean setOpeningBalance, boolean recalculate, String licId);

    public PolicyFundCoreService setOpeningBalanceForFinancialYearPolicy(int policyId, String policyNumber, String trnxDate, String variant, String policyType, boolean isBatch, boolean isAuto, boolean setOpeningBalance, boolean recalculate, String licId);

    public CommonResponseDto<Object> setOpeningBalResponse(BatchDto batchDto, PolicyMasterEntity policyMasterEntity, MembersDto membersDto, boolean success);

    public void savePolicyFundSummary(InterestFundResponseDto interestFundResponseDto);
}