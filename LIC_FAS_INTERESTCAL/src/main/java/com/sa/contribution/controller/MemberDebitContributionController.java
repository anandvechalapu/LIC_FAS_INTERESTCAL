package com.sa.contribution.controller;

import com.sa.contribution.dto.CommonResponseDto;
import com.sa.contribution.dto.DebitRequestDto;
import com.sa.contribution.service.MemberDebitContributionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberDebitContributionController {

    @Autowired
    private MemberDebitContributionService memberDebitContributionService;

    @PostMapping("/debitContribution")
    public ResponseEntity<CommonResponseDto> debitContribution(@RequestBody DebitRequestDto debitRequestDto){
        CommonResponseDto response = memberDebitContributionService.debitContribution(debitRequestDto);
        return new ResponseEntity<CommonResponseDto>(response, HttpStatus.OK);
    }

}