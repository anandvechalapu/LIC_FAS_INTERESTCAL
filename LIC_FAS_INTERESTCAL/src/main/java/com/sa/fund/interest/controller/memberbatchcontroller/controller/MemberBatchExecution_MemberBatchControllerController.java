package com.sa.fund.interest.controller.memberbatchcontroller.controller;

import com.sa.fund.interest.controller.memberbatchcontroller.dto.BatchDto;
import com.sa.fund.interest.controller.memberbatchcontroller.dto.FundBatchResponseDto;
import com.sa.fund.interest.controller.memberbatchcontroller.service.MemberBatchExecution_MemberBatchControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/batch")
public class MemberBatchExecution_MemberBatchControllerController {
 
    @Autowired
    private MemberBatchExecution_MemberBatchControllerService service;
 
    @PostMapping
    public ResponseEntity<FundBatchResponseDto> executeMemberBatch(@RequestBody BatchDto batchDto) {
        return service.executeMemberBatch(batchDto);
    }
 
    @GetMapping
    public Map<String, Map<String, FundResponseDetailsDto>> getExecutionResults(@RequestParam String batchNumber) {
        return service.getExecutionResults(batchNumber);
    }
}