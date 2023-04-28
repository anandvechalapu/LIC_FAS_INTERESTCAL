@Repository
public class ExternalcalculateAirMfrRaFundIntegrationControllerRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExternalcalculateAirMfrRaFundIntegrationControllerRepository.class);

    @Autowired
    PolicyFundCoreService policyFundCoreService;

    public FundSearchResponseDto calculateAirMfrRa(AirMfrRaRequestDto airMfrRaRequestDto) {
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

package com.sa.fund.interest.integration.fundintegrationcontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.integration.fundintegrationcontroller.model.ExternalcalculateAirMfrRaFundIntegrationControllerModel;
import com.sa.fund.interest.request.dto.AirMfrRaRequestDto;
import com.sa.fund.interest.response.dto.FundSearchResponseDto;

@RestController
public class ExternalcalculateAirMfrRaFundIntegrationController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ExternalcalculateAirMfrRaFundIntegrationController.class);

    @Autowired
    ExternalcalculateAirMfrRaFundIntegrationControllerModel externalcalculateAirMfrRaFundIntegrationControllerModel;

    @PostMapping("/calculateAirMfrRa")
    public ResponseEntity<FundSearchResponseDto> calculateAirMfrRa(@RequestBody AirMfrRaRequestDto airMfrRaRequestDto) {
        FundSearchResponseDto fundSearchResponseDto = new FundSearchResponseDto();
        try {
            externalcalculateAirMfrRaFundIntegrationControllerModel.setAirMfrRaRequestDto(airMfrRaRequestDto);
            fundSearchResponseDto = externalcalculateAirMfrRaFundIntegrationControllerModel.calculateAirMfrRa();
            LOGGER.info("Response is {}", fundSearchResponseDto);
        } catch (Exception e) {
            fundSearchResponseDto.setResponseStatus("ERROR");
            fundSearchResponseDto.setStatusId("0");
            fundSearchResponseDto.setResponseMessage(e.getMessage());
        }
        return new ResponseEntity<>(fundSearchResponseDto, HttpStatus.OK);
    }

}