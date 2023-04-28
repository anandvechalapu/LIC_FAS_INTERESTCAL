package com.sa.fund.interest.integration.supportcontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.fund.interest.integration.supportcontroller.entity.PolicyFundSummary;
import com.sa.fund.interest.integration.supportcontroller.repository.SetCreditOpeningByPolicyId_SupportControllerRepository;

@Service
public class SetCreditOpeningByPolicyId_SupportControllerService {

	@Autowired
	private SetCreditOpeningByPolicyId_SupportControllerRepository setCreditOpeningByPolicyId_SupportControllerRepository;
	
	public Optional<PolicyFundSummary> findByPolicyId(long policyId){
		return setCreditOpeningByPolicyId_SupportControllerRepository.findByPolicyId(policyId);
	}
	
	public PolicyFundSummary save(PolicyFundSummary policyFundSummary){
		return setCreditOpeningByPolicyId_SupportControllerRepository.save(policyFundSummary);
	}
}