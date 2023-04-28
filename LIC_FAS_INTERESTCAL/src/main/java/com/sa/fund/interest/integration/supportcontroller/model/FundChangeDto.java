package com.sa.fund.interest.integration.supportcontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FundChangeDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String service_id;
    private String source_policy_id;
    private String destination_policy_id;
    
    public FundChangeDto(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getService_id() {
        return service_id;
    }

    public void setService_id(String service_id) {
        this.service_id = service_id;
    }

    public String getSource_policy_id() {
        return source_policy_id;
    }

    public void setSource_policy_id(String source_policy_id) {
        this.source_policy_id = source_policy_id;
    }

    public String getDestination_policy_id() {
        return destination_policy_id;
    }

    public void setDestination_policy_id(String destination_policy_id) {
        this.destination_policy_id = destination_policy_id;
    }
}