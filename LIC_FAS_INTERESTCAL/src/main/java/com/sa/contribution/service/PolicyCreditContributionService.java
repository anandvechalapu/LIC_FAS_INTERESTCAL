@Service
@Transactional
public class PolicyCreditContributionService {
 
    private final PolicyCreditContributionRepository policyCreditContributionRepository;

    public PolicyCreditContributionService(PolicyCreditContributionRepository policyCreditContributionRepository) {
        this.policyCreditContributionRepository = policyCreditContributionRepository;
    }

    public Optional<PolicyCreditContribution> findByPolicyIdAndPolicyNumberAndContributionIdsAndFinancialYearAndEffectiveTxnDate(Long policyId, String policyNumber, List<Long> contributionIds,
                                                                                                                               String financialYear, Date effectiveTxnDate) {
        return policyCreditContributionRepository.findByPolicyIdAndPolicyNumberAndContributionIdsAndFinancialYearAndEffectiveTxnDate(policyId, policyNumber, contributionIds, financialYear, effectiveTxnDate);
    }

    public void deleteByPolicyIdAndPolicyNumberAndContributionIdsAndFinancialYearAndEffectiveTxnDate(Long policyId, String policyNumber, List<Long> contributionIds,
                                                                                                     String financialYear, Date effectiveTxnDate) {
        policyCreditContributionRepository.deleteByPolicyIdAndPolicyNumberAndContributionIdsAndFinancialYearAndEffectiveTxnDate(policyId, policyNumber, contributionIds, financialYear, effectiveTxnDate);
    }

    public Optional<PolicyCreditContribution> findByPolicyIdAndPolicyNumberAndFinancialYearAndEffectiveTxnDate(Long policyId, String policyNumber,
                                                                                                              String financialYear, Date effectiveTxnDate) {
        return policyCreditContributionRepository.findByPolicyIdAndPolicyNumberAndFinancialYearAndEffectiveTxnDate(policyId, policyNumber, financialYear, effectiveTxnDate);
    }
}