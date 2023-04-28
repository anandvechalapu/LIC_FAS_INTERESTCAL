package com.sa.fund.interest.integration.supportcontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PolicyFundSummary {
	@Id
	private long policyId;
	private double totalFund;
	private double totalInterest;
	
	public long getPolicyId() {
		return policyId;
	}
	public void setPolicyId(long policyId) {
		this.policyId = policyId;
	}
	public double getTotalFund() {
		return totalFund;
	}
	public void setTotalFund(double totalFund) {
		this.totalFund = totalFund;
	}
	public double getTotalInterest() {
		return totalInterest;
	}
	public void setTotalInterest(double totalInterest) {
		this.totalInterest = totalInterest;
	}
	
	

}