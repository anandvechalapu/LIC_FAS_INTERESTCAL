package com.sa.fund.master.fundmastercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.fund.master.fundmastercontroller.model.FmcInterestRateSlab;
import com.sa.fund.master.fundmastercontroller.repository.FmcgetFmcInterestRateSlab_Repository;

@Service
public class FmcgetFmcInterestRateSlab_Service {

	@Autowired
	private FmcgetFmcInterestRateSlab_Repository fmcgetFmcInterestRateSlab_Repository;
	
	// Service method to save the provided FmcInterestRateSlab data
	public FmcInterestRateSlab saveFmcInterestRateSlab(FmcInterestRateSlab fmcInterestRateSlab) {
		return fmcgetFmcInterestRateSlab_Repository.saveFmcInterestRateSlab(fmcInterestRateSlab);
	}
	
	// Service method to retrieve all FmcInterestRateSlab data
	public List<FmcInterestRateSlab> getFmcInterestRateSlab() {
		return fmcgetFmcInterestRateSlab_Repository.findAll();
	}
}