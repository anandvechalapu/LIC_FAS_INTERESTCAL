package com.sa.fund.master.fundmastercontroller.service;

import com.sa.fund.master.fundmastercontroller.dto.AirMfrRaMstRateDto;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface FmcSearchAirMfrRaService {

    List<AirMfrRaMstRateDto> findBySearchCriteria(String product, String variant, String financialYear, Date effectiveStartDate, Date effectiveEndDate, Boolean activeStatus, Pageable pageable);

}