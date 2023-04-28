package com.sa.fund.interest.integration.report.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.fund.interest.integration.report.model.DownloadMemberFundStatementReport;
import com.sa.fund.interest.integration.report.repository.DownloadMemberFundStatement_reportRepository;

@Service
public class DownloadMemberFundStatement_reportService {

    @Autowired
    DownloadMemberFundStatement_reportRepository repository;
    
    public DownloadMemberFundStatementReport findByPolicyIdAndMemberId(String policyId, String memberId) {
        return repository.findByPolicyIdAndMemberId(policyId, memberId);
    }
    
}