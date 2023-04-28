//Model Class
package com.sa.fund.interest.controller.policybatchcontroller.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.sa.fund.interest.exception.RequiredFieldException;

@Entity
public class BatchRequestDto {

    @Id
    private Long policyId;
    private Long summaryStatementId;
    private Date tranFromDate;
    private Date tranToDate;
    private Date batchDate;
    private Double interestRate;
    private String currentQuarter;

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public Long getSummaryStatementId() {
        return summaryStatementId;
    }

    public void setSummaryStatementId(Long summaryStatementId) {
        this.summaryStatementId = summaryStatementId;
    }

    public Date getTranFromDate() {
        return tranFromDate;
    }

    public void setTranFromDate(Date tranFromDate) {
        this.tranFromDate = tranFromDate;
    }

    public Date getTranToDate() {
        return tranToDate;
    }

    public void setTranToDate(Date tranToDate) {
        this.tranToDate = tranToDate;
    }

    public Date getBatchDate() {
        return batchDate;
    }

    public void setBatchDate(Date batchDate) {
        this.batchDate = batchDate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public String getCurrentQuarter() {
        return currentQuarter;
    }

    public void setCurrentQuarter(String currentQuarter) {
        this.currentQuarter = currentQuarter;
    }

    public DataTable findByPolicyIdAndSummaryStatementId() throws RequiredFieldException {
        return null;
    }

}