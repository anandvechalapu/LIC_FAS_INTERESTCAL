package com.sa.fund.master.fundmastercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sa.fund.master.fundmastercontroller.model.FundInterestRateSlabMst;
import com.sa.fund.master.fundmastercontroller.service.FundMasterService;
import com.sa.fund.master.fundmastercontroller.dto.CommonResponseDto;

@RestController
@RequestMapping("/fundmaster")
public class FundMasterController {
    
    @Autowired
    FundMasterService fundMasterService;
    
    // Method to save the interest rate slab
    @PostMapping(value = "/saveFmcInterestRateSlab")
    public ResponseEntity<Object> saveFmcInterestRateSlab(@RequestBody FundInterestRateSlabMst fundInterestRateSlabMst) {
        FundInterestRateSlabMst validateRequestBody = fundMasterService.validateRequestBody(fundInterestRateSlabMst);
        CommonResponseDto<Object> response = fundMasterService.callSaveFmcInterestRateSlab(validateRequestBody);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    
}