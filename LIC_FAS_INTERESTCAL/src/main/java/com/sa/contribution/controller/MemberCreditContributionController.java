package com.sa.contribution.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.contribution.model.MemberCreditContribution;
import com.sa.contribution.service.MemberCreditContributionService;

@RestController
@RequestMapping("/member-credit-contribution")
public class MemberCreditContributionController {
	
	@Autowired
	private MemberCreditContributionService memberCreditContributionService;
	
	@GetMapping("/{policyNumber}/{financialYear}")
	public ResponseEntity<Optional<MemberCreditContribution>> getMemberCreditContributionByPolicyNumberAndFinancialYear(@PathVariable String policyNumber, @PathVariable String financialYear) {
		return ResponseEntity.ok(memberCreditContributionService.getMemberCreditContributionByPolicyNumberAndFinancialYear(policyNumber, financialYear));
	}
	
	@PostMapping
	public ResponseEntity<MemberCreditContribution> saveMemberCreditContribution(@Valid @RequestBody MemberCreditContribution memberCreditContribution) {
		return ResponseEntity.ok(memberCreditContributionService.saveMemberCreditContribution(memberCreditContribution));
	}
	
	@DeleteMapping("/{policyNumber}/{financialYear}")
	public ResponseEntity<Void> deleteMemberCreditContributionByPolicyNumberAndFinancialYear(@PathVariable String policyNumber, @PathVariable String financialYear) {
		memberCreditContributionService.deleteMemberCreditContributionByPolicyNumberAndFinancialYear(policyNumber, financialYear);
		return ResponseEntity.ok().build();
	}
	
}