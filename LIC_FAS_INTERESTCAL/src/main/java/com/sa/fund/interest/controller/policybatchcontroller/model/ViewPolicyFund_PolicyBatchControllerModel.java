package com.sa.fund.interest.controller.policybatchcontroller.model;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

public class ViewPolicyFund_PolicyBatchControllerModel {
    private BatchDto batchDto;
    private List<InterestFundResponseDto> list;
    private CommonResponseDto response;
    
    public BatchDto getBatchDto() {
        return batchDto;
    }
    
    public void setBatchDto(@Valid BatchDto batchDto) {
        this.batchDto = batchDto;
    }
    
    public List<InterestFundResponseDto> getList() {
        return list;
    }
    
    public void setList(List<InterestFundResponseDto> list) {
        this.list = list;
    }
    
    public CommonResponseDto getResponse() {
        return response;
    }
    
    public void setResponse(CommonResponseDto response) {
        this.response = response;
    }
    
    public ResponseEntity<CommonResponseDto> viewPolicyFund(@Valid BatchDto batchDto) {
        try {
            validateBatchDtoObject(batchDto);
            list = generateResponse(batchDto);
            response.setData(list);
            logResponse(response);
        } catch (Exception e) {
            response = generateErrorResponse(e);
            logError(e);
        }
        return ResponseEntity.ok().body(response);
    }
    
    public void validateBatchDtoObject(@Valid BatchDto batchDto) throws Exception {
        
    }
    
    public CommonResponseDto generateErrorResponse(Exception e) {
        return null;
    }
    
    public InterestFundResponseDto generateResponse(BatchDto batchDto) throws Exception {
        return null;
    }
    
    public void logResponse(CommonResponseDto response) {
        
    }
    
    public void logError(Exception e) {
        
    }
    
    
}