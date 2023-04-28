package com.sa.fund.master.fundmastercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sa.fund.master.fundmastercontroller.repository.FmcsaveAirMfrRa_FundMasterControllerRepository;
import com.sa.fund.master.fundmastercontroller.dto.AirMfrRaMstRateDto;
import com.sa.fund.master.fundmastercontroller.dto.CommonResponseDto;

@Service
public class FmcsaveAirMfrRa_FundMasterControllerService {

	@Autowired
	private FmcsaveAirMfrRa_FundMasterControllerRepository FmcsaveAirMfrRa_FundMasterControllerRepository;

	@PostMapping("/fmc/saveAirMfrRa")
	@Transactional
	public CommonResponseDto<Object> saveAirMfrRaMstRate(@RequestBody AirMfrRaMstRateDto airMfrRaMstRateDto) {
		CommonResponseDto<Object> response = new CommonResponseDto<>();
		FmcsaveAirMfrRa_FundMasterControllerRepository.save(airMfrRaMstRateDto);
		response.setData(airMfrRaMstRateDto);
		return response;
	}
}