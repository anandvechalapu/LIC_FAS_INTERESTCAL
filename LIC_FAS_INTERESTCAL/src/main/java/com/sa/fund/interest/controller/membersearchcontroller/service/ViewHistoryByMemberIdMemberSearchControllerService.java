package com.sa.fund.interest.controller.membersearchcontroller.service;

import com.sa.fund.interest.controller.membersearchcontroller.repository.ViewHistoryByMemberIdMemberSearchControllerRepository;
import com.sa.fund.interest.entity.TransactionHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewHistoryByMemberIdMemberSearchControllerService {
    @Autowired
    private ViewHistoryByMemberIdMemberSearchControllerRepository viewHistoryByMemberIdMemberSearchControllerRepository;

    public List<TransactionHistory> getTransactionHistoryByMemberId(Long memberId){
        return viewHistoryByMemberIdMemberSearchControllerRepository.findByMemberId(memberId);
    }

}