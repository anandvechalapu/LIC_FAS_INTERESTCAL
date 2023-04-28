package com.sa.contribution.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MemberDebitContribution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int memberId;
    private int debitAmount;
    private String reason;
    private String status;

    public MemberDebitContribution() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(int debitAmount) {
        this.debitAmount = debitAmount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}