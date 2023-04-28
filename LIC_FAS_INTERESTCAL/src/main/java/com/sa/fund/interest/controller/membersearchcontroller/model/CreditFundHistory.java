package com.sa.fund.interest.controller.membersearchcontroller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "credit_fund_history")
public class CreditFundHistory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "policy_no")
	private String policyNo;
	
	@Column(name = "member_id")
	private String memberId;
	
	@Column(name = "amount_invested")
	private Double amountInvested;
	
	@Column(name = "interest_earned")
	private Double interestEarned;
	
	public CreditFundHistory() {
		
	}
	
	public CreditFundHistory(String policyNo, String memberId, Double amountInvested, Double interestEarned) {
		this.policyNo = policyNo;
		this.memberId = memberId;
		this.amountInvested = amountInvested;
		this.interestEarned = interestEarned;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public Double getAmountInvested() {
		return amountInvested;
	}

	public void setAmountInvested(Double amountInvested) {
		this.amountInvested = amountInvested;
	}

	public Double getInterestEarned() {
		return interestEarned;
	}

	public void setInterestEarned(Double interestEarned) {
		this.interestEarned = interestEarned;
	}
	
	
}