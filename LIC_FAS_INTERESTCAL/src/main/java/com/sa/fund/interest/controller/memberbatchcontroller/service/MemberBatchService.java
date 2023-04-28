package com.sa.fund.interest.controller.memberbatchcontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sa.fund.interest.controller.memberbatchcontroller.model.InterestFundResponseDto;
import com.sa.fund.interest.controller.memberbatchcontroller.model.MemberFundStmtV2Entity;
import com.sa.fund.interest.controller.memberbatchcontroller.repository.MemberBatchRepository;

@Service
public class MemberBatchService {

    @Autowired
    MemberBatchRepository memberBatchRepository;

    public Page<MemberFundStmtV2Entity> findByBatchNumber(String batchNumber, Pageable pageable) {
        return memberBatchRepository.findByBatchNumber(batchNumber, pageable);
    }

    public InterestFundResponseDto mapMemberBatchSummaryoDtoList(MemberFundStmtV2Entity memberFundStmtV2Entity) {
        return memberBatchRepository.mapMemberBatchSummaryoDtoList(memberFundStmtV2Entity);
    }
}