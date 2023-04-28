@Repository
public interface GetFmcChargesHistoryByPolicy_MemberSearchController9Repository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByPolicyNumberAndMemberId(String policyNumber, String memberId);
    List<Transaction> findAllTransactionsByPolicyNumberAndMemberId(String policyNumber, String memberId);
}

package com.sa.fund.interest.controller.membersearchcontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.controller.membersearchcontroller.model.Transaction;
import com.sa.fund.interest.controller.membersearchcontroller.service.GetFmcChargesHistoryByPolicy_MemberSearchController9Service;

@RestController
@RequestMapping("/transaction")
public class GetFmcChargesHistoryByPolicy_MemberSearchController9Controller {

    @Autowired
    private GetFmcChargesHistoryByPolicy_MemberSearchController9Service getFmcChargesHistoryByPolicy_MemberSearchController9Service;

    @GetMapping("/findByPolicyNumberAndMemberId")
    public List<Transaction> findByPolicyNumberAndMemberId(@RequestParam String policyNumber, @RequestParam String memberId){
        return getFmcChargesHistoryByPolicy_MemberSearchController9Service.findByPolicyNumberAndMemberId(policyNumber, memberId);
    }

    @GetMapping("/findAllTransactionsByPolicyNumberAndMemberId")
    public List<Transaction> findAllTransactionsByPolicyNumberAndMemberId(@RequestParam String policyNumber, @RequestParam String memberId){
        return getFmcChargesHistoryByPolicy_MemberSearchController9Service.findAllTransactionsByPolicyNumberAndMemberId(policyNumber, memberId);
    }

}