package com.sa.fund.interest.integration.report.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.integration.report.model.DownloadMemberFundStatementReport;
import com.sa.fund.interest.integration.report.service.DownloadMemberFundStatement_reportService;

@RestController
@RequestMapping("/download_member_fund_statement_report")
public class DownloadMemberFundStatement_reportController {

    @Autowired
    DownloadMemberFundStatement_reportService service;

    @GetMapping("/{policyId}/{memberId}")
    public ResponseEntity<DownloadMemberFundStatementReport> getByPolicyIdAndMemberId(@PathVariable String policyId, @PathVariable String memberId) {
        DownloadMemberFundStatementReport report = service.findByPolicyIdAndMemberId(policyId, memberId);
        return ResponseEntity.ok(report);
    }
}