package com.sa.fund.interest.integration.fundpolicyservicecontroller.model;
 
import javax.persistence.Entity;
import javax.persistence.Id;
 
@Entity
public class FundPolicyService {
 
    @Id
    private String serviceId;
    private String policyName;
    private String description;
 
    public String getServiceId() {
        return serviceId;
    }
 
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
 
    public String getPolicyName() {
        return policyName;
    }
 
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
 
    public String getDescription() {
        return description;
    }
 
    public void setDescription(String description) {
        this.description = description;
    }
 
    public Map<String, String> processPolicy(FundChangeDto fundChangeDto) {
        // implementation
    }
}