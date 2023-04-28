package com.sa.fund.master.fundmastercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.fund.master.fundmastercontroller.dto.CommonResponseDto;
import com.sa.fund.master.fundmastercontroller.dto.FundInterestSlabMstDto;
import com.sa.fund.master.fundmastercontroller.repository.FundMasterControllerRepository;

@Service
public class FundMasterControllerService {

    @Autowired
    private FundMasterControllerRepository fundMasterControllerRepository;

    public CommonResponseDto<Object> saveInterestRateSlab(FundInterestSlabMstDto dto) throws IllegalArgumentException {
        return fundMasterControllerRepository.saveInterestRateSlab(dto);
    }
}