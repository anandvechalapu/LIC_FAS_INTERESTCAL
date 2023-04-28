package com.sa.fund.interest.controller.memberbatchcontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sa.fund.interest.controller.memberbatchcontroller.dto.BatchDto;
import com.sa.fund.interest.controller.memberbatchcontroller.dto.CommonResponseDto;
import com.sa.fund.interest.controller.memberbatchcontroller.repository.SetCreditOpeningByPolicyAndLicId_MemberBatchControllerRepository;

@Service
public class SetCreditOpeningByPolicyAndLicId_MemberBatchControllerService {

    @Autowired
    private SetCreditOpeningByPolicyAndLicId_MemberBatchControllerRepository setCreditOpeningByPolicyAndLicId_MemberBatchControllerRepository;

    @Transactional
    public CommonResponseDto<Object> setCreditOpeningByPolicyAndLicId(Long policyId, Long licId){
        BatchDto batchDto = setCreditOpeningByPolicyAndLicId_MemberBatchControllerRepository.findByPolicyIdAndLicId(policyId, licId);
        if(batchDto == null){
            return CommonResponseDto.error("No batch found for the given policyId and licId");
        }
        batchDto.setCreditOpening(batchDto.getCreditOpening() + 1);
        setCreditOpeningByPolicyAndLicId_MemberBatchControllerRepository.save(batchDto);
        return CommonResponseDto.success("Credit opening balance updated successfully");
    }

}