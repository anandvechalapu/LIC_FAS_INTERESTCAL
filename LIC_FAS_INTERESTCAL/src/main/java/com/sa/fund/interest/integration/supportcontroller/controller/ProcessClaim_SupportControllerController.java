package com.sa.fund.interest.integration.supportcontroller.controller;

import com.sa.fund.interest.integration.supportcontroller.dto.ClaimRequestDto;
import com.sa.fund.interest.integration.supportcontroller.dto.CommonResponseDto;
import com.sa.fund.interest.integration.supportcontroller.service.ProcessClaim_SupportControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/supportcontroller")
public class ProcessClaim_SupportControllerController {
    
    @Autowired
    private ProcessClaim_SupportControllerService processClaim_SupportControllerService;
    
    @PostMapping("/processClaim")
    public CommonResponseDto<Object> processClaim(@RequestBody ClaimRequestDto claimRequestDto) {
        processClaim_SupportControllerService.saveIntegrationRequestAndResponse(claimRequestDto);
        if (processClaim_SupportControllerService.validatePolicyAndMemberDetails(claimRequestDto)
                && processClaim_SupportControllerService.validateClosingBalance(claimRequestDto)
                && processClaim_SupportControllerService.retrievePolicyMasterEntityAndInterestRate(claimRequestDto)
                && processClaim_SupportControllerService.validateMemberTransactionSummary(claimRequestDto)
                && processClaim_SupportControllerService.validateDebitAmount(claimRequestDto)
                && processClaim_SupportControllerService.retrieveTopMemberAndPolicyTransactionEntry(claimRequestDto)
                && processClaim_SupportControllerService.validatePolicyAndMemberEntities(claimRequestDto)
                && processClaim_SupportControllerService.validateProcessAndTransactionDates(claimRequestDto)
                && processClaim_SupportControllerService.createDebitRequestObject(claimRequestDto)
                && processClaim_SupportControllerService.setVariantToInterestRateAndTransactionTypeToDebit(claimRequestDto)) {
            return processClaim_SupportControllerService.processClaimsForDBPolicy(claimRequestDto);
        } else {
            return processClaim_SupportControllerService.returnProcessedClaimResponse(claimRequestDto);
        }
    }
}