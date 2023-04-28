package com.sa.fund.interest.integration.supportcontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.integration.supportcontroller.model.PolicyFundSummary;
import com.sa.fund.interest.integration.supportcontroller.service.SetCreditOpeningByPolicyId_SupportControllerService;

@RestController
public class SetCreditOpeningByPolicyId_SupportController {
	
	@Autowired
	private SetCreditOpeningByPolicyId_SupportControllerService setCreditOpeningByPolicyId_SupportControllerService;
	
	@GetMapping("/policy")
	public PolicyFundSummary findByPolicyId(@RequestParam long policyId) {
		return setCreditOpeningByPolicyId_SupportControllerService.findByPolicyId(policyId).get();
	}
	
	@PostMapping("/policy")
	public PolicyFundSummary save(@RequestBody PolicyFundSummary policyFundSummary) {
		return setCreditOpeningByPolicyId_SupportControllerService.save(policyFundSummary);
	}

}