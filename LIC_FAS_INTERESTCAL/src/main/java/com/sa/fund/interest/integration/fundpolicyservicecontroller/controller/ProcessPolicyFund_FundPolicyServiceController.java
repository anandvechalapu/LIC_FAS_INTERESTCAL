package com.sa.fund.interest.integration.fundpolicyservicecontroller.controller;

import com.sa.fund.interest.integration.fundpolicyservicecontroller.exceptions.ApplicationException;
import com.sa.fund.interest.integration.fundpolicyservicecontroller.exceptions.RequiredFieldException;
import com.sa.fund.interest.integration.fundpolicyservicecontroller.model.CommonResponseDto;
import com.sa.fund.interest.integration.fundpolicyservicecontroller.service.ProcessPolicyFund_FundPolicyServiceControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fund/policy/service")
public class ProcessPolicyFund_FundPolicyServiceController {

    @Autowired
    ProcessPolicyFund_FundPolicyServiceControllerService processPolicyFund_FundPolicyServiceControllerService;

    @GetMapping("/{serviceId}")
    public ResponseEntity<CommonResponseDto> processPolicyFundService(@PathVariable Long serviceId) throws ApplicationException, RequiredFieldException {
        CommonResponseDto commonResponseDto = processPolicyFund_FundPolicyServiceControllerService.processPolicyFundService(serviceId);
        return new ResponseEntity<>(commonResponseDto, HttpStatus.OK);
    }
}