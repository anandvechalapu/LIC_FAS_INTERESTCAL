package com.sa.fund.master.fundmastercontroller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FUND_INTEREST_SLAB_MST")
public class FundInterestSlabMst {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Long id;

    @Column(name = "FUND_ID")
    private Long fundId;

    @Column(name = "INTEREST_RATE_SLAB")
    private Double interestRateSlab;

    @Column(name = "VALID_FROM_DATE")
    private String validFromDate;

    @Column(name = "VALID_TO_DATE")
    private String validToDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFundId() {
        return fundId;
    }

    public void setFundId(Long fundId) {
        this.fundId = fundId;
    }

    public Double getInterestRateSlab() {
        return interestRateSlab;
    }

    public void setInterestRateSlab(Double interestRateSlab) {
        this.interestRateSlab = interestRateSlab;
    }

    public String getValidFromDate() {
        return validFromDate;
    }

    public void setValidFromDate(String validFromDate) {
        this.validFromDate = validFromDate;
    }

    public String getValidToDate() {
        return validToDate;
    }

    public void setValidToDate(String validToDate) {
        this.validToDate = validToDate;
    }

}