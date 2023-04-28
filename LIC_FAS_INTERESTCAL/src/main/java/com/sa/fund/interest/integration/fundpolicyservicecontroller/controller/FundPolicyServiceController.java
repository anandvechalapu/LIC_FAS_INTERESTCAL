package com.sa.fund.interest.integration.fundpolicyservicecontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.integration.fundpolicyservicecontroller.model.FundChangeDto;
import com.sa.fund.interest.integration.fundpolicyservicecontroller.model.CommonResponseDto;
import com.sa.fund.interest.integration.fundpolicyservicecontroller.model.FundPolicyService;
import com.sa.fund.interest.integration.fundpolicyservicecontroller.service.FundPolicyServiceControllerService;

@RestController
public class FundPolicyServiceController {

    @Autowired
    private FundPolicyServiceControllerService service;

    @PostMapping("/process_policy")
    public CommonResponseDto processPolicy(@RequestBody FundChangeDto fundChangeDto, @RequestParam String serviceId) {
        return service.processPolicy(fundChangeDto, serviceId);
    }

    @GetMapping("/find_policy_service")
    public FundPolicyService findPolicyServiceById(@RequestParam String serviceId) {
        return service.findPolicyServiceById(serviceId);
    }
}