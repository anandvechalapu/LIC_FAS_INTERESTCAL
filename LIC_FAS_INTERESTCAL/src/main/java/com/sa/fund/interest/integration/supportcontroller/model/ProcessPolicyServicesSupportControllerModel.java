package com.sa.fund.interest.integration.supportcontroller.model;

import com.sa.fund.interest.exception.ApplicationException;
import com.sa.fund.interest.exception.RequiredFieldException;
import com.sa.fund.interest.dto.CommonResponseDto;
import com.sa.fund.interest.dto.FundChangeDto;

public class ProcessPolicyServicesSupportControllerModel {

    private FundChangeDto fundChangeDto;
    
    public ProcessPolicyServicesSupportControllerModel() {
        
    }

    public ProcessPolicyServicesSupportControllerModel(FundChangeDto fundChangeDto) {
        this.fundChangeDto = fundChangeDto;
    }

    public CommonResponseDto processPolicyServices() throws RequiredFieldException, ApplicationException {
        if (fundChangeDto.getSourcePolicyNumber() == null || fundChangeDto.getDestinationPolicyNumber() == null || fundChangeDto.getUpdateType() == null) {
            throw new RequiredFieldException("One or more of the required fields are null or empty");
        }
        if (fundChangeDto.getSourcePolicyNumber() <= 0 || fundChangeDto.getDestinationPolicyNumber() <= 0) {
            throw new ApplicationException("sourcePolicyNumber or destinationPolicyNumber is not found");
        }
        // implement your business logic here 
        // return a CommonResponseDto with a map containing the result of the processing of the policy service when successful
        return null;
    }

}