package com.sa.fund.interest.integration.supportcontroller.service;

import com.sa.fund.interest.integration.supportcontroller.dto.ClaimRequestDto;
import com.sa.fund.interest.integration.supportcontroller.dto.CommonResponseDto;
import com.sa.fund.interest.integration.supportcontroller.repository.ProcessClaim_SupportControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcessClaim_SupportControllerService {
    
    @Autowired
    private ProcessClaim_SupportControllerRepository processClaim_SupportControllerRepository;
    
    public void saveIntegrationRequestAndResponse(ClaimRequestDto claimRequestDto) {
        processClaim_SupportControllerRepository.saveIntegrationRequestAndResponse(claimRequestDto);
    }
    
    public Boolean validatePolicyAndMemberDetails(ClaimRequestDto claimRequestDto) {
        return processClaim_SupportControllerRepository.validatePolicyAndMemberDetails(claimRequestDto);
    }
    
    public Boolean validateClosingBalance(ClaimRequestDto claimRequestDto) {
        return processClaim_SupportControllerRepository.validateClosingBalance(claimRequestDto);
    }
    
    public Boolean retrievePolicyMasterEntityAndInterestRate(ClaimRequestDto claimRequestDto) {
        return processClaim_SupportControllerRepository.retrievePolicyMasterEntityAndInterestRate(claimRequestDto);
    }
    
    public CommonResponseDto<Object> processClaimsForDBPolicy(ClaimRequestDto claimRequestDto) {
        return processClaim_SupportControllerRepository.processClaimsForDBPolicy(claimRequestDto);
    }
    
    public Boolean validateMemberTransactionSummary(ClaimRequestDto claimRequestDto) {
        return processClaim_SupportControllerRepository.validateMemberTransactionSummary(claimRequestDto);
    }
    
    public Boolean validateDebitAmount(ClaimRequestDto claimRequestDto) {
        return processClaim_SupportControllerRepository.validateDebitAmount(claimRequestDto);
    }
    
    public Boolean retrieveTopMemberAndPolicyTransactionEntry(ClaimRequestDto claimRequestDto) {
        return processClaim_SupportControllerRepository.retrieveTopMemberAndPolicyTransactionEntry(claimRequestDto);
    }
    
    public Boolean validatePolicyAndMemberEntities(ClaimRequestDto claimRequestDto) {
        return processClaim_SupportControllerRepository.validatePolicyAndMemberEntities(claimRequestDto);
    }
    
    public Boolean validateProcessAndTransactionDates(ClaimRequestDto claimRequestDto) {
        return processClaim_SupportControllerRepository.validateProcessAndTransactionDates(claimRequestDto);
    }
    
    public Boolean createDebitRequestObject(ClaimRequestDto claimRequestDto) {
        return processClaim_SupportControllerRepository.createDebitRequestObject(claimRequestDto);
    }
    
    public Boolean setVariantToInterestRateAndTransactionTypeToDebit(ClaimRequestDto claimRequestDto) {
        return processClaim_SupportControllerRepository.setVariantToInterestRateAndTransactionTypeToDebit(claimRequestDto);
    }
    
    public CommonResponseDto<Object> returnProcessedClaimResponse(ClaimRequestDto claimRequestDto) {
        return processClaim_SupportControllerRepository.returnProcessedClaimResponse(claimRequestDto);
    }
}