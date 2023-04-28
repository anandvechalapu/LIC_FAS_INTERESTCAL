package com.sa.fund.master.lookupcontroller.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.fund.master.lookupcontroller.model.MstLookUpTypesEntity;
import com.sa.fund.master.lookupcontroller.repository.MstPageLookUpTypeRepository;

@Service
public class MstPageLookUpTypeService {

    @Autowired
    private MstPageLookUpTypeRepository mstPageLookUpTypeRepository;

    public Optional<MstLookUpTypesEntity> getByIdAndIsActiveTrue(Long id){
        return mstPageLookUpTypeRepository.findByIdAndIsActiveTrue(id);
    }

    public Optional<MstLookUpTypesEntity> getByCodeAndIsActiveTrue(String code){
        return mstPageLookUpTypeRepository.findByCodeAndIsActiveTrue(code);
    }

    public List<MstLookUpTypesEntity> getAllByIsActiveTrue() {
        return mstPageLookUpTypeRepository.findAllByIsActiveTrue();
    }

}