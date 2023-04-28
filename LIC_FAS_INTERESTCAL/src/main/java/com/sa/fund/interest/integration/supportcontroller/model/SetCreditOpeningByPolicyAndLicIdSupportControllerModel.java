package com.sa.fund.interest.integration.supportcontroller.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class SetCreditOpeningByPolicyAndLicIdSupportControllerModel {

    @Autowired
    private PolicyFundCoreService policyFundCoreService;
    
    @Autowired
    private MemberFundCoreService memberFundCoreService;
    
    @PostMapping("/setCreditOpeningByPolicyAndLicId")
    @Operation(summary = "Set Credit Opening for member by Policy Id and Lic Id",
               description = "{policyId:305,policyNumber:,trnxDate:31/03/2023,isBatch:false,isAuto:true,setOpeningBalance:false,recalculate:true,licId:1}")
    public CommonResponseDto<Object> setCreditOpeningByPolicyAndLicId(@RequestBody BatchDto batchDto) {
        try {
            
            String policyId = batchDto.getPolicyId();
            String variant = policyFundCoreService.getVariantForPolicyId(policyId);
            
            if (StringUtils.isBlank(variant)) {
                return new CommonResponseDto<Object>(200, "Variant not found for the policy id: " + policyId, null);
            }
            if (variant.equals("V2")) {
                memberFundCoreService.setOpeningBalanceForNextQuarter(batchDto);
            } else {
                memberFundCoreService.setOpeningBalanceForNewFinancialYr(batchDto);
            }
            return new CommonResponseDto<Object>(200, "Credit Opening is successfully set for the policy and lic id: " + policyId + " - " + batchDto.getLicId(), null);
        } catch (Exception ex) {
            return new CommonResponseDto<Object>(500, "Error in setting the Credit Opening for the policy id: " + batchDto.getPolicyId(), null);
        }
    }

    public class BatchDto {
        private String policyId;
        private String policyNumber;
        private String trnxDate;
        private boolean isBatch;
        private boolean isAuto;
        private boolean setOpeningBalance;
        private boolean recalculate;
        private int licId;

        //getters and setters
    }

    public class CommonResponseDto<T> {
        private int status;
        private String message;
        private T data;
        
        //getters and setters
    }

}