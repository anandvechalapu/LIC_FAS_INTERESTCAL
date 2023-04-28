package com.sa.fund.interest.controller.policysearchcontroller.controller;

import com.sa.fund.interest.controller.policysearchcontroller.dto.CommonRequestDto;
import com.sa.fund.interest.controller.policysearchcontroller.dto.CommonResponseDto;
import com.sa.fund.interest.controller.policysearchcontroller.service.PolicySearchControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fund/interest/policy/search")
public class PolicySearchController {

    @Autowired
    private PolicySearchControllerService policySearchControllerService;

    @PostMapping
    public CommonResponseDto getAllPolicyFundHistoryV2Entities(@RequestBody CommonRequestDto commonRequestDto) {
        return policySearchControllerService.getAllPolicyFundHistoryV2Entities(commonRequestDto);
    }

}