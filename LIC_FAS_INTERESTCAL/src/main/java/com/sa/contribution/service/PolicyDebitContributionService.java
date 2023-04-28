package com.sa.contribution.service;

import com.sa.contribution.dto.DebitRequestDto;
import com.sa.contribution.dto.CommonResponseDto;
import com.sa.contribution.repository.PolicyDebitContributionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyDebitContributionService {

    @Autowired
    private PolicyDebitContributionRepository policyDebitContributionRepository;

    public CommonResponseDto processDebitRequest(DebitRequestDto debitRequestDto) {
        return policyDebitContributionRepository.processDebitRequest(debitRequestDto);
    }

    public void logDebitTransaction(DebitRequestDto debitRequestDto) {
        policyDebitContributionRepository.logDebitTransaction(debitRequestDto);
    }

}