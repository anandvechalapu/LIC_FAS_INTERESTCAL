package com.sa.fund.master.lookupcontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sa.fund.master.lookupcontroller.model.LookUpTypesDto;
import com.sa.fund.master.lookupcontroller.model.CommonResponseDto;
import com.sa.fund.master.lookupcontroller.repository.RemoveLookUpTypeValueLookupControllerRepository;

@Service
public class RemoveLookUpTypeValueLookupControllerService {
    
    @Autowired
    private RemoveLookUpTypeValueLookupControllerRepository repository;
    
    public CommonResponseDto<Object> removeLookUpTypeValue(LookUpTypesDto lookUpTypesDto){
        CommonResponseDto<Object> response = new CommonResponseDto<Object>();
        
        if(lookUpTypesDto.getId() == null || lookUpTypesDto.getId() <= 0){
            response.setResponseData(null);
            response.setResponseCode("NO_RECORD_FOUND");
        }
        else{
            LookUpTypesDto lookupTypes = this.repository.findById(lookUpTypesDto.getId()).orElse(null);
            if(lookupTypes == null){
                response.setResponseData(null);
                response.setResponseCode("NO_RECORD_FOUND");
            }
            else{
                this.repository.delete(lookupTypes);
                response.setResponseData(lookupTypes);
            }
        }
        return response;
    }
}