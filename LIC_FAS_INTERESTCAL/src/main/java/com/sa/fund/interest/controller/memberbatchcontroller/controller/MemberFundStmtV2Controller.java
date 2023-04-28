package com.sa.fund.interest.controller.memberbatchcontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.controller.memberbatchcontroller.dto.InterestFundResponseDto;
import com.sa.fund.interest.controller.memberbatchcontroller.service.MemberFundStmtV2Service;

@RestController
@RequestMapping("/member-batch")
public class MemberFundStmtV2Controller {
    
    @Autowired
    private MemberFundStmtV2Service memberFundStmtV2Service;
    
    @GetMapping("/details")
    public ResponseEntity<List<Object[]>> getMemberDetails(){
        List<Object[]> memberDetails = memberFundStmtV2Service.findMemberDetails();
        return new ResponseEntity<>(memberDetails, HttpStatus.OK);
    }
    
    @GetMapping("/interest-fund")
    public ResponseEntity<List<InterestFundResponseDto>> getMemberBatchByPolicyIdAndLicId(@RequestParam("policyId")long policyId, @RequestParam("memberId")long memberId){
        List<InterestFundResponseDto> memberBatchByPolicyIdAndLicId = memberFundStmtV2Service.getMemberBatchByPolicyIdAndLicId(policyId, memberId);
        return new ResponseEntity<>(memberBatchByPolicyIdAndLicId, HttpStatus.OK);
    }
    
    @GetMapping("/interest-fund-all")
    public ResponseEntity<List<InterestFundResponseDto>> getMemberBatchByPolicyId(@RequestParam("policyId")long policyId){
        List<InterestFundResponseDto> memberBatchByPolicyId = memberFundStmtV2Service.getMemberBatchByPolicyId(policyId);
        return new ResponseEntity<>(memberBatchByPolicyId, HttpStatus.OK);
    }
}