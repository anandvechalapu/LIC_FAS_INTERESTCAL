package com.sa.fund.master.fundmastercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.master.fundmastercontroller.dto.AirMfrRaMstRateDto;
import com.sa.fund.master.fundmastercontroller.dto.CommonResponseDto;
import com.sa.fund.master.fundmastercontroller.service.FmcsaveAirMfrRa_FundMasterControllerService;

@RestController
public class FmcsaveAirMfrRa_FundMasterController {

	@Autowired
	private FmcsaveAirMfrRa_FundMasterControllerService FmcsaveAirMfrRa_FundMasterControllerService;
	
	@PostMapping("/fmc/saveAirMfrRa")
	public CommonResponseDto<Object> saveAirMfrRaMstRate(@RequestBody AirMfrRaMstRateDto airMfrRaMstRateDto) {
		return FmcsaveAirMfrRa_FundMasterControllerService.saveAirMfrRaMstRate(airMfrRaMstRateDto);
	}
}