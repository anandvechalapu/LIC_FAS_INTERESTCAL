package com.sa.fund.interest.integration.fundpolicyservicecontroller.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.service.FundPolicyService;

@RestController
public class FundPolicyServiceController {
	
	private final FundPolicyService fundPolicyService;
	
	public FundPolicyServiceController(FundPolicyService fundPolicyService) {
		this.fundPolicyService = fundPolicyService;
	}
	
	//Add controller methods here

}