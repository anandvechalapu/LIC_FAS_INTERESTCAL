//Service class
package com.sa.fund.interest.integration.fundpolicyservicecontroller.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.sa.fund.interest.integration.fundpolicyservicecontroller.model.ProcessMemberPolicyServiceFundPolicyServiceControllerModel;
import com.sa.fund.interest.integration.fundpolicyservicecontroller.model.MemberChangeDto;

@Service
public class ProcessMemberPolicyServiceFundPolicyServiceControllerService {

    public void processMemberPolicy(ProcessMemberPolicyServiceFundPolicyServiceControllerModel request) {
        request.validateRequest();
        int sourcePolicyNumber = request.getSourcePolicyNumber();
        String effectiveTxnDate = request.getEffectiveTxnDate();
        String updateSubType = request.getUpdateSubType();
        List<MemberChangeDto> policyMembers = request.getPolicyMembers();
        // do something with the data
    }
}

//Spring Boot Controller Class
package com.sa.fund.interest.integration.fundpolicyservicecontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.integration.fundpolicyservicecontroller.model.ProcessMemberPolicyServiceFundPolicyServiceControllerModel;
import com.sa.fund.interest.integration.fundpolicyservicecontroller.service.ProcessMemberPolicyServiceFundPolicyServiceControllerService;

@RestController
@RequestMapping("/fundpolicyservicecontroller/processmemberpolicy")
public class ProcessMemberPolicyServiceFundPolicyServiceControllerController {
    
    @Autowired
    private ProcessMemberPolicyServiceFundPolicyServiceControllerService processMemberPolicyServiceFundPolicyServiceControllerService;
    
    @PostMapping
    public void processMemberPolicy(@Validated @RequestBody ProcessMemberPolicyServiceFundPolicyServiceControllerModel request) {
        processMemberPolicyServiceFundPolicyServiceControllerService.processMemberPolicy(request);
    }

}