package com.sa.fund.interest.integration.fundpolicyservicecontroller.service;

import com.sa.fund.interest.integration.fundpolicyservicecontroller.model.CommonResponseDto;
import com.sa.fund.interest.integration.fundpolicyservicecontroller.exceptions.ApplicationException;
import com.sa.fund.interest.integration.fundpolicyservicecontroller.exceptions.RequiredFieldException;
import com.sa.fund.interest.integration.fundpolicyservicecontroller.repository.ProcessPolicyFund_FundPolicyServiceControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcessPolicyFund_FundPolicyServiceControllerService {

    @Autowired
    ProcessPolicyFund_FundPolicyServiceControllerRepository processPolicyFund_FundPolicyServiceControllerRepository;

    public CommonResponseDto processPolicyFundService(Long serviceId) throws ApplicationException, RequiredFieldException {
        return processPolicyFund_FundPolicyServiceControllerRepository.processPolicyFund(serviceId);
    }

}