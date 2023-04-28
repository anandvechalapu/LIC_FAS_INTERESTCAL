package com.sa.fund.interest.controller.membersearchcontroller.service;

import com.sa.fund.interest.controller.membersearchcontroller.repository.GetDebitFundHistoryByPolicy_MemberSearchController8Repository;
import com.sa.fund.interest.model.DebitFundTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetDebitFundHistoryByPolicy_MemberSearchController8Service {

    @Autowired
    private GetDebitFundHistoryByPolicy_MemberSearchController8Repository repository;

    public List<DebitFundTransaction> findActiveDebitFundTransactionsByPolicyAndMemberId(String policyNo, String memberId) {
        return repository.findActiveDebitFundTransactionsByPolicyAndMemberId(policyNo, memberId);
    }
}