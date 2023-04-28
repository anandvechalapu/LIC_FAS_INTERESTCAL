package com.sa.fund.interest.controller.policysearchcontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.fund.interest.controller.policysearchcontroller.repository.PolicySearchControllerRepository;
import com.sa.fund.interest.domain.DebitFundHistory;

@Service
public class PolicySearchControllerService {

    @Autowired
    private PolicySearchControllerRepository policySearchControllerRepository;

    public DebitFundHistory getDebitFundHistoryByPolicy(Long policyNo) {
        return policySearchControllerRepository.getDebitFundHistoryByPolicy(policyNo);
    }

}