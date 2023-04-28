package com.sa.fund.master.lookupcontroller.service;

import com.sa.fund.master.lookupcontroller.model.LookupType;
import com.sa.fund.master.lookupcontroller.model.LookupValue;
import com.sa.fund.master.lookupcontroller.repository.SaveLookUpTypeValueLookupControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaveLookUpTypeValueLookupControllerService {

    @Autowired
    private SaveLookUpTypeValueLookupControllerRepository saveLookUpTypeValueLookupControllerRepository;

    public LookupType getLookupTypeById(Long id) {
        return saveLookUpTypeValueLookupControllerRepository.getLookupTypeById(id);
    }

    public void updateLookupType(Long id, String code, String name, Long createdBy, Long modifiedBy) {
        saveLookUpTypeValueLookupControllerRepository.updateLookupType(id, code, name, createdBy, modifiedBy);
    }

    public List<LookupValue> getLookupValuesByLookupTypeId(Long lookupTypeId) {
        return saveLookUpTypeValueLookupControllerRepository.getLookupValuesByLookupTypeId(lookupTypeId);
    }

    public void updateLookupValue(Long id, String code, String value, Integer orderNo, Long createdBy, Long modifiedBy) {
        saveLookUpTypeValueLookupControllerRepository.updateLookupValue(id, code, value, orderNo, createdBy, modifiedBy);
    }

    public void deleteLookupValueByLookupTypeId(Long lookupTypeId) {
        saveLookUpTypeValueLookupControllerRepository.deleteLookupValueByLookupTypeId(lookupTypeId);
    }

}