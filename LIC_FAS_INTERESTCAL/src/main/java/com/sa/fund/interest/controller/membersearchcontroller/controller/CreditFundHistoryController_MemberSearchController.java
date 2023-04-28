package com.sa.fund.interest.controller.membersearchcontroller.repository;

import com.sa.fund.interest.controller.membersearchcontroller.model.CreditFundHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GetCreditFundHistoryByPolicy_MemberSearchController extends JpaRepository<CreditFundHistory, Long> {

    @Query(
        value = "SELECT * FROM credit_fund_history WHERE policy_no = ?1 AND member_id = ?2",
        nativeQuery = true)
    CreditFundHistory getCreditFundHistoryByPolicy(String policyNo, String memberId);
}

package com.sa.fund.interest.controller.membersearchcontroller.controller;

import com.sa.fund.interest.controller.membersearchcontroller.model.CreditFundHistory;
import com.sa.fund.interest.controller.membersearchcontroller.service.CreditFundHistoryService_MemberSearchController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/membersearch")
public class CreditFundHistoryController_MemberSearchController {

    @Autowired
    private CreditFundHistoryService_MemberSearchController creditFundHistoryService_MemberSearchController;

    @GetMapping("/{policyNo}/{memberId}")
    public CreditFundHistory getCreditFundHistoryByPolicy(@PathVariable("policyNo") String policyNo, @PathVariable("memberId") String memberId) {
        return creditFundHistoryService_MemberSearchController.getCreditFundHistoryByPolicy(policyNo, memberId);
    }

}