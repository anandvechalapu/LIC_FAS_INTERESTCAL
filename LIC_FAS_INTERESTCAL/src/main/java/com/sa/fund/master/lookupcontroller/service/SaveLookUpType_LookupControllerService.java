package com.sa.fund.master.lookupcontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.fund.master.lookupcontroller.model.LookUpType;
import com.sa.fund.master.lookupcontroller.repository.SaveLookUpType_LookupControllerRepository;

@Service
public class SaveLookUpType_LookupControllerService {

    @Autowired
    private SaveLookUpType_LookupControllerRepository saveLookUpType_LookupControllerRepository;

    public LookUpType save(LookUpType lookUpType) {
        return saveLookUpType_LookupControllerRepository.save(lookUpType);
    }

    public LookUpType findById(Long id) {
        Optional<LookUpType> optionalLookUpType = saveLookUpType_LookupControllerRepository.findById(id);
        return optionalLookUpType.isPresent() ? optionalLookUpType.get() : null;
    }

    public LookUpType findByCode(String code) {
        return saveLookUpType_LookupControllerRepository.findByCode(code);
    }

}