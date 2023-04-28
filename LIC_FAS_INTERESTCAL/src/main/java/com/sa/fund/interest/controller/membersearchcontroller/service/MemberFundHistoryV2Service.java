package com.sa.fund.interest.controller.membersearchcontroller.service;

import java.util.List;

import com.sa.fund.interest.controller.membersearchcontroller.entity.MemberFundHistoryV2Entity;
import com.sa.fund.interest.controller.membersearchcontroller.repository.MemberFundHistoryV2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberFundHistoryV2Service {
 
    @Autowired
    private MemberFundHistoryV2Repository memberFundHistoryV2Repository;
 
    public List<MemberFundHistoryV2Entity> viewMembersHistoryByPolicyNo(Long policyNo) {
        return memberFundHistoryV2Repository.viewMembersHistoryByPolicyNo(policyNo);
    }
}