package com.sa.fund.interest.controller.membersearchcontroller.service;

import com.sa.fund.interest.controller.membersearchcontroller.model.CreditFundHistory;
import com.sa.fund.interest.controller.membersearchcontroller.repository.GetCreditFundHistoryByPolicy_MemberSearchController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditFundHistoryService_MemberSearchController {
    @Autowired
    private GetCreditFundHistoryByPolicy_MemberSearchController getCreditFundHistoryByPolicy_memberSearchController;

    public CreditFundHistory getCreditFundHistoryByPolicy(String policyNo, String memberId) {
        return getCreditFundHistoryByPolicy_memberSearchController.getCreditFundHistoryByPolicy(policyNo, memberId);
    }
}