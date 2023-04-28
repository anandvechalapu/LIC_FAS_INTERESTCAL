package com.sa.fund.interest.controller.memberbatchcontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.fund.interest.controller.memberbatchcontroller.dto.MemberFundHistoryDto;
import com.sa.fund.interest.controller.memberbatchcontroller.entity.MemberFundStmtV2Entity;
import com.sa.fund.interest.controller.memberbatchcontroller.repository.ViewMemberTransactionHistoryRepository;

@Service
public class ViewMemberTransactionHistoryService {
	
	@Autowired
	private ViewMemberTransactionHistoryRepository viewMemberTransactionHistoryRepository;
	
	//Method to fetch MemberFundHistoryDto by summStmtId from MemberFundStmtV2Entity
	public List<MemberFundHistoryDto> getMemberFundHistoryBySummStmtId(Integer summStmtId) {
		return viewMemberTransactionHistoryRepository.findBySummStmtId(summStmtId);
	}

}