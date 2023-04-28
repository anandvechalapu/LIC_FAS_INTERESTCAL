package com.sa.fund.interest.integration.fundintegrationcontroller.controller;

import com.sa.fund.interest.integration.fundintegrationcontroller.dto.CommonResponseDto;
import com.sa.fund.interest.integration.fundintegrationcontroller.service.ExternalProcessClaimFundIntegrationControllerService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExternalProcessClaimFundIntegrationController {

    @Autowired
    ExternalProcessClaimFundIntegrationControllerService externalProcessClaimFundIntegrationControllerService;

    /**
     * API to process a claim fund
     * 
     * @param jsonPayload - JSON payload containing the necessary fields
     * @return CommonResponseDto with status ERROR if an exception is thrown during the processing of the claim, and SUCCESS if the claim is processed successfully.
     * @throws ApplicationException with an appropriate error message if a member transaction summary does not exist for the given policy ID, lic ID, and financial year.
     * @throws ApplicationException with an appropriate error message if the closing balance of the policy is zero in the transaction summary details. 
     * @throws ApplicationException with an appropriate error message if the closing balance of the member is negative.
     * @throws ApplicationException with an appropriate error message if the process date is not greater than or equal to the transaction date.
     */
    @PostMapping("/processClaimFund")
    public ResponseEntity<CommonResponseDto> processClaimFund(@RequestBody JSONObject jsonPayload) {
        CommonResponseDto responseDto = externalProcessClaimFundIntegrationControllerService.processClaimFund(jsonPayload);
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

}