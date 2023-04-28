package com.sa.fund.master.fundmastercontroller.service;

import java.util.List;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.fund.master.fundmastercontroller.model.InterestRateSlab;
import com.sa.fund.master.fundmastercontroller.repository.SearchInterestRateSlabRepository;

@Service
public class SearchInterestRateSlabService {
    
    @Autowired
    SearchInterestRateSlabRepository searchInterestRateSlabRepository;
    
    // Method to retrieve all interest rate slabs based on a given product name
    public List<InterestRateSlab> getInterestRateSlabByProduct(String product) {
        return searchInterestRateSlabRepository.findByProduct(product);
    }
    
    // Method to retrieve all interest rate slabs based on a given financial year
    public List<InterestRateSlab> getInterestRateSlabByFinancialYear(String financialYear) {
        return searchInterestRateSlabRepository.findByFinancialYear(financialYear);
    }
    
    // Method to retrieve all interest rate slabs based on a given start amount
    public List<InterestRateSlab> getInterestRateSlabByStartAmount(Number startAmount) {
        return searchInterestRateSlabRepository.findByStartAmount(startAmount);
    }
    
    // Method to retrieve all interest rate slabs based on a given end amount
    public List<InterestRateSlab> getInterestRateSlabByEndAmount(Number endAmount) {
        return searchInterestRateSlabRepository.findByEndAmount(endAmount);
    }
    
    // Method to retrieve all interest rate slabs based on a given variant
    public List<InterestRateSlab> getInterestRateSlabByVariant(String variant) {
        return searchInterestRateSlabRepository.findByVariant(variant);
    }
    
    // Method to retrieve all interest rate slabs based on a given effective start date
    public List<InterestRateSlab> getInterestRateSlabByEffectiveStartDate(Date effectiveStartDate) {
        return searchInterestRateSlabRepository.findByEffectiveStartDate(effectiveStartDate);
    }
    
    // Method to retrieve all interest rate slabs based on a given effective end date
    public List<InterestRateSlab> getInterestRateSlabByEffectiveEndDate(Date effectiveEndDate) {
        return searchInterestRateSlabRepository.findByEffectiveEndDate(effectiveEndDate);
    }
    
    // Method to retrieve all active interest rate slabs
    public List<InterestRateSlab> getActiveInterestRateSlab() {
        return searchInterestRateSlabRepository.findByIsActive(true);
    }
}