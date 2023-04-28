package com.sa.fund.interest.controller.policybatchcontroller.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PolicyTransactionHistory")
public class PolicyTransactionHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long summStmtId;
    
    @Column(name = "transaction_date")
    private Date transactionDate;
    
    @Column(name = "transaction_amount")
    private Double transactionAmount;
    
    @Column(name = "transaction_type")
    private String transactionType;
    
    @Column(name = "transaction_description")
    private String transactionDescription;

    public Long getSummStmtId() {
        return summStmtId;
    }

    public void setSummStmtId(Long summStmtId) {
        this.summStmtId = summStmtId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

}