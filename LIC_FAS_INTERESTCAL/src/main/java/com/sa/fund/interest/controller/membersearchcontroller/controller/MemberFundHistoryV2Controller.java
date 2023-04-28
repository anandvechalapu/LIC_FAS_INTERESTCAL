package com.sa.fund.interest.controller.membersearchcontroller.controller;

import java.util.List;

import com.sa.fund.interest.controller.membersearchcontroller.model.MemberFundHistoryV2Entity;
import com.sa.fund.interest.controller.membersearchcontroller.service.MemberFundHistoryV2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member-fund-history")
public class MemberFundHistoryV2Controller {

    @Autowired
    private MemberFundHistoryV2Service memberFundHistoryV2Service;

    @GetMapping("/{policyNo}")
    public ResponseEntity<List<MemberFundHistoryV2Entity>> viewMembersHistoryByPolicyNo(@PathVariable Long policyNo) {
        List<MemberFundHistoryV2Entity> memberFundHistoryV2Entities = memberFundHistoryV2Service.viewMembersHistoryByPolicyNo(policyNo);
        return new ResponseEntity<>(memberFundHistoryV2Entities, HttpStatus.OK);
    }

}