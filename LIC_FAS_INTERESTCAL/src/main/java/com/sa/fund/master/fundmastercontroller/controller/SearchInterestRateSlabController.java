package com.sa.fund.master.fundmastercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.master.fundmastercontroller.model.InterestRateSlab;
import com.sa.fund.master.fundmastercontroller.service.SearchInterestRateSlabService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/interestRateSlab")
public class SearchInterestRateSlabController {
    
    @Autowired
    SearchInterestRateSlabService searchInterestRateSlabService;
    
    // Method to retrieve all interest rate slabs based on a given product name
    @GetMapping("/product/{product}")
    public List<InterestRateSlab> getInterestRateSlabByProduct(@PathVariable("product") String product) {
        return searchInterestRateSlabService.getInterestRateSlabByProduct(product);
    }
    
    // Method to retrieve all interest rate slabs based on a given financial year
    @GetMapping("/financialYear/{financialYear}")
    public List<InterestRateSlab> getInterestRateSlabByFinancialYear(@PathVariable("financialYear") String financialYear) {
        return searchInterestRateSlabService.getInterestRateSlabByFinancialYear(financialYear);
    }
    
    // Method to retrieve all interest rate slabs based on a given start amount
    @GetMapping("/startAmount/{startAmount}")
    public List<InterestRateSlab> getInterestRateSlabByStartAmount(@PathVariable("startAmount") Number startAmount) {
        return searchInterestRateSlabService.getInterestRateSlabByStartAmount(startAmount);
    }
    
    // Method to retrieve all interest rate slabs based on a given end amount
    @GetMapping("/endAmount/{endAmount}")
    public List<InterestRateSlab> getInterestRateSlabByEndAmount(@PathVariable("endAmount") Number endAmount) {
        return searchInterestRateSlabService.getInterestRateSlabByEndAmount(endAmount);
    }
    
    // Method to retrieve all interest rate slabs based on a given variant
    @GetMapping("/variant/{variant}")
    public List<InterestRateSlab> getInterestRateSlabByVariant(@PathVariable("variant") String variant) {
        return searchInterestRateSlabService.getInterestRateSlabByVariant(variant);
    }
    
    // Method to retrieve all interest rate slabs based on a given effective start date
    @GetMapping("/effectiveStartDate/{effectiveStartDate}")
    public List<InterestRateSlab> getInterestRateSlabByEffectiveStartDate(@PathVariable("effectiveStartDate") Date effectiveStartDate) {
        return searchInterestRateSlabService.getInterestRateSlabByEffectiveStartDate(effectiveStartDate);
    }
    
    // Method to retrieve all interest rate slabs based on a given effective end date
    @GetMapping("/effectiveEndDate/{effectiveEndDate}")
    public List<InterestRateSlab> getInterestRateSlabByEffectiveEndDate(@PathVariable("effectiveEndDate") Date effectiveEndDate) {
        return searchInterestRateSlabService.getInterestRateSlabByEffectiveEndDate(effectiveEndDate);
    }
    
    // Method to retrieve all active interest rate slabs
    @GetMapping("/active")
    public List<InterestRateSlab> getActiveInterestRateSlab() {
        return searchInterestRateSlabService.getActiveInterestRateSlab();
    }
}