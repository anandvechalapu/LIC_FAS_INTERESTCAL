package com.sa.fund.master.fundmastercontroller.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sa.fund.master.fundmastercontroller.model.AirMfrRa;

@Repository
public interface FundMasterControllerRepository extends JpaRepository<AirMfrRa, Long> {

    @Query("SELECT a FROM AirMfrRa a")
    List<AirMfrRa> getAirMfrRa();

}

package com.sa.fund.master.fundmastercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.master.fundmastercontroller.model.AirMfrRa;
import com.sa.fund.master.fundmastercontroller.service.FundMasterControllerService;

@RestController
@RequestMapping("/api/fundmastercontroller")
public class FundMasterController {

    @Autowired
    private FundMasterControllerService fundMasterControllerService;

    @GetMapping("/airmfrra")
    public List<AirMfrRa> getAirMfrRa() {
        return fundMasterControllerService.getAirMfrRa();
    }

}