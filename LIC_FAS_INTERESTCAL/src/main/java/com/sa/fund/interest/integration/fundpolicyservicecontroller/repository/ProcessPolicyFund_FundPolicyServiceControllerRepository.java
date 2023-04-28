package com.sa.fund.interest.integration.fundpolicyservicecontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sa.fund.interest.integration.fundpolicyservicecontroller.model.CommonResponseDto;
import com.sa.fund.interest.integration.fundpolicyservicecontroller.exceptions.ApplicationException;
import com.sa.fund.interest.integration.fundpolicyservicecontroller.exceptions.RequiredFieldException;

public interface ProcessPolicyFund_FundPolicyServiceControllerRepository extends JpaRepository<CommonResponseDto, Long> {
    CommonResponseDto processPolicyFund(Long serviceId) throws ApplicationException, RequiredFieldException;
}