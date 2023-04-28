package com.sa.fund.interest.controller.memberbatchcontroller.model;

import java.util.Map;

import org.springframework.http.ResponseEntity;

public class FundBatchResponseDto {

    private String batchNumber;
    private Map<String, Map<String, FundResponseDetailsDto>> executionResults;

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public Map<String, Map<String, FundResponseDetailsDto>> getExecutionResults() {
        return executionResults;
    }

    public void setExecutionResults(Map<String, Map<String, FundResponseDetailsDto>> executionResults) {
        this.executionResults = executionResults;
    }

}

public class FundResponseDetailsDto {
    private String fundNumber;
    private String fundName;
    private String fundStatus;

    public String getFundNumber() {
        return fundNumber;
    }

    public void setFundNumber(String fundNumber) {
        this.fundNumber = fundNumber;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getFundStatus() {
        return fundStatus;
    }

    public void setFundStatus(String fundStatus) {
        this.fundStatus = fundStatus;
    }
}

public class BatchDto {
    private String batchNumber;
    private Map<String, String> funds;

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public Map<String, String> getFunds() {
        return funds;
    }

    public void setFunds(Map<String, String> funds) {
        this.funds = funds;
    }
}