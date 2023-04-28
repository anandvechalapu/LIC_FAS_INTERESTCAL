package com.sa.fund.master.fundmastercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.master.fundmastercontroller.dto.CommonResponseDto;
import com.sa.fund.master.fundmastercontroller.dto.FundInterestSlabMstDto;
import com.sa.fund.master.fundmastercontroller.service.FundMasterControllerService;

@RestController
@RequestMapping("/fundmaster")
public class FundMasterController {

    @Autowired
    private FundMasterControllerService fundMasterControllerService;

    @PostMapping("/saveInterestRateSlab")
    public CommonResponseDto<Object> saveInterestRateSlab(@RequestBody FundInterestSlabMstDto dto) throws IllegalArgumentException {
        return fundMasterControllerService.saveInterestRateSlab(dto);
    }

}