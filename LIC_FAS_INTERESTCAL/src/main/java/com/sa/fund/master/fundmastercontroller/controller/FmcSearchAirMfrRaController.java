package com.sa.fund.master.fundmastercontroller.controller;

import com.sa.fund.master.fundmastercontroller.dto.AirMfrRaMstRateDto;
import com.sa.fund.master.fundmastercontroller.service.FmcSearchAirMfrRaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/fmc")
public class FmcSearchAirMfrRaController {

    @Autowired
    FmcSearchAirMfrRaService fmcSearchAirMfrRaService;

    @GetMapping("/searchAirMfrRa")
    public List<AirMfrRaMstRateDto> searchAirMfrRa(@RequestParam(name = "product", required = false) String product,
                                                   @RequestParam(name = "variant", required = false) String variant,
                                                   @RequestParam(name = "financialYear", required = false) String financialYear,
                                                   @RequestParam(name = "effectiveStartDate", required = false) Date effectiveStartDate,
                                                   @RequestParam(name = "effectiveEndDate", required = false) Date effectiveEndDate,
                                                   @RequestParam(name = "activeStatus", required = false) Boolean activeStatus,
                                                   Pageable pageable) {
        return fmcSearchAirMfrRaService.findBySearchCriteria(product, variant, financialYear, effectiveStartDate, effectiveEndDate, activeStatus, pageable);
    }
}