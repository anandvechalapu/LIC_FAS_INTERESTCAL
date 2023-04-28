@Repository
public interface PolicyCreditContributionRepository extends JpaRepository<PolicyCreditContribution, Long> {

    Optional<PolicyCreditContribution> findByPolicyIdAndPolicyNumberAndContributionIdsAndFinancialYearAndEffectiveTxnDate(Long policyId, String policyNumber, List<Long> contributionIds,
                                                                                                                         String financialYear, Date effectiveTxnDate);

    void deleteByPolicyIdAndPolicyNumberAndContributionIdsAndFinancialYearAndEffectiveTxnDate(Long policyId, String policyNumber, List<Long> contributionIds,
                                                                                              String financialYear, Date effectiveTxnDate);

    Optional<PolicyCreditContribution> findByPolicyIdAndPolicyNumberAndFinancialYearAndEffectiveTxnDate(Long policyId, String policyNumber,
                                                                                                        String financialYear, Date effectiveTxnDate);
}

package com.sa.contribution.controller;

import com.sa.contribution.model.PolicyCreditContribution;
import com.sa.contribution.service.PolicyCreditContributionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class PolicyCreditContributionController {

    @Autowired
    private PolicyCreditContributionService policyCreditContributionService;

    @GetMapping("/findByPolicyIdAndPolicyNumberAndContributionIdsAndFinancialYearAndEffectiveTxnDate")
    public Optional<PolicyCreditContribution> findByPolicyIdAndPolicyNumberAndContributionIdsAndFinancialYearAndEffectiveTxnDate(@RequestParam Long policyId,
                                                                                                                                 @RequestParam String policyNumber,
                                                                                                                                 @RequestParam List<Long> contributionIds,
                                                                                                                                 @RequestParam String financialYear,
                                                                                                                                 @RequestParam Date effectiveTxnDate) {
        return policyCreditContributionService.findByPolicyIdAndPolicyNumberAndContributionIdsAndFinancialYearAndEffectiveTxnDate(policyId, policyNumber, contributionIds, financialYear, effectiveTxnDate);
    }

    @GetMapping("/deleteByPolicyIdAndPolicyNumberAndContributionIdsAndFinancialYearAndEffectiveTxnDate")
    public void deleteByPolicyIdAndPolicyNumberAndContributionIdsAndFinancialYearAndEffectiveTxnDate(@RequestParam Long policyId,
                                                                                                      @RequestParam String policyNumber,
                                                                                                      @RequestParam List<Long> contributionIds,
                                                                                                      @RequestParam String financialYear,
                                                                                                      @RequestParam Date effectiveTxnDate) {
        policyCreditContributionService.deleteByPolicyIdAndPolicyNumberAndContributionIdsAndFinancialYearAndEffectiveTxnDate(policyId, policyNumber, contributionIds, financialYear, effectiveTxnDate);
    }

    @GetMapping("/findByPolicyIdAndPolicyNumberAndFinancialYearAndEffectiveTxnDate")
    public Optional<PolicyCreditContribution> findByPolicyIdAndPolicyNumberAndFinancialYearAndEffectiveTxnDate(@RequestParam Long policyId,
                                                                                                              @RequestParam String policyNumber,
                                                                                                              @RequestParam String financialYear,
                                                                                                              @RequestParam Date effectiveTxnDate) {
        return policyCreditContributionService.findByPolicyIdAndPolicyNumberAndFinancialYearAndEffectiveTxnDate(policyId, policyNumber, financialYear, effectiveTxnDate);
    }

}