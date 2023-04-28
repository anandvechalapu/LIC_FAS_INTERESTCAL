package com.sa.fund.interest.integration.fundintegrationcontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.integration.fundintegrationcontroller.service.FundInterestService;

@RestController
@RequestMapping("/fund-interest")
public class FundInterestController {
	
	@Autowired
	private FundInterestService fundInterestService;
	
		
	public String getInterestRate(String fundName) {
		return fundInterestService.getInterestRate(fundName);
	}
	

}