@Repository
public interface ViewPolicyFmcRatesPolicyBatchControllerRepository extends JpaRepository<BatchRequestDto, Long> {
    
    DataTable findByPolicyIdAndSummaryStatementId(Long policyId, Long summaryStatementId) throws RequiredFieldException;
    
    List<InterestFundResponseDto> findByTranFromDateAndTranToDateAndBatchDateAndInterestRateAndCurrentQuarter(Date tranFromDate, Date tranToDate, Date batchDate, Double interestRate, String currentQuarter);
}