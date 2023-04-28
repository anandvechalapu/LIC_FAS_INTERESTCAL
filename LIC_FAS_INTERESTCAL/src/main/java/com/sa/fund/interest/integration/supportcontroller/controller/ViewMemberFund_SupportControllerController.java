package com.sa.fund.interest.integration.supportcontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.integration.supportcontroller.BatchDto;
import com.sa.fund.interest.integration.supportcontroller.CommonResponseDto;
import com.sa.fund.interest.integration.supportcontroller.InterestFundResponseDto;
import com.sa.fund.interest.integration.supportcontroller.service.ViewMemberFund_SupportControllerService;

@RestController
@RequestMapping("/member")
public class ViewMemberFund_SupportControllerController {
    
    @Autowired
    private ViewMemberFund_SupportControllerService service;

    @PostMapping("/view")
    public ResponseEntity<CommonResponseDto<InterestFundResponseDto>> viewMemberFund(@RequestBody BatchDto batchDto) {
        return ResponseEntity.ok(service.viewMemberFund(batchDto));
    }
    
    @PostMapping("/view/batch")
    public ResponseEntity<List<InterestFundResponseDto>> viewMemberBatchByPolicyId(@RequestBody Long policyId, boolean isBatch) {
        return ResponseEntity.ok(service.viewMemberBatchByPolicyId(policyId, isBatch));
    }
    
    @GetMapping("/find")
    public void findMemberDetails() {
        service.findMemberDetails();
    }

}