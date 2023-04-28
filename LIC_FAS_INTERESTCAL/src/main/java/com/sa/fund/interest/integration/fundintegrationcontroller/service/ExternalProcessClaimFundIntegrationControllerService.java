package com.sa.fund.interest.integration.fundintegrationcontroller.service;

import com.sa.fund.interest.integration.fundintegrationcontroller.dto.CommonResponseDto;
import com.sa.fund.interest.integration.fundintegrationcontroller.exception.ApplicationException;
import com.sa.fund.interest.integration.fundintegrationcontroller.repository.ExternalProcessClaimFundIntegrationControllerRepository;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExternalProcessClaimFundIntegrationControllerService {

    @Autowired
    ExternalProcessClaimFundIntegrationControllerRepository externalProcessClaimFundIntegrationControllerRepository;

    /**
     * Method to process a claim fund
     * 
     * @param jsonPayload - JSON payload containing the necessary fields
     * @return CommonResponseDto with status ERROR if an exception is thrown during the processing of the claim, and SUCCESS if the claim is processed successfully.
     * @throws ApplicationException with an appropriate error message if a member transaction summary does not exist for the given policy ID, lic ID, and financial year.
     * @throws ApplicationException with an appropriate error message if the closing balance of the policy is zero in the transaction summary details. 
     * @throws ApplicationException with an appropriate error message if the closing balance of the member is negative.
     * @throws ApplicationException with an appropriate error message if the process date is not greater than or equal to the transaction date.
     */
    public CommonResponseDto processClaimFund(JSONObject jsonPayload) throws ApplicationException {
        return externalProcessClaimFundIntegrationControllerRepository.processClaimFund(jsonPayload);
    }
}