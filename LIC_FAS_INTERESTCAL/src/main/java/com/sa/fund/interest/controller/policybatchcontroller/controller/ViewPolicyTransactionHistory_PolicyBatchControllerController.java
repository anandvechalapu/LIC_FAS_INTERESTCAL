package com.sa.fund.interest.controller.policybatchcontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.controller.policybatchcontroller.dto.DataTable;
import com.sa.fund.interest.controller.policybatchcontroller.dto.BatchRequestDto;
import com.sa.fund.interest.controller.policybatchcontroller.service.ViewPolicyTransactionHistory_PolicyBatchControllerService;

@RestController
public class ViewPolicyTransactionHistory_PolicyBatchControllerController {

    @Autowired
    ViewPolicyTransactionHistory_PolicyBatchControllerService viewPolicyTransactionHistory_PolicyBatchControllerService;

    @PostMapping("/viewpolicytransactionhistory")
    public DataTable viewPolicyTransactionHistory(@RequestBody BatchRequestDto batchRequestDto) {
        return viewPolicyTransactionHistory_PolicyBatchControllerService.viewPolicyTransactionHistory(batchRequestDto.getSummStmtId());
    }

}