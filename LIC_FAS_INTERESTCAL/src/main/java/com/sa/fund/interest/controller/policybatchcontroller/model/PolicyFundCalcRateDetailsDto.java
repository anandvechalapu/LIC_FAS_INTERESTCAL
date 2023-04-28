package com.sa.fund.interest.controller.policybatchcontroller.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="policy_fund_calc_rate_details")
public class PolicyFundCalcRateDetailsDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="transaction_id")
    private Long transactionId;

    @Column(name="policy_id")
    private Long policyId;

    @Column(name="fund_id")
    private Long fundId;

    @Column(name="amount_allocated")
    private Double amountAllocated;

    @Column(name="interest_rate")
    private Double interestRate;

    @Column(name="fund_name")
    private String fundName;

    @Column(name="fund_type")
    private String fundType;

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public Long getFundId() {
        return fundId;
    }

    public void setFundId(Long fundId) {
        this.fundId = fundId;
    }

    public Double getAmountAllocated() {
        return amountAllocated;
    }

    public void setAmountAllocated(Double amountAllocated) {
        this.amountAllocated = amountAllocated;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

}