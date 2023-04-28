package com.sa.fund.master.fundmastercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.master.fundmastercontroller.model.FmcInterestRateSlab;
import com.sa.fund.master.fundmastercontroller.service.FmcgetFmcInterestRateSlab_Service;

@RestController
@RequestMapping("/fundmastercontroller")
public class FmcgetFmcInterestRateSlab_Controller {

	@Autowired
	private FmcgetFmcInterestRateSlab_Service fmcgetFmcInterestRateSlab_Service;
	
	@PostMapping
	public FmcInterestRateSlab saveFmcInterestRateSlab(@RequestBody FmcInterestRateSlab fmcInterestRateSlab) {
		return fmcgetFmcInterestRateSlab_Service.saveFmcInterestRateSlab(fmcInterestRateSlab);
	}
	
	@GetMapping
	public List<FmcInterestRateSlab> getFmcInterestRateSlab() {
		return fmcgetFmcInterestRateSlab_Service.getFmcInterestRateSlab();
	}
	
}