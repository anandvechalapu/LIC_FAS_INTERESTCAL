package com.sa.fund.interest.controller.policytransactioncontroller.model;

import javax.persistence.*;

@Entity
@Table(name = "policy_fund_history_v2")
public class PolicyFundHistoryV2Model {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "account_id")
    private String accountId;

    @Column(name = "status")
    private String status;

    @Column(name = "status_id")
    private int statusId;

    @Column(name = "error_message")
    private String errorMessage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}