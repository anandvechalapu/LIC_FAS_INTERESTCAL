package com.sa.fund.master.fundmastercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sa.fund.master.fundmastercontroller.model.InterestRateSlab;

public interface SearchInterestRateSlabRepository extends JpaRepository<InterestRateSlab, Long> {

    // Method to retrieve all interest rate slabs based on a given product name
    List<InterestRateSlab> findByProduct(String product);
    
    // Method to retrieve all interest rate slabs based on a given financial year
    List<InterestRateSlab> findByFinancialYear(String financialYear);
    
    // Method to retrieve all interest rate slabs based on a given start amount
    List<InterestRateSlab> findByStartAmount(Number startAmount);
    
    // Method to retrieve all interest rate slabs based on a given end amount
    List<InterestRateSlab> findByEndAmount(Number endAmount);
    
    // Method to retrieve all interest rate slabs based on a given variant
    List<InterestRateSlab> findByVariant(String variant);
    
    // Method to retrieve all interest rate slabs based on a given effective start date
    List<InterestRateSlab> findByEffectiveStartDate(Date effectiveStartDate);
    
    // Method to retrieve all interest rate slabs based on a given effective end date
    List<InterestRateSlab> findByEffectiveEndDate(Date effectiveEndDate);
    
    // Method to retrieve all active interest rate slabs
    List<InterestRateSlab> findByIsActive(boolean isActive);
    
}