package com.sa.fund.interest.integration.supportcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sa.fund.interest.integration.supportcontroller.BatchDto;
import com.sa.fund.interest.integration.supportcontroller.InterestFundResponseDto;

public interface ViewMemberFund_SupportControllerRepository extends JpaRepository<BatchDto, Long> {
    
    CommonResponseDto<InterestFundResponseDto> viewMemberFund(BatchDto batchDto);
    
    List<InterestFundResponseDto> viewMemberBatchByPolicyId(Long policyId, boolean isBatch);
    
    void findMemberDetails();
}