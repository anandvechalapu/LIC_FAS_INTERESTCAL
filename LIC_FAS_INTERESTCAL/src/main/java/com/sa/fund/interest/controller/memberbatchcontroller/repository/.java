package com.sa.fund.interest.controller.memberbatchcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sa.fund.interest.controller.memberbatchcontroller.entity.MemberFundStmtV2;

public interface MemberFundStmtV2Repo extends JpaRepository<MemberFundStmtV2, Long> {
    
    @Query("SELECT DISTINCT dept, salary FROM MemberFundStmtV2 ORDER BY dept ASC, salary DESC")
    public List<Object[]> findMemberDetails();
    
    public List<InterestFundResponseDto> getMemberBatchByPolicyIdAndLicId(long policyId, long memberId);
    
    public List<InterestFundResponseDto> getMemberBatchByPolicyId(long policyId);
    
}