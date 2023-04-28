package com.sa.fund.interest.controller.membersearchcontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TransactionHistory {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long memberId;
    private Double amount;
    private String type;
    
    public TransactionHistory() {}
    
    public TransactionHistory(Long memberId, Double amount, String type) {
        this.memberId = memberId;
        this.amount = amount;
        this.type = type;
    }
    
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public Long getMemberId() {
        return memberId;
    }
 
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }
 
    public Double getAmount() {
        return amount;
    }
 
    public void setAmount(Double amount) {
        this.amount = amount;
    }
 
    public String getType() {
        return type;
    }
 
    public void setType(String type) {
        this.type = type;
    }
}