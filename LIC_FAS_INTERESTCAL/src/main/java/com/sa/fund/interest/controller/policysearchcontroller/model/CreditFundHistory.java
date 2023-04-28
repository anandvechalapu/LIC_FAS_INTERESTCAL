package com.sa.fund.interest.controller.policysearchcontroller.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CreditFundHistory")
public class CreditFundHistory {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String policyNo;
	
	private String transactionType;
	
	private Double amount;
	
	@Temporal(TemporalType.DATE)
	private Date effectiveTransactionDate;
	
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
	
	public String getTransactionType() {
		return transactionType;
	}
	
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public Date getEffectiveTransactionDate() {
		return effectiveTransactionDate;
	}
	
	public void setEffectiveTransactionDate(Date effectiveTransactionDate) {
		this.effectiveTransactionDate = effectiveTransactionDate;
	}

}