package com.sa.fund.master.lookupcontroller.service;

import com.sa.fund.master.lookupcontroller.model.LookUpType;
import com.sa.fund.master.lookupcontroller.repository.SaveLookUpTypeLookupControllerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaveLookUpTypeLookupControllerService {

    private SaveLookUpTypeLookupControllerRepository saveLookUpTypeLookupControllerRepository;

    public SaveLookUpTypeLookupControllerService(SaveLookUpTypeLookupControllerRepository saveLookUpTypeLookupControllerRepository) {
        this.saveLookUpTypeLookupControllerRepository = saveLookUpTypeLookupControllerRepository;
    }

    public LookUpType save(LookUpType lookUpType) {
        return saveLookUpTypeLookupControllerRepository.save(lookUpType);
    }

    public LookUpType findById(Long id) {
        return saveLookUpTypeLookupControllerRepository.findById(id).orElse(null);
    }

    public List<LookUpType> findAll() {
        return saveLookUpTypeLookupControllerRepository.findAll();
    }

    public LookUpType update(LookUpType lookUpType) {
        return saveLookUpTypeLookupControllerRepository.save(lookUpType);
    }

    public void deleteById(Long id) {
        saveLookUpTypeLookupControllerRepository.deleteById(id);
    }

    public boolean existsById(Long id) {
        return saveLookUpTypeLookupControllerRepository.existsById(id);
    }

    public LookUpType generateCode(LookUpType lookUpType) {
        return saveLookUpTypeLookupControllerRepository.generateCode(lookUpType);
    }

    public LookUpType updateLookUpValues(LookUpType lookUpType) {
        return saveLookUpTypeLookupControllerRepository.updateLookUpValues(lookUpType);
    }

}