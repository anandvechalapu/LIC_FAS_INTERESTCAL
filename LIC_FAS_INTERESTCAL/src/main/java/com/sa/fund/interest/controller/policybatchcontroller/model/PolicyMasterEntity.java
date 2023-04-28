// Entity/Model class
package com.sa.fund.interest.controller.policybatchcontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policy_master")
public class PolicyMasterEntity {
    @Id
    private int policyId;
    private String policyNumber;
    private String trnxDate;
    private String variant;
    private String policyType;
    private boolean isBatch;
    private boolean isAuto;
    private boolean setOpeningBalance;
    private boolean recalculate;
    private String licId;

    public int getPolicyId() {
        return policyId;
    }

    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getTrnxDate() {
        return trnxDate;
    }

    public void setTrnxDate(String trnxDate) {
        this.trnxDate = trnxDate;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public boolean isBatch() {
        return isBatch;
    }

    public void setBatch(boolean batch) {
        isBatch = batch;
    }

    public boolean isAuto() {
        return isAuto;
    }

    public void setAuto(boolean auto) {
        isAuto = auto;
    }

    public boolean isSetOpeningBalance() {
        return setOpeningBalance;
    }

    public void setSetOpeningBalance(boolean setOpeningBalance) {
        this.setOpeningBalance = setOpeningBalance;
    }

    public boolean isRecalculate() {
        return recalculate;
    }

    public void setRecalculate(boolean recalculate) {
        this.recalculate = recalculate;
    }

    public String getLicId() {
        return licId;
    }

    public void setLicId(String licId) {
        this.licId = licId;
    }
}