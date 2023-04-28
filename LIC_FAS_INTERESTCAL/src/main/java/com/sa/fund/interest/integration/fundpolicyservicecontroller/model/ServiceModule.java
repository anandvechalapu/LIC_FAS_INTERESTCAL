// Entity/Model class
package com.sa.fund.interest.integration.fundpolicyservicecontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ServiceModule {

    @Id
    private Long serviceId;
    private String serviceName;
    private String serviceDescription;
    private Long sourcePolicyId;
    private Long destinationPolicyId;

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public Long getSourcePolicyId() {
        return sourcePolicyId;
    }

    public void setSourcePolicyId(Long sourcePolicyId) {
        this.sourcePolicyId = sourcePolicyId;
    }

    public Long getDestinationPolicyId() {
        return destinationPolicyId;
    }

    public void setDestinationPolicyId(Long destinationPolicyId) {
        this.destinationPolicyId = destinationPolicyId;
    }
}