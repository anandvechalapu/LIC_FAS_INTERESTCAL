package com.sa.contribution.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.contribution.entity.MemberCreditContribution;
import com.sa.contribution.repository.MemberCreditContributionRepository;

@Service
public class MemberCreditContributionService {
	
	@Autowired
	MemberCreditContributionRepository memberCreditContributionRepository;
	
	public Optional<MemberCreditContribution> getMemberCreditContributionByPolicyNumberAndFinancialYear(String policyNumber, String financialYear) {
		return memberCreditContributionRepository.findByPolicyNumberAndFinancialYear(policyNumber, financialYear);
	}
	
	public MemberCreditContribution saveMemberCreditContribution(MemberCreditContribution memberCreditContribution) {
		return memberCreditContributionRepository.save(memberCreditContribution);
	}
	
	public void deleteMemberCreditContributionByPolicyNumberAndFinancialYear(String policyNumber, String financialYear) {
		memberCreditContributionRepository.deleteByPolicyNumberAndFinancialYear(policyNumber, financialYear);
	}

}