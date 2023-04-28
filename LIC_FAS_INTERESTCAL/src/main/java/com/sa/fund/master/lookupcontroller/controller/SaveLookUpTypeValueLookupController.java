package com.sa.fund.master.lookupcontroller.controller;

import com.sa.fund.master.lookupcontroller.model.LookupType;
import com.sa.fund.master.lookupcontroller.model.LookupValue;
import com.sa.fund.master.lookupcontroller.service.SaveLookUpTypeValueLookupControllerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lookup")
public class SaveLookUpTypeValueLookupController {

    @Autowired
    private SaveLookUpTypeValueLookupControllerService saveLookUpTypeValueLookupControllerService;

    @GetMapping("/type/{id}")
    public LookupType getLookupTypeById(@PathVariable Long id) {
        return saveLookUpTypeValueLookupControllerService.getLookupTypeById(id);
    }

    @PutMapping("/type")
    public void updateLookupType(@RequestBody LookupType lookupType) {
        saveLookUpTypeValueLookupControllerService.updateLookupType(lookupType.getId(), lookupType.getCode(),
                lookupType.getName(), lookupType.getCreatedBy(), lookupType.getModifiedBy());
    }

    @GetMapping("/value/{lookupTypeId}")
    public List<LookupValue> getLookupValuesByLookupTypeId(@PathVariable Long lookupTypeId) {
        return saveLookUpTypeValueLookupControllerService.getLookupValuesByLookupTypeId(lookupTypeId);
    }

    @PutMapping("/value")
    public void updateLookupValue(@RequestBody LookupValue lookupValue) {
        saveLookUpTypeValueLookupControllerService.updateLookupValue(lookupValue.getId(), lookupValue.getCode(),
                lookupValue.getValue(), lookupValue.getOrderNo(), lookupValue.getCreatedBy(), lookupValue.getModifiedBy());
    }

    @DeleteMapping("/value/{lookupTypeId}")
    public void deleteLookupValueByLookupTypeId(@PathVariable Long lookupTypeId) {
        saveLookUpTypeValueLookupControllerService.deleteLookupValueByLookupTypeId(lookupTypeId);
    }

}