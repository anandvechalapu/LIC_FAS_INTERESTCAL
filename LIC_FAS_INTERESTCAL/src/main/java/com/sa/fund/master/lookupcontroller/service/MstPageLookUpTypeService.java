package com.sa.fund.master.lookupcontroller.service;

import com.sa.fund.master.lookupcontroller.dto.LookUpValuesDto;
import com.sa.fund.master.lookupcontroller.entity.MstPageLookUpType;
import com.sa.fund.master.lookupcontroller.repository.MstPageLookUpTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MstPageLookUpTypeService {

    @Autowired
    private MstPageLookUpTypeRepository mstPageLookUpTypeRepository;

    //This method is used to retrieve the master lookup value by its ID
    public Optional<MstPageLookUpType> getMstPageLookUpTypeById(Long id) {
        return mstPageLookUpTypeRepository.findByIdAndIsActiveTrue(id);
    }

    //This method is used to map the entity to a LookUpValuesDto object
    public LookUpValuesDto mapPageLookUpTypeAndValueEntityToDto(MstPageLookUpType mstPageLookUpType) {
        LookUpValuesDto lookUpValuesDto = new LookUpValuesDto();
        lookUpValuesDto.setLookUpType(mstPageLookUpType.getLookUpType());
        lookUpValuesDto.setLookUpValue(mstPageLookUpType.getLookUpValue());
        return lookUpValuesDto;
    }
}