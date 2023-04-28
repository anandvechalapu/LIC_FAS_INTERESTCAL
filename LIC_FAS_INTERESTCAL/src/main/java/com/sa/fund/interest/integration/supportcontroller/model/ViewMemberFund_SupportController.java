package com.sa.fund.interest.integration.supportcontroller.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ViewMemberFund_SupportController")
public class ViewMemberFund_SupportController implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="policy_id")
    private Long policyId;

    @Column(name="batch_id")
    private Long batchId;

    @Column(name="fund_name")
    private String fundName;

    @Column(name="fund_amount")
    private Double fundAmount;

    @Column(name="fund_percentage")
    private Double fundPercentage;

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

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public Double getFundAmount() {
        return fundAmount;
    }

    public void setFundAmount(Double fundAmount) {
        this.fundAmount = fundAmount;
    }

    public Double getFundPercentage() {
        return fundPercentage;
    }

    public void setFundPercentage(Double fundPercentage) {
        this.fundPercentage = fundPercentage;
    }

}