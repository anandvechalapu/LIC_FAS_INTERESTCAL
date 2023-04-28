package com.sa.fund.interest.integration.report.controller;

import com.sa.fund.interest.integration.report.model.DownloadPolicyFundStatement_report;
import com.sa.fund.interest.integration.report.service.DownloadPolicyFundStatement_reportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;

@RestController
@RequestMapping("/api/v1/report")
public class DownloadPolicyFundStatement_reportController {

    @Autowired
    private DownloadPolicyFundStatement_reportService downloadPolicyFundStatement_reportService;

    @GetMapping("/fundStatement/{policyId}/{memberId}")
    public DownloadPolicyFundStatement_report getByPolicyIdAndMemberId(@PathVariable Long policyId, @PathVariable Long memberId) {
        return downloadPolicyFundStatement_reportService.getByPolicyIdAndMemberId(policyId, memberId);
    }

    @GetMapping("/fundStatement/csv/{policyId}/{memberId}")
    public ByteArrayOutputStream generateCSVFile(@PathVariable Long policyId, @PathVariable Long memberId) {
        return downloadPolicyFundStatement_reportService.generateCSVFile(policyId, memberId);
    }

}