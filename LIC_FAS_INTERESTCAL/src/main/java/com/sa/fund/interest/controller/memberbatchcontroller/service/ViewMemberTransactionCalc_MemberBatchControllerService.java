package com.sa.fund.interest.controller.memberbatchcontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.fund.interest.controller.memberbatchcontroller.model.ViewMemberTransactionCalc_MemberBatchController;
import com.sa.fund.interest.controller.memberbatchcontroller.repository.ViewMemberTransactionCalc_MemberBatchControllerRepository;

@Service
public class ViewMemberTransactionCalc_MemberBatchControllerService {

    @Autowired
    private ViewMemberTransactionCalc_MemberBatchControllerRepository viewMemberTransactionCalc_MemberBatchControllerRepository;

    public ViewMemberTransactionCalc_MemberBatchController findByMemberFundTransactionRateDetailsId(Long memberFundTransactionRateDetailsId) {
        return viewMemberTransactionCalc_MemberBatchControllerRepository.findByMemberFundTransactionRateDetailsId(memberFundTransactionRateDetailsId);
    }

    public List<ViewMemberTransactionCalc_MemberBatchController> findAll() {
        return viewMemberTransactionCalc_MemberBatchControllerRepository.findAll();
    }

}