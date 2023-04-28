package com.sa.fund.interest.integration.fundintegrationcontroller.model;

import com.sa.fund.core.service.PolicyFundCoreService;
import com.sa.fund.dto.AirMfrRaRequestDto;
import com.sa.fund.dto.FundSearchResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ExternalCalculateAirMfrRaFundIntegrationControllerModel {

    private Logger logger = LoggerFactory.getLogger(ExternalCalculateAirMfrRaFundIntegrationControllerModel.class);

    @Autowired
    private PolicyFundCoreService policyFundCoreService;

    public FundSearchResponseDto calculateAirMfrRa(AirMfrRaRequestDto requestDto){
        logger.info("Starting to calculate AIR, MFR, and RA values");

        FundSearchResponseDto fundSearchResponseDto = null;
        try {
            // Calculate AIR, MFR, and RA values
            fundSearchResponseDto = policyFundCoreService.calcInterestForAirMfrRa(requestDto);
            fundSearchResponseDto.setStatus("SUCCESS");
            fundSearchResponseDto.setStatusId(1);
            fundSearchResponseDto.setMessage("RECORD_RETRIEVED");
            logger.info("Calculation of AIR, MFR, and RA values successful");
        } catch (Exception e) {
            fundSearchResponseDto = new FundSearchResponseDto();
            fundSearchResponseDto.setStatus("ERROR");
            fundSearchResponseDto.setStatusId(0);
            fundSearchResponseDto.setMessage(e.getMessage());
            logger.error("Calculation of AIR, MFR, and RA values failed", e);
        }

        return fundSearchResponseDto;
    }
}