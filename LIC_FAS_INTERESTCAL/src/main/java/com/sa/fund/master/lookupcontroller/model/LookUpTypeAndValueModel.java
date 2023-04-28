package com.sa.fund.master.lookupcontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LookUpTypeAndValueModel {

    @Id
    private Long id;

    private String lookupType;
    private String lookupValue;
    private String description;
    private Boolean isActive;

    public LookUpTypeAndValueModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLookupType() {
        return lookupType;
    }

    public void setLookupType(String lookupType) {
        this.lookupType = lookupType;
    }

    public String getLookupValue() {
        return lookupValue;
    }

    public void setLookupValue(String lookupValue) {
        this.lookupValue = lookupValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}