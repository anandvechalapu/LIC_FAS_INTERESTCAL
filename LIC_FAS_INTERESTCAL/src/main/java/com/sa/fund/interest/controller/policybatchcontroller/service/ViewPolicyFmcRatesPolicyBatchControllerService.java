package com.sa.fund.interest.controller.policybatchcontroller.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.fund.interest.controller.policybatchcontroller.dto.BatchRequestDto;
import com.sa.fund.interest.controller.policybatchcontroller.dto.InterestFundResponseDto;
import com.sa.fund.interest.controller.policybatchcontroller.exception.RequiredFieldException;
import com.sa.fund.interest.controller.policybatchcontroller.repository.ViewPolicyFmcRatesPolicyBatchControllerRepository;
import com.sa.fund.interest.controller.policybatchcontroller.util.DataTable;

@Service
public class ViewPolicyFmcRatesPolicyBatchControllerService {

    @Autowired
    private ViewPolicyFmcRatesPolicyBatchControllerRepository viewPolicyFmcRatesPolicyBatchControllerRepository;
    
    public DataTable findByPolicyIdAndSummaryStatementId(Long policyId, Long summaryStatementId) throws RequiredFieldException {
        return viewPolicyFmcRatesPolicyBatchControllerRepository.findByPolicyIdAndSummaryStatementId(policyId, summaryStatementId);
    }

    public List<InterestFundResponseDto> findByTranFromDateAndTranToDateAndBatchDateAndInterestRateAndCurrentQuarter(Date tranFromDate, Date tranToDate, Date batchDate, Double interestRate, String currentQuarter) {
        return viewPolicyFmcRatesPolicyBatchControllerRepository.findByTranFromDateAndTranToDateAndBatchDateAndInterestRateAndCurrentQuarter(tranFromDate, tranToDate, batchDate, interestRate, currentQuarter);
    }

}