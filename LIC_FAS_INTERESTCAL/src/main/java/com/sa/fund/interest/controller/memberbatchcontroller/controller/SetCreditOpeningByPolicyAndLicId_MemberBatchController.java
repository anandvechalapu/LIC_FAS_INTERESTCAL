package com.sa.fund.interest.controller.memberbatchcontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.controller.memberbatchcontroller.dto.BatchDto;
import com.sa.fund.interest.controller.memberbatchcontroller.dto.CommonResponseDto;
import com.sa.fund.interest.controller.memberbatchcontroller.service.SetCreditOpeningByPolicyAndLicId_MemberBatchControllerService;

@RestController
@RequestMapping("/memberbatchcontroller")
public class SetCreditOpeningByPolicyAndLicId_MemberBatchController {
    
    @Autowired
    private SetCreditOpeningByPolicyAndLicId_MemberBatchControllerService setCreditOpeningByPolicyAndLicId_MemberBatchControllerService;

    @PostMapping("/setCreditOpeningByPolicyAndLicId")
    public CommonResponseDto<Object> setCreditOpeningByPolicyAndLicId(@RequestBody BatchDto batchDto){
        return setCreditOpeningByPolicyAndLicId_MemberBatchControllerService.setCreditOpeningByPolicyAndLicId(batchDto.getPolicyId(), batchDto.getLicId());
    }

}