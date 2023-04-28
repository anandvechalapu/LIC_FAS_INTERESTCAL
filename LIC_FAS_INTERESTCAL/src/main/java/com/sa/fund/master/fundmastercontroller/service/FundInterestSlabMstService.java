package com.sa.fund.master.fundmastercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.fund.master.fundmastercontroller.dto.CommonResponseDto;
import com.sa.fund.master.fundmastercontroller.dto.FundInterestSlabMstDto;
import com.sa.fund.master.fundmastercontroller.repository.FundInterestSlabMstRepository;

@Service
public class FundInterestSlabMstService {
	
	@Autowired
	private FundInterestSlabMstRepository fundInterestSlabMstRepository;

	public List<FundInterestSlabMstDto> getActiveInterestRateSlab_FundMasterService() {
		return fundInterestSlabMstRepository.findByIsActiveTrue();
	}
	
	public List<CommonResponseDto> getActiveInterestRateSlab_FundMasterController() {
		return fundInterestSlabMstRepository.getActiveInterestRateSlab_FundMasterController();
	}
	
}