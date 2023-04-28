package com.sa.fund.interest.controller.membersearchcontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "debit_fund_transaction")
public class DebitFundTransaction {
 
    @Id
    private Long id;
    private String policyNo;
    private String memberId;
    private Double amount;
    private String txnType;
    private Boolean isActive;
    private Long effectiveTxnDate;

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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getTxnType() {
        return txnType;
    }

    public void setTxnType(String txnType) {
        this.txnType = txnType;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Long getEffectiveTxnDate() {
        return effectiveTxnDate;
    }

    public void setEffectiveTxnDate(Long effectiveTxnDate) {
        this.effectiveTxnDate = effectiveTxnDate;
    }

}