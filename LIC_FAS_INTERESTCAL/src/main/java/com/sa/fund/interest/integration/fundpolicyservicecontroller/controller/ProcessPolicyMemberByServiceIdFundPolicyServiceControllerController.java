// Spring Boot Controller Class
package com.sa.fund.interest.integration.fundpolicyservicecontroller.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.integration.fundpolicyservicecontroller.model.ServiceModule;
import com.sa.fund.interest.integration.fundpolicyservicecontroller.service.ProcessPolicyMemberByServiceIdFundPolicyServiceControllerService;

@RestController
@RequestMapping("/fund-policy-service-controller")
public class ProcessPolicyMemberByServiceIdFundPolicyServiceControllerController {

    @Autowired
    private ProcessPolicyMemberByServiceIdFundPolicyServiceControllerService processPolicyMemberByServiceIdFundPolicyServiceControllerService;

    @GetMapping("/service-details")
    public ServiceModule getServiceDetails(Long serviceId) {
        return processPolicyMemberByServiceIdFundPolicyServiceControllerService.getServiceDetails(serviceId);
    }

    @PostMapping("/process-fund-for-service-module")
    public void processFundForServiceModule(@RequestBody ServiceModule serviceModule) {
        processPolicyMemberByServiceIdFundPolicyServiceControllerService.processFundForServiceModule(serviceModule);
    }

    @GetMapping("/response-with-success-status")
    public Map<String, Object> getResponseWithSuccessStatus(Long sourcePolicyId, Long destinationPolicyId) {
        return processPolicyMemberByServiceIdFundPolicyServiceControllerService.getResponseWithSuccessStatus(sourcePolicyId, destinationPolicyId);
    }

}