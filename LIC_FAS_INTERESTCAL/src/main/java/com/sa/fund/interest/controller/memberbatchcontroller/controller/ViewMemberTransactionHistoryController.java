package com.sa.fund.interest.controller.memberbatchcontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.controller.memberbatchcontroller.dto.MemberFundHistoryDto;
import com.sa.fund.interest.controller.memberbatchcontroller.service.ViewMemberTransactionHistoryService;

@RestController
public class ViewMemberTransactionHistoryController {
	
	@Autowired
	ViewMemberTransactionHistoryService viewMemberTransactionHistoryService;
	
	//Controller method to fetch MemberFundHistoryDto by summStmtId from MemberFundStmtV2Entity
	@GetMapping("/membertransactionhistory")
	public ResponseEntity<List<MemberFundHistoryDto>> getMemberFundHistoryBySummStmtId(@RequestParam Integer summStmtId){
		return ResponseEntity.ok(viewMemberTransactionHistoryService.getMemberFundHistoryBySummStmtId(summStmtId));
	}

}