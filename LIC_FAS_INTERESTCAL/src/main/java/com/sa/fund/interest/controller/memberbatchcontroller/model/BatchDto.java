package com.sa.fund.interest.controller.memberbatchcontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BatchDto {
    
    @Id
    private Long policyId;
    private Long licId;
    
    public BatchDto() {
        
    }
    
    public BatchDto(Long policyId, Long licId) {
        this.policyId = policyId;
        this.licId = licId;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public Long getLicId() {
        return licId;
    }

    public void setLicId(Long licId) {
        this.licId = licId;
    }

}