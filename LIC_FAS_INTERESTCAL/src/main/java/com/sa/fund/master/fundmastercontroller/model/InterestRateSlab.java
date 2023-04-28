package com.sa.fund.master.fundmastercontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "interest_rate_slab")
public class InterestRateSlab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String product;
    private String financialYear;
    private Number startAmount;
    private Number endAmount;
    private String variant;
    private Number rateOfInterest;
    private Date effectiveStartDate;
    private Date effectiveEndDate;
    private boolean isActive;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getFinancialYear() {
        return financialYear;
    }

    public void setFinancialYear(String financialYear) {
        this.financialYear = financialYear;
    }

    public Number getStartAmount() {
        return startAmount;
    }

    public void setStartAmount(Number startAmount) {
        this.startAmount = startAmount;
    }

    public Number getEndAmount() {
        return endAmount;
    }

    public void setEndAmount(Number endAmount) {
        this.endAmount = endAmount;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public Number getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(Number rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public Date getEffectiveStartDate() {
        return effectiveStartDate;
    }

    public void setEffectiveStartDate(Date effectiveStartDate) {
        this.effectiveStartDate = effectiveStartDate;
    }

    public Date getEffectiveEndDate() {
        return effectiveEndDate;
    }

    public void setEffectiveEndDate(Date effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}