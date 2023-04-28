package com.sa.fund.interest.integration.supportcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sa.fund.interest.integration.supportcontroller.entity.PolicyFundSummary;

public interface SetCreditOpeningByPolicyId_SupportControllerRepository extends JpaRepository<PolicyFundSummary, Long> {

	public PolicyFundSummary findByPolicyId(long policyId);
	
	public PolicyFundSummary save(PolicyFundSummary policyFundSummary);

}