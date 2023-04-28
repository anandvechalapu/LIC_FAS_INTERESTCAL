package com.sa.fund.interest.integration.supportcontroller.service;

import org.springframework.stereotype.Service;

import com.sa.fund.interest.integration.supportcontroller.BatchDto;
import com.sa.fund.interest.integration.supportcontroller.CommonResponseDto;
import com.sa.fund.interest.integration.supportcontroller.InterestFundResponseDto;
import com.sa.fund.interest.integration.supportcontroller.repository.ViewMemberFund_SupportControllerRepository;

@Service
public class ViewMemberFund_SupportControllerService {
    
    private final ViewMemberFund_SupportControllerRepository repository;

    public ViewMemberFund_SupportControllerService(ViewMemberFund_SupportControllerRepository repository) {
        this.repository = repository;
    }

    public CommonResponseDto<InterestFundResponseDto> viewMemberFund(BatchDto batchDto) {
        return repository.viewMemberFund(batchDto);
    }
    
    public List<InterestFundResponseDto> viewMemberBatchByPolicyId(Long policyId, boolean isBatch) {
        return repository.viewMemberBatchByPolicyId(policyId, isBatch);
    }
    
    public void findMemberDetails() {
        repository.findMemberDetails();
    }

}