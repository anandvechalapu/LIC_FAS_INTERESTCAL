package com.sa.fund.interest.controller.policybatchcontroller.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.fund.interest.controller.policybatchcontroller.dto.BatchRequestDto;
import com.sa.fund.interest.controller.policybatchcontroller.dto.DataTable;
import com.sa.fund.interest.controller.policybatchcontroller.dto.PolicyFundHistoryDto;
import com.sa.fund.interest.controller.policybatchcontroller.repository.ViewPolicyTransactionHistory_PolicyBatchControllerRepository;

@Service
public class ViewPolicyTransactionHistory_PolicyBatchControllerService {

    @Autowired
    ViewPolicyTransactionHistory_PolicyBatchControllerRepository viewPolicyTransactionHistory_PolicyBatchControllerRepository;

    public DataTable viewPolicyTransactionHistory(long summStmtId) {
        List<PolicyFundHistoryDto> policyFundHistoryDtoList = new ArrayList<>();
        //Code to view the transaction history for a policy fund summary based on its ID and populate the list of PolicyFundHistoryDto objects
        DataTable dataTable = new DataTable();
        dataTable.setResult(policyFundHistoryDtoList);
        return dataTable;
    }
}