package com.sa.fund.interest.controller.policysearchcontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PolicySearchControllerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String policyNumber;
    private String financialYear;
    private String policyType;
    private String variant;
    private String trnxDate;
    private String effectiveTxnDate;
    private String quarter;
    private String airAmount;

    public PolicySearchControllerModel() {

    }

    public PolicySearchControllerModel(String policyNumber, String financialYear, String policyType, String variant, String trnxDate, String effectiveTxnDate, String quarter, String airAmount) {
        this.policyNumber = policyNumber;
        this.financialYear = financialYear;
        this.policyType = policyType;
        this.variant = variant;
        this.trnxDate = trnxDate;
        this.effectiveTxnDate = effectiveTxnDate;
        this.quarter = quarter;
        this.airAmount = airAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getFinancialYear() {
        return financialYear;
    }

    public void setFinancialYear(String financialYear) {
        this.financialYear = financialYear;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public String getTrnxDate() {
        return trnxDate;
    }

    public void setTrnxDate(String trnxDate) {
        this.trnxDate = trnxDate;
    }

    public String getEffectiveTxnDate() {
        return effectiveTxnDate;
    }

    public void setEffectiveTxnDate(String effectiveTxnDate) {
        this.effectiveTxnDate = effectiveTxnDate;
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    public String getAirAmount() {
        return airAmount;
    }

    public void setAirAmount(String airAmount) {
        this.airAmount = airAmount;
    }

}