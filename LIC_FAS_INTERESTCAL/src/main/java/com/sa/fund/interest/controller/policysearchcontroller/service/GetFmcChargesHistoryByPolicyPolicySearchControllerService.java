package com.sa.fund.interest.controller.policysearchcontroller.service;

import com.sa.fund.interest.controller.policysearchcontroller.repository.GetFmcChargesHistoryByPolicyPolicySearchControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.fund.interest.model.FmcChargesHistory;

import java.util.List;

@Service
public class GetFmcChargesHistoryByPolicyPolicySearchControllerService {

    @Autowired
    private GetFmcChargesHistoryByPolicyPolicySearchControllerRepository getFmcChargesHistoryByPolicyPolicySearchControllerRepository;

    public List<FmcChargesHistory> getFmcChargesHistoryByPolicy(Long policyNo) {
        return getFmcChargesHistoryByPolicyPolicySearchControllerRepository.findByPolicyFundStmtPolicyIdOrderByEffectiveTxnDateAsc(policyNo);
    }
}