package com.sa.fund.interest.controller.memberbatchcontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="view_member_transaction_calc_member_batch_controller")
public class ViewMemberTransactionCalc_MemberBatchController {

    @Id
    private Long memberFundTransactionRateDetailsId;
    private Long memberId;
    private Long fundId;
    private Long periodicTransactionRateId;
    private String periodicityType;
    private Double rate;
    private Double amount;
    private Double interest;
    private Integer duration;
    private String startDate;
    private String endDate;
    private Long batchId;
    private String remarks;

    public Long getMemberFundTransactionRateDetailsId() {
        return memberFundTransactionRateDetailsId;
    }

    public void setMemberFundTransactionRateDetailsId(Long memberFundTransactionRateDetailsId) {
        this.memberFundTransactionRateDetailsId = memberFundTransactionRateDetailsId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getFundId() {
        return fundId;
    }

    public void setFundId(Long fundId) {
        this.fundId = fundId;
    }

    public Long getPeriodicTransactionRateId() {
        return periodicTransactionRateId;
    }

    public void setPeriodicTransactionRateId(Long periodicTransactionRateId) {
        this.periodicTransactionRateId = periodicTransactionRateId;
    }

    public String getPeriodicityType() {
        return periodicityType;
    }

    public void setPeriodicityType(String periodicityType) {
        this.periodicityType = periodicityType;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

}