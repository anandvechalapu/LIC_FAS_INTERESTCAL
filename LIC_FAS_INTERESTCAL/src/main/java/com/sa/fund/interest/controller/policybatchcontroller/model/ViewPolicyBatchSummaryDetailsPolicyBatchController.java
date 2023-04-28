package com.sa.fund.interest.controller.policybatchcontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ViewPolicyBatchSummaryDetailsPolicyBatchController {

    @Id
    private Long id;
    private String batchNumber;
    private String batchDate;
    private String financialYear;
    private String remarks;
    private String batchType;
    private String currentQuarter;
    private Long policyId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getBatchDate() {
        return batchDate;
    }

    public void setBatchDate(String batchDate) {
        this.batchDate = batchDate;
    }

    public String getFinancialYear() {
        return financialYear;
    }

    public void setFinancialYear(String financialYear) {
        this.financialYear = financialYear;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getBatchType() {
        return batchType;
    }

    public void setBatchType(String batchType) {
        this.batchType = batchType;
    }

    public String getCurrentQuarter() {
        return currentQuarter;
    }

    public void setCurrentQuarter(String currentQuarter) {
        this.currentQuarter = currentQuarter;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }
}