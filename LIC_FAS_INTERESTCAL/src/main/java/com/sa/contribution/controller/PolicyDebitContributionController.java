package com.sa.contribution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.contribution.dto.DebitRequestDto;
import com.sa.contribution.dto.CommonResponseDto;
import com.sa.contribution.service.PolicyDebitContributionService;

@RestController
@RequestMapping("/policy-debit-contribution")
public class PolicyDebitContributionController {
    
    @Autowired
    private PolicyDebitContributionService policyDebitContributionService;

    @PostMapping("/process-debit-request")
    public CommonResponseDto processDebitRequest(@RequestBody DebitRequestDto debitRequestDto) {
        return policyDebitContributionService.processDebitRequest(debitRequestDto);
    }

    @PostMapping("/log-debit-transaction")
    public void logDebitTransaction(@RequestBody DebitRequestDto debitRequestDto) {
        policyDebitContributionService.logDebitTransaction(debitRequestDto);
    }

}