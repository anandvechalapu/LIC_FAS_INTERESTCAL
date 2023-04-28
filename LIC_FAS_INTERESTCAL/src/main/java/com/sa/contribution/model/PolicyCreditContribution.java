package com.sa.contribution.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "policy_credit_contribution")
public class PolicyCreditContribution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long policyId;
    private String policyNumber;
    @ElementCollection
    private List<Long> contributionIds;
    private String financialYear;
    private Date effectiveTxnDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public List<Long> getContributionIds() {
        return contributionIds;
    }

    public void setContributionIds(List<Long> contributionIds) {
        this.contributionIds = contributionIds;
    }

    public String getFinancialYear() {
        return financialYear;
    }

    public void setFinancialYear(String financialYear) {
        this.financialYear = financialYear;
    }

    public Date getEffectiveTxnDate() {
        return effectiveTxnDate;
    }

    public void setEffectiveTxnDate(Date effectiveTxnDate) {
        this.effectiveTxnDate = effectiveTxnDate;
    }
}