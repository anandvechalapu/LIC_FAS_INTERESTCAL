// Spring Boot Controller Class
package com.sa.fund.interest.controller.policybatchcontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.controller.policybatchcontroller.model.PolicyMasterEntity;
import com.sa.fund.interest.controller.policybatchcontroller.service.SetCreditOpeningByPolicyId_PolicyBatchControllerService;
import com.sa.fund.interest.dto.BatchDto;
import com.sa.fund.interest.dto.InterestFundResponseDto;
import com.sa.fund.interest.dto.MembersDto;
import com.sa.fund.interest.dto.CommonResponseDto;

@RestController
public class SetCreditOpeningByPolicyId_PolicyBatchControllerController {

    @Autowired
    private SetCreditOpeningByPolicyId_PolicyBatchControllerService setCreditOpeningByPolicyId_PolicyBatchControllerService;

    @PostMapping(value = "/set-opening-balance")
    public CommonResponseDto<Object> setOpeningBalance(@RequestBody PolicyMasterEntity policyMasterEntity) {
        BatchDto batchDto = new BatchDto();
        MembersDto membersDto = new MembersDto();
        boolean success = false;
        if ("Quarterly".equalsIgnoreCase(policyMasterEntity.getPolicyType())) {
            setCreditOpeningByPolicyId_PolicyBatchControllerService
                    .setOpeningBalanceForQuarterPolicy(policyMasterEntity.getPolicyId(), policyMasterEntity.getPolicyNumber(),
                            policyMasterEntity.getTrnxDate(), policyMasterEntity.getVariant(), policyMasterEntity.getPolicyType(),
                            policyMasterEntity.isBatch(), policyMasterEntity.isAuto(), policyMasterEntity.isSetOpeningBalance(),
                            policyMasterEntity.isRecalculate(), policyMasterEntity.getLicId());
        } else if ("Financial Year".equalsIgnoreCase(policyMasterEntity.getPolicyType())) {
            setCreditOpeningByPolicyId_PolicyBatchControllerService
                    .setOpeningBalanceForFinancialYearPolicy(policyMasterEntity.getPolicyId(), policyMasterEntity.getPolicyNumber(),
                            policyMasterEntity.getTrnxDate(), policyMasterEntity.getVariant(), policyMasterEntity.getPolicyType(),
                            policyMasterEntity.isBatch(), policyMasterEntity.isAuto(), policyMasterEntity.isSetOpeningBalance(),
                            policyMasterEntity.isRecalculate(), policyMasterEntity.getLicId());
        }

        CommonResponseDto<Object> setOpeningBalResponse = setCreditOpeningByPolicyId_PolicyBatchControllerService
                .setOpeningBalResponse(batchDto, policyMasterEntity, membersDto, success);

        InterestFundResponseDto interestFundResponseDto = new InterestFundResponseDto();
        setCreditOpeningByPolicyId_PolicyBatchControllerService.savePolicyFundSummary(interestFundResponseDto);

        return setOpeningBalResponse;
    }

}