// ClaimDto.java

package com.sa.fund.interest.integration.supportcontroller.dto;

import java.time.LocalDateTime;

public class ClaimDto {

    private String stream;
    private Long policyId;
    private String module;
    private LocalDateTime transactionDate;
    private Long licId;
    private Long memberId;
    private Double transactionAmount;
    private Double purchasePrice;
    private Double commutationAmount;
    private LocalDateTime dateOfExit;
    private String username;
    private LocalDateTime createdOn;
    private Long unitId;
    private Double entryClosingBalance;
    private Boolean isActive;
    private Boolean isExit;
    private Double summaryClosingBalance;
    private LocalDateTime statementDate;
    private String batchStatus;
    private String batchNumber;

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Long getLicId() {
        return licId;
    }

    public void setLicId(Long licId) {
        this.licId = licId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Double getCommutationAmount() {
        return commutationAmount;
    }

    public void setCommutationAmount(Double commutationAmount) {
        this.commutationAmount = commutationAmount;
    }

    public LocalDateTime getDateOfExit() {
        return dateOfExit;
    }

    public void setDateOfExit(LocalDateTime dateOfExit) {
        this.dateOfExit = dateOfExit;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public Long getUnitId() {
        return unitId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public Double getEntryClosingBalance() {
        return entryClosingBalance;
    }

    public void setEntryClosingBalance(Double entryClosingBalance) {
        this.entryClosingBalance = entryClosingBalance;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getExit() {
        return isExit;
    }

    public void setExit(Boolean exit) {
        isExit = exit;
    }

    public Double getSummaryClosingBalance() {
        return summaryClosingBalance;
    }

    public void setSummaryClosingBalance(Double summaryClosingBalance) {
        this.summaryClosingBalance = summaryClosingBalance;
    }

    public LocalDateTime getStatementDate() {
        return statementDate;
    }

    public void setStatementDate(LocalDateTime statementDate) {
        this.statementDate = statementDate;
    }

    public String getB