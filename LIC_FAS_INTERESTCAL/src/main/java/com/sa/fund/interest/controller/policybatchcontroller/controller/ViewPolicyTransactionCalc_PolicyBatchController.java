package com.sa.fund.interest.controller.policybatchcontroller.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.controller.policybatchcontroller.model.PolicyFundCalcRateDetailsDto;
import com.sa.fund.interest.controller.policybatchcontroller.service.ViewPolicyTransactionCalc_PolicyBatchControllerService;

@RestController
public class ViewPolicyTransactionCalc_PolicyBatchController {

	@Autowired
	ViewPolicyTransactionCalc_PolicyBatchControllerService viewPolicyTransactionCalc_PolicyBatchControllerService;
	
	@GetMapping("/view/transaction/{transactionId}")
	public ResponseEntity<Optional<PolicyFundCalcRateDetailsDto>> getPolicyByTransactionId(@PathVariable("transactionId")Long transactionId) {
		Optional<PolicyFundCalcRateDetailsDto> policyFundCalcRateDetailsDto = viewPolicyTransactionCalc_PolicyBatchControllerService.findByTransactionId(transactionId);
		return new ResponseEntity<>(policyFundCalcRateDetailsDto,HttpStatus.OK);
	}

}