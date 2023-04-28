package com.sa.fund.interest.controller.memberbatchcontroller.service;

import com.sa.fund.interest.controller.memberbatchcontroller.dto.BatchDto;
import com.sa.fund.interest.controller.memberbatchcontroller.dto.FundBatchResponseDto;
import com.sa.fund.interest.controller.memberbatchcontroller.dto.FundResponseDetailsDto;
import com.sa.fund.interest.controller.memberbatchcontroller.repository.MemberBatchExecution_MemberBatchControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MemberBatchExecution_MemberBatchControllerService {
 
    @Autowired
    private MemberBatchExecution_MemberBatchControllerRepository repository;
 
    public ResponseEntity<FundBatchResponseDto> executeMemberBatch(BatchDto batchDto) {
        return repository.executeMemberBatch(batchDto);
    }
 
    public Map<String, Map<String, FundResponseDetailsDto>> getExecutionResults(String batchNumber) {
        return repository.getExecutionResults(batchNumber);
    }
 
}