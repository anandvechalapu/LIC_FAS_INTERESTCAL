package com.sa.fund.interest.controller.membersearchcontroller.controller;

import com.sa.fund.interest.controller.membersearchcontroller.service.ViewHistoryByMemberIdMemberSearchControllerService;
import com.sa.fund.interest.entity.TransactionHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ViewHistoryByMemberIdMemberSearchController {

    @Autowired
    private ViewHistoryByMemberIdMemberSearchControllerService viewHistoryByMemberIdMemberSearchControllerService;

    @GetMapping("/members/{memberId}/transactions")
    public ResponseEntity<List<TransactionHistory>> viewHistoryByMemberId(@PathVariable Long memberId){
        List<TransactionHistory> transactionHistoryList = viewHistoryByMemberIdMemberSearchControllerService.getTransactionHistoryByMemberId(memberId);
        return ResponseEntity.ok(transactionHistoryList);
    }
}