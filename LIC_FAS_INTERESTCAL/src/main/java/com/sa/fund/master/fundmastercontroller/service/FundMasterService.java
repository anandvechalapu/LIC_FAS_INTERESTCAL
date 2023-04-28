package com.sa.fund.master.fundmastercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.validation.Valid;
import com.sa.fund.master.fundmastercontroller.model.FundInterestRateSlabMst;
import com.sa.fund.master.fundmastercontroller.repository.FmcsaveFmcInterestRateSlab_FundMasterControllerRepository;
import com.sa.fund.master.fundmastercontroller.dto.CommonResponseDto;

@Service
public class FundMasterService {
    
    @Autowired
    FmcsaveFmcInterestRateSlab_FundMasterControllerRepository fmcsaveFmcInterestRateSlab_FundMasterControllerRepository;
    
    // Method to save the interest rate slab to the database
    public FundInterestRateSlabMst saveFmcInterestRateSlab(FundInterestRateSlabMst fundInterestRateSlabMst) {
        return fmcsaveFmcInterestRateSlab_FundMasterControllerRepository.save(fundInterestRateSlabMst);
    }
    
    // Method to validate the request body using the @Valid annotation
    @Valid
    public FundInterestRateSlabMst validateRequestBody(FundInterestRateSlabMst fundInterestRateSlabMst) {
        return fundInterestRateSlabMst;
    }
    
    // Method to call the saveFmcInterestRateSlab method of the FundMasterService class, passing the validated request body as an argument
    public CommonResponseDto<Object> callSaveFmcInterestRateSlab(FundInterestRateSlabMst fundInterestRateSlabMst) {
        FundInterestRateSlabMst response = saveFmcInterestRateSlab(fundInterestRateSlabMst);
        if (response != null) {
            return returnResponse("Success", 200, "Interest rate slab saved successfully");
        } else {
            return returnResponse("Failed", 500, "Failed to save interest rate slab");
        }
    }
    
    // Method to return a CommonResponseDto<Object> object with the following properties
    public CommonResponseDto<Object> returnResponse(String status, int statusId, String message) {
        CommonResponseDto<Object> response = new CommonResponseDto<Object>();
        response.setStatus(status);
        response.setStatusId(statusId);
        response.setMessage(message);
        return response;
    }
}