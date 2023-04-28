@Repository
public interface PolicyCreditContributionRepository extends JpaRepository<PolicyCreditContribution, Long> {
    @Query("select p from PolicyCreditContribution p where p.policyId = :policyId and p.policyNumber = :policyNumber and p.contributionIds = :contributionIds and p.financialYear = :financialYear and p.effectiveTxnDate = :effectiveTxnDate")
    Optional<PolicyCreditContribution> findByPolicyIdAndPolicyNumberAndContributionIdsAndFinancialYearAndEffectiveTxnDate(@Param("policyId") Long policyId, @Param("policyNumber") String policyNumber,
                                                                                                                   @Param("contributionIds") List<Long> contributionIds, @Param("financialYear") String financialYear,
                                                                                                                   @Param("effectiveTxnDate") Date effectiveTxnDate);
    @Transactional
    @Modifying
    @Query("delete from PolicyCreditContribution p where p.policyId = :policyId and p.policyNumber = :policyNumber and p.contributionIds = :contributionIds and p.financialYear = :financialYear and p.effectiveTxnDate = :effectiveTxnDate")
    void deleteByPolicyIdAndPolicyNumberAndContributionIdsAndFinancialYearAndEffectiveTxnDate(@Param("policyId") Long policyId, @Param("policyNumber") String policyNumber,
                                                                                             @Param("contributionIds") List<Long> contributionIds, @Param("financialYear") String financialYear,
                                                                                             @Param("effectiveTxnDate") Date effectiveTxnDate);
    @Query("select p from PolicyCreditContribution p where p.policyId = :policyId and p.policyNumber = :policyNumber and p.financialYear = :financialYear and p.effectiveTxnDate = :effectiveTxnDate")
    Optional<PolicyCreditContribution> findByPolicyIdAndPolicyNumberAndFinancialYearAndEffectiveTxnDate(@Param("policyId") Long policyId, @Param("policyNumber") String policyNumber,
                                                                                                      @Param("financialYear") String financialYear, @Param("effectiveTxnDate") Date effectiveTxnDate);
}