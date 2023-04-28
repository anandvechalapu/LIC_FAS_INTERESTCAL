package com.sa.fund.master.lookupcontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.fund.master.lookupcontroller.model.LookupType;
import com.sa.fund.master.lookupcontroller.model.LookupValue;
import com.sa.fund.master.lookupcontroller.repository.UploadLookUpValue_LookupControllerRepository;

@Service
public class UploadLookUpValue_LookupControllerService {

    @Autowired
    private UploadLookUpValue_LookupControllerRepository repository;

    public LookupType findByLookupTypeId(Long lookupTypeId) {
        return repository.findByLookupTypeId(lookupTypeId);
    }

    public List<LookupValue> findByLookupTypeId(Long lookupTypeId) {
        return repository.findByLookupTypeId(lookupTypeId);
    }

    public void saveAllLookupValues(List<LookupValue> lookupValues) {
        repository.saveAll(lookupValues);
    }

    public void saveLookupType(LookupType lookupType) {
        repository.save(lookupType);
    }

    public void deleteLookupValuesByLookupTypeId(Long lookupTypeId) {
        repository.deleteLookupValuesByLookupTypeId(lookupTypeId);
    }

}