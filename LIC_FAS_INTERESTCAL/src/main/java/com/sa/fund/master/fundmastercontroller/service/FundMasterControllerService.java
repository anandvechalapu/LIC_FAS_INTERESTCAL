package com.sa.fund.master.fundmastercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.fund.master.fundmastercontroller.model.AirMfrRa;
import com.sa.fund.master.fundmastercontroller.repository.FundMasterControllerRepository;

@Service
public class FundMasterControllerService {

    @Autowired
    private FundMasterControllerRepository fundMasterControllerRepository;

    public List<AirMfrRa> getAirMfrRa() {
        return fundMasterControllerRepository.getAirMfrRa();
    }

}