package com.sa.fund.interest.integration.fundintegrationcontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MemberTransferOutIn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String memberName;
    private String fundName;
    private String transferOutIn;
    private double amount;
    
    public MemberTransferOutIn() {}
    
    public MemberTransferOutIn(String memberName, String fundName, String transferOutIn, double amount) {
        this.memberName = memberName;
        this.fundName = fundName;
        this.transferOutIn = transferOutIn;
        this.amount = amount;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getMemberName() {
        return memberName;
    }
    
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    
    public String getFundName() {
        return fundName;
    }
    
    public void setFundName(String fundName) {
        this.fundName = fundName;
    }
    
    public String getTransferOutIn() {
        return transferOutIn;
    }
    
    public void setTransferOutIn(String transferOutIn) {
        this.transferOutIn = transferOutIn;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
}