package com.sa.fund.interest.integration.report.service;

import com.sa.fund.interest.integration.report.repository.DownloadPolicyFundStatement_reportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;

@Service
public class DownloadPolicyFundStatement_reportService {

    @Autowired
    private DownloadPolicyFundStatement_reportRepository downloadPolicyFundStatement_reportRepository;

    public DownloadPolicyFundStatement_report getByPolicyIdAndMemberId(Long policyId, Long memberId) {
        return downloadPolicyFundStatement_reportRepository.getByPolicyIdAndMemberId(policyId, memberId);
    }

    public ByteArrayOutputStream generateCSVFile(Long policyId, Long memberId) {
        return downloadPolicyFundStatement_reportRepository.generateCSVFile(policyId, memberId);
    }
}