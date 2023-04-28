package com.sa.fund.master.fundmastercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sa.fund.master.fundmastercontroller.model.FmcInterestRateSlab;

@Repository
public interface FmcgetFmcInterestRateSlab_Repository extends JpaRepository<FmcInterestRateSlab, Long> {
	
	// API to save the provided FmcInterestRateSlab data
	FmcInterestRateSlab saveFmcInterestRateSlab(FmcInterestRateSlab fmcInterestRateSlab);
	
	// API to retrieve all FmcInterestRateSlab data
	FmcInterestRateSlab getFmcInterestRateSlab();

}