package com.sa.fund.interest.controller.memberbatchcontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.controller.memberbatchcontroller.model.InterestFundResponseDto;
import com.sa.fund.interest.controller.memberbatchcontroller.service.MemberBatchService;

@RestController
@RequestMapping("/memberbatch")
public class MemberBatchController {

    @Autowired
    private MemberBatchService memberBatchService;

    @GetMapping("/{batchNumber}")
    public ResponseEntity<List<InterestFundResponseDto>> getMemberBatchSummary(@PathVariable String batchNumber, Pageable pageable) {
        Page<InterestFundResponseDto> fundResponseDtos = memberBatchService.findByBatchNumber(batchNumber, pageable).map(memberFundStmtV2Entity -> memberBatchService.mapMemberBatchSummaryoDtoList(memberFundStmtV2Entity));
        return new ResponseEntity<>(fundResponseDtos.getContent(), HttpStatus.OK);
    }

}