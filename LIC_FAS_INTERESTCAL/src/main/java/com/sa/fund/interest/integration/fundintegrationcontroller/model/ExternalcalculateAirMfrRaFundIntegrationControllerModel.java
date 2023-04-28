package com.sa.fund.interest.integration.fundintegrationcontroller.model;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import com.sa.fund.interest.core.services.PolicyFundCoreService;
import com.sa.fund.interest.request.dto.AirMfrRaRequestDto;
import com.sa.fund.interest.response.dto.FundSearchResponseDto;

public class ExternalcalculateAirMfrRaFundIntegrationControllerModel {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ExternalcalculateAirMfrRaFundIntegrationControllerModel.class);

    private AirMfrRaRequestDto airMfrRaRequestDto;
    private FundSearchResponseDto fundSearchResponseDto;
    
    @Autowired
    private PolicyFundCoreService policyFundCoreService;

    public ExternalcalculateAirMfrRaFundIntegrationControllerModel(){}
    
    public ExternalcalculateAirMfrRaFundIntegrationControllerModel(AirMfrRaRequestDto airMfrRaRequestDto, FundSearchResponseDto fundSearchResponseDto){
        this.airMfrRaRequestDto = airMfrRaRequestDto;
        this.fundSearchResponseDto = fundSearchResponseDto;
    }
    
    public AirMfrRaRequestDto getAirMfrRaRequestDto() {
        return airMfrRaRequestDto;
    }

    public void setAirMfrRaRequestDto(AirMfrRaRequestDto airMfrRaRequestDto) {
        this.airMfrRaRequestDto = airMfrRaRequestDto;
    }

    public FundSearchResponseDto getFundSearchResponseDto() {
        return fundSearchResponseDto;
    }

    public void setFundSearchResponseDto(FundSearchResponseDto fundSearchResponseDto) {
        this.fundSearchResponseDto = fundSearchResponseDto;
    }
    
    public FundSearchResponseDto calculateAirMfrRa() {
        FundSearchResponseDto fundSearchResponseDto = new FundSearchResponseDto();
        try {
            LOGGER.info("Start of calculation process");
            fundSearchResponseDto = policyFundCoreService.calcInterestForAirMfrRa(airMfrRaRequestDto);
            fundSearchResponseDto.setResponseStatus("SUCCESS");
            fundSearchResponseDto.setStatusId("1");
            fundSearchResponseDto.setResponseMessage("RECORD_RETRIEVED");
            LOGGER.info("End of calculation process");
        } catch (Exception e) {
            fundSearchResponseDto.setResponseStatus("ERROR");
            fundSearchResponseDto.setStatusId("0");
            fundSearchResponseDto.setResponseMessage(e.getMessage());
        }
        return fundSearchResponseDto;
    }

}