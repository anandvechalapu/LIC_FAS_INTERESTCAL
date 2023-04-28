package com.sa.fund.interest.controller.memberbatchcontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sa.fund.interest.controller.memberbatchcontroller.dto.InterestFundResponseDto;
import com.sa.fund.interest.controller.memberbatchcontroller.repository.MemberFundStmtV2Repo;

@Service
@Transactional
public class MemberFundStmtV2Service {
    
    @Autowired
    private MemberFundStmtV2Repo memberFundStmtV2Repo;
    
    public List<Object[]> findMemberDetails(){
        return memberFundStmtV2Repo.findMemberDetails();
    }
    
    public List<InterestFundResponseDto> getMemberBatchByPolicyIdAndLicId(long policyId, long memberId){
        return memberFundStmtV2Repo.getMemberBatchByPolicyIdAndLicId(policyId, memberId);
    }

    public List<InterestFundResponseDto> getMemberBatchByPolicyId(long policyId){
        return memberFundStmtV2Repo.getMemberBatchByPolicyId(policyId);
    }
}