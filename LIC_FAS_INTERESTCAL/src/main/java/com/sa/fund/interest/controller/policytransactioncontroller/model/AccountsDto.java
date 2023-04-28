package com.sa.fund.interest.controller.policytransactioncontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountsDto {

	@Id
	private Long policyId;
	private Double txnAmount;
	private String effectiveTxnDate;
	private String txnSubType;

	public Long getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Long policyId) {
		this.policyId = policyId;
	}

	public Double getTxnAmount() {
		return txnAmount;
	}

	public void setTxnAmount(Double txnAmount) {
		this.txnAmount = txnAmount;
	}

	public String getEffectiveTxnDate() {
		return effectiveTxnDate;
	}

	public void setEffectiveTxnDate(String effectiveTxnDate) {
		this.effectiveTxnDate = effectiveTxnDate;
	}

	public String getTxnSubType() {
		return txnSubType;
	}

	public void setTxnSubType(String txnSubType) {
		this.txnSubType = txnSubType;
	}
}