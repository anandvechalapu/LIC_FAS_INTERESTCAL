// Entity/Model class
package com.sa.fund.master.fundmastercontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class FundInterestRateSlabMst {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    private String fundName;
    
    @NotNull
    private String fundType;
    
    @NotNull
    private String slabName;
    
    @NotNull
    private String slabRate;
    
    @NotNull
    private String slabFrom;
    
    @NotNull
    private String slabTo;
    
    @NotNull
    private String slabStatus;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getFundName() {
        return fundName;
    }
    
    public void setFundName(String fundName) {
        this.fundName = fundName;
    }
    
    public String getFundType() {
        return fundType;
    }
    
    public void setFundType(String fundType) {
        this.fundType = fundType;
    }
    
    public String getSlabName() {
        return slabName;
    }
    
    public void setSlabName(String slabName) {
        this.slabName = slabName;
    }
    
    public String getSlabRate() {
        return slabRate;
    }
    
    public void setSlabRate(String slabRate) {
        this.slabRate = slabRate;
    }
    
    public String getSlabFrom() {
        return slabFrom;
    }
    
    public void setSlabFrom(String slabFrom) {
        this.slabFrom = slabFrom;
    }
    
    public String getSlabTo() {
        return slabTo;
    }
    
    public void setSlabTo(String slabTo) {
        this.slabTo = slabTo;
    }
    
    public String getSlabStatus() {
        return slabStatus;
    }
    
    public void setSlabStatus(String slabStatus) {
        this.slabStatus = slabStatus;
    }
    
}