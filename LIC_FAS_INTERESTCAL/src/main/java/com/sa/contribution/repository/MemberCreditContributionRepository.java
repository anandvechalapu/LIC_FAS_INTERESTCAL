package com.sa.contribution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sa.contribution.entity.MemberCreditContribution;

@Repository
public interface MemberCreditContributionRepository extends JpaRepository<MemberCreditContribution, Long>{

	MemberCreditContribution findByPolicyNumberAndFinancialYear(String policyNumber, String financialYear);
	
	MemberCreditContribution save(MemberCreditContribution memberCreditContribution);
	
	void deleteByPolicyNumberAndFinancialYear(String policyNumber, String financialYear);
	
}