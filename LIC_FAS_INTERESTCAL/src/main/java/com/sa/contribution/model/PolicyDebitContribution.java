package com.sa.contribution.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PolicyDebitContribution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String debitRequest;

    private String debitTransactionLog;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDebitRequest() {
        return debitRequest;
    }

    public void setDebitRequest(String debitRequest) {
        this.debitRequest = debitRequest;
    }

    public String getDebitTransactionLog() {
        return debitTransactionLog;
    }

    public void setDebitTransactionLog(String debitTransactionLog) {
        this.debitTransactionLog = debitTransactionLog;
    }
}