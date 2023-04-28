package com.sa.fund.interest.integration.supportcontroller.controller;

import com.sa.fund.interest.exception.ApplicationException;
import com.sa.fund.interest.exception.RequiredFieldException;
import com.sa.fund.interest.dto.CommonResponseDto;
import com.sa.fund.interest.dto.FundChangeDto;
import com.sa.fund.interest.integration.supportcontroller.service.ProcessPolicyServicesSupportControllerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/processPolicyService")
public class ProcessPolicyServicesSupportController {

    @Autowired
    private ProcessPolicyServicesSupportControllerService processPolicyServicesSupportControllerService;

    @PostMapping
    public CommonResponseDto processPolicyServices(@RequestBody FundChangeDto fundChangeDto) throws RequiredFieldException, ApplicationException {
        return processPolicyServicesSupportControllerService.processPolicyServices(fundChangeDto);
    }
}