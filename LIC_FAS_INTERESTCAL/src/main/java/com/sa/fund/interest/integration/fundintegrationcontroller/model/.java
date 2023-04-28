package com.sa.fund.interest.integration.fundintegrationcontroller.model;

import com.sa.fund.interest.integration.fundintegrationcontroller.dto.CommonResponseDto;
import com.sa.fund.interest.utils.exception.ApplicationException;
import org.json.JSONObject;
import org.springframework.stereotype.Repository;

/**
 * Model class for ExternalProcessClaimFundIntegrationControllerRepository
 *
 * @author Sumanth A
 * @since 1.0
 */
@Repository
public interface ExternalProcessClaimFundIntegrationControllerRepository {

    CommonResponseDto processClaimFund(JSONObject jsonPayload) throws ApplicationException;

}