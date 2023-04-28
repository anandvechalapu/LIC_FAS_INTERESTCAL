package com.sa.fund.interest.controller.memberbatchcontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.controller.memberbatchcontroller.model.ViewMemberTransactionCalc_MemberBatchController;
import com.sa.fund.interest.controller.memberbatchcontroller.service.ViewMemberTransactionCalc_MemberBatchControllerService;

@RestController
@RequestMapping("/memberbatchcontroller")
public class ViewMemberTransactionCalc_MemberBatchControllerController {

    @Autowired
    private ViewMemberTransactionCalc_MemberBatchControllerService viewMemberTransactionCalc_MemberBatchControllerService;

    @GetMapping("/{memberFundTransactionRateDetailsId}")
    public ViewMemberTransactionCalc_MemberBatchController findByMemberFundTransactionRateDetailsId(@PathVariable Long memberFundTransactionRateDetailsId) {
        return viewMemberTransactionCalc_MemberBatchControllerService.findByMemberFundTransactionRateDetailsId(memberFundTransactionRateDetailsId);
    }

    @GetMapping
    public List<ViewMemberTransactionCalc_MemberBatchController> findAll() {
        return viewMemberTransactionCalc_MemberBatchControllerService.findAll();
    }

}