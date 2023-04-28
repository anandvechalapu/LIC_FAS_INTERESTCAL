package com.sa.fund.master.fundmastercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.master.fundmastercontroller.entity.FundMgmtChargesSlabMstEntity;
import com.sa.fund.master.fundmastercontroller.service.FmcsearchFmcInterestRateSlabService;

@RestController
@RequestMapping("/api/fmcsearchfmcinterestrateslab")
public class FmcsearchFmcInterestRateSlabController {

    @Autowired
    FmcsearchFmcInterestRateSlabService fmcsearchFmcInterestRateSlabService;

    @GetMapping
    public ResponseEntity<List<FundMgmtChargesSlabMstEntity>> getFundMgmtChargesSlabMstEntities(
            @RequestParam(required = false) Double minAmount, @RequestParam(required = false) Double maxAmount,
            @RequestParam(required = false) Double interestRate) {
        if (minAmount == null && maxAmount == null && interestRate == null) {
            return new ResponseEntity<>(fmcsearchFmcInterestRateSlabService.findAll(), HttpStatus.OK);
        } else if (minAmount != null && maxAmount == null && interestRate == null) {
            return new ResponseEntity<>(fmcsearchFmcInterestRateSlabService.findByMinAmount(minAmount), HttpStatus.OK);
        } else if (minAmount == null && maxAmount != null && interestRate == null) {
            return new ResponseEntity<>(fmcsearchFmcInterestRateSlabService.findByMaxAmount(maxAmount), HttpStatus.OK);
        } else if (minAmount == null && maxAmount == null && interestRate != null) {
            return new ResponseEntity<>(fmcsearchFmcInterestRateSlabService.findByInterestRate(interestRate),
                    HttpStatus.OK);
        } else if (minAmount != null && maxAmount != null && interestRate == null) {
            return new ResponseEntity<>(
                    fmcsearchFmcInterestRateSlabService.findByMinAmountAndMaxAmount(minAmount, maxAmount),
                    HttpStatus.OK);
        } else if (minAmount != null && maxAmount == null && interestRate != null) {
            return new ResponseEntity<>(
                    fmcsearchFmcInterestRateSlabService.findByMinAmountAndInterestRate(minAmount, interestRate),
                    HttpStatus.OK);
        } else if (minAmount == null && maxAmount != null && interestRate != null) {
            return new ResponseEntity<>(
                    fmcsearchFmcInterestRateSlabService.findByMaxAmountAndInterestRate(maxAmount, interestRate),
                    HttpStatus.OK);
        } else {
            return new ResponseEntity<>(
                    fmcsearchFmcInterestRateSlabService.findByMinAmountAndMaxAmountAndInterestRate(minAmount, maxAmount,
                            interestRate),
                    HttpStatus.OK);
        }
    }

}