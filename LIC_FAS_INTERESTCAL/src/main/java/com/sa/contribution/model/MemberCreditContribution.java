package com.sa.contribution.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MemberCreditContribution {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String policyNumber;
	private String financialYear;
	private Double totalContribution;
	
	public MemberCreditContribution() {
		
	}
	
	public MemberCreditContribution(String policyNumber, String financialYear, Double totalContribution) {
		this.policyNumber = policyNumber;
		this.financialYear = financialYear;
		this.totalContribution = totalContribution;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getPolicyNumber() {
		return policyNumber;
	}
	
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	
	public String getFinancialYear() {
		return financialYear;
	}
	
	public void setFinancialYear(String financialYear) {
		this.financialYear = financialYear;
	}
	
	public Double getTotalContribution() {
		return totalContribution;
	}
	
	public void setTotalContribution(Double totalContribution) {
		this.totalContribution = totalContribution;
	}
	
	@Override
	public String toString() {
		return "MemberCreditContribution [id=" + id + ", policyNumber=" + policyNumber + ", financialYear="
				+ financialYear + ", totalContribution=" + totalContribution + "]";
	}

}