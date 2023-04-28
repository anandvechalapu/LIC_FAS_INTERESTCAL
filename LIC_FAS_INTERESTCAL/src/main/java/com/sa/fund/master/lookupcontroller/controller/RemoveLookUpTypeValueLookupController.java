package com.sa.fund.master.lookupcontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sa.fund.master.lookupcontroller.model.LookUpTypesDto;
import com.sa.fund.master.lookupcontroller.model.CommonResponseDto;
import com.sa.fund.master.lookupcontroller.service.RemoveLookUpTypeValueLookupControllerService;

@RestController
public class RemoveLookUpTypeValueLookupController {

    @Autowired
    private RemoveLookUpTypeValueLookupControllerService service;
    
    @DeleteMapping(value = "/lookup/remove/{id}")
    public CommonResponseDto<Object> removeLookUpTypeValue(@RequestBody LookUpTypesDto lookUpTypesDto, @PathVariable("id") Long id){
        lookUpTypesDto.setId(id);
        return service.removeLookUpTypeValue(lookUpTypesDto);
    }
}