package com.sa.fund.interest.integration.report.model;

import javax.persistence.*;

@Entity
@Table(name = "download_member_fund_statement_report")
public class DownloadMemberFundStatementReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String policyId;
    private String memberId;
    private String fundName;
    private double fundValue;
    private double avgAllocation;
    private double fundInterest;
    private double fundReturn;
    
    public DownloadMemberFundStatementReport() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public double getFundValue() {
        return fundValue;
    }

    public void setFundValue(double fundValue) {
        this.fundValue = fundValue;
    }

    public double getAvgAllocation() {
        return avgAllocation;
    }

    public void setAvgAllocation(double avgAllocation) {
        this.avgAllocation = avgAllocation;
    }

    public double getFundInterest() {
        return fundInterest;
    }

    public void setFundInterest(double fundInterest) {
        this.fundInterest = fundInterest;
    }

    public double getFundReturn() {
        return fundReturn;
    }

    public void setFundReturn(double fundReturn) {
        this.fundReturn = fundReturn;
    }

}