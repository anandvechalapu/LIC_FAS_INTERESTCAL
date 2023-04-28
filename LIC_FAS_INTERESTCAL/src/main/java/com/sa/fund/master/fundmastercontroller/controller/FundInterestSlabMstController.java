package com.sa.fund.master.fundmastercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.master.fundmastercontroller.dto.CommonResponseDto;
import com.sa.fund.master.fundmastercontroller.dto.FundInterestSlabMstDto;
import com.sa.fund.master.fundmastercontroller.service.FundInterestSlabMstService;

@RestController
@RequestMapping("/fundmastercontroller")
public class FundInterestSlabMstController {
	
	@Autowired
	private FundInterestSlabMstService fundInterestSlabMstService;
	
	@GetMapping("/getActiveInterestRateSlab_FundMasterController")
	public List<CommonResponseDto> getActiveInterestRateSlab_FundMasterController(){
		return fundInterestSlabMstService.getActiveInterestRateSlab_FundMasterController();
	}
	
	@GetMapping("/getActiveInterestRateSlab_FundMasterService")
	public List<FundInterestSlabMstDto> getActiveInterestRateSlab_FundMasterService(){
		return fundInterestSlabMstService.getActiveInterestRateSlab_FundMasterService();
	}
}