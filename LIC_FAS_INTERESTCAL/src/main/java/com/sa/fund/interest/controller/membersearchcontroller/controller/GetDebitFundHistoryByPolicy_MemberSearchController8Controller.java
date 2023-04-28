package com.sa.fund.interest.controller.membersearchcontroller.repository;

import com.sa.fund.interest.model.DebitFundTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GetDebitFundHistoryByPolicy_MemberSearchController8Repository extends JpaRepository<DebitFundTransaction, Long> {
    @Query("SELECT dft FROM DebitFundTransaction dft where dft.policyNo = ?1 and dft.memberId = ?2 and dft.isActive = true")
    List<DebitFundTransaction> findActiveDebitFundTransactionsByPolicyAndMemberId(String policyNo, String memberId);
}

package com.sa.fund.interest.controller.membersearchcontroller.controller;

import com.sa.fund.interest.controller.membersearchcontroller.model.DebitFundTransaction;
import com.sa.fund.interest.controller.membersearchcontroller.service.GetDebitFundHistoryByPolicy_MemberSearchController8Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GetDebitFundHistoryByPolicy_MemberSearchController8Controller {

    @Autowired
    private GetDebitFundHistoryByPolicy_MemberSearchController8Service service;

    @GetMapping("/debit-fund-transaction/{policyNo}/{memberId}")
    public List<DebitFundTransaction> getDebitFundTransactionsByPolicyAndMemberId(@PathVariable String policyNo, @PathVariable String memberId) {
        return service.findActiveDebitFundTransactionsByPolicyAndMemberId(policyNo, memberId);
    }

}