package com.sa.fund.interest.controller.policybatchcontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.fund.interest.controller.policybatchcontroller.model.PolicyFundCalcRateDetailsDto;
import com.sa.fund.interest.controller.policybatchcontroller.repository.ViewPolicyTransactionCalc_PolicyBatchControllerRepository;

@Service
public class ViewPolicyTransactionCalc_PolicyBatchControllerService {

	@Autowired
	ViewPolicyTransactionCalc_PolicyBatchControllerRepository viewPolicyTransactionCalc_PolicyBatchControllerRepository;
	
	public Optional<PolicyFundCalcRateDetailsDto> findByTransactionId(Long transactionId){
		return viewPolicyTransactionCalc_PolicyBatchControllerRepository.findByTransactionId(transactionId);
	}
	
}