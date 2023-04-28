//Spring Boot Controller Class
package com.sa.fund.interest.controller.policybatchcontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.controller.policybatchcontroller.dto.BatchRequestDto;
import com.sa.fund.interest.controller.policybatchcontroller.dto.InterestFundResponseDto;
import com.sa.fund.interest.controller.policybatchcontroller.exception.RequiredFieldException;
import com.sa.fund.interest.controller.policybatchcontroller.model.DataTable;
import com.sa.fund.interest.controller.policybatchcontroller.service.ViewPolicyFmcRatesPolicyBatchControllerService;

@RestController
@RequestMapping("/batch")
public class ViewPolicyFmcRatesPolicyBatchController {

    @Autowired
    private ViewPolicyFmcRatesPolicyBatchControllerService viewPolicyFmcRatesPolicyBatchControllerService;
    
    @PostMapping("/search")
    public DataTable findByPolicyIdAndSummaryStatementId(@RequestBody BatchRequestDto batchRequestDto) throws RequiredFieldException {
        return viewPolicyFmcRatesPolicyBatchControllerService.findByPolicyIdAndSummaryStatementId(batchRequestDto.getPolicyId(), batchRequestDto.getSummaryStatementId());
    }
    
    @GetMapping("/list")
    public List<InterestFundResponseDto> findByTranFromDateAndTranToDateAndBatchDateAndInterestRateAndCurrentQuarter(BatchRequestDto batchRequestDto) {
        return viewPolicyFmcRatesPolicyBatchControllerService.findByTranFromDateAndTranToDateAndBatchDateAndInterestRateAndCurrentQuarter(batchRequestDto.getTranFromDate(), batchRequestDto.getTranToDate(), batchRequestDto.getBatchDate(), batchRequestDto.getInterestRate(), batchRequestDto.getCurrentQuarter());
    }

}