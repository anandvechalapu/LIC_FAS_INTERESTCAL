package com.sa.fund.interest.controller.membertransactioncontroller.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MembersDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String memberName;
    
    private Date effectiveDate;
    
    private double interestRate;
    
    private int closingBalance;
    
    private int debitAmount;
    
    private String policy;
    
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
    
    public Date getEffectiveDate() {
        return effectiveDate;
    }
    
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
    
    public double getInterestRate() {
        return interestRate;
    }
    
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
    public int getClosingBalance() {
        return closingBalance;
    }
    
    public void setClosingBalance(int closingBalance) {
        this.closingBalance = closingBalance;
    }
    
    public int getDebitAmount() {
        return debitAmount;
    }
    
    public void setDebitAmount(int debitAmount) {
        this.debitAmount = debitAmount;
    }
    
    public String getPolicy() {
        return policy;
    }
    
    public void setPolicy(String policy) {
        this.policy = policy;
    }
}