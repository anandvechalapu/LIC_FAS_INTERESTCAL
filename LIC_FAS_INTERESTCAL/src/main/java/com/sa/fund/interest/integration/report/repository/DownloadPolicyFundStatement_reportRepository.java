package com.sa.fund.interest.integration.report.repository; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DownloadPolicyFundStatement_reportRepository extends JpaRepository<DownloadPolicyFundStatement_report, Long>{

    // Get method to fetch policy details by policyId and memberId
    DownloadPolicyFundStatement_report getByPolicyIdAndMemberId(Long policyId, Long memberId);

    // Method to generate CSV file for the specified policy and member
    byte[] generateCSVFile(Long policyId, Long memberId);

}