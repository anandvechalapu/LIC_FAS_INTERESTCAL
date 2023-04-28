package com.sa.fund.master.lookupcontroller.service;

import com.sa.fund.master.lookupcontroller.dto.CommonRequestDto;
import com.sa.fund.master.lookupcontroller.entity.MstLookUpTypesEntity;
import com.sa.fund.master.lookupcontroller.repository.LookUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LookUpService {

    @Autowired
    private LookUpRepository lookUpRepository;

    public List<MstLookUpTypesEntity> getLookUpTypes(CommonRequestDto commonRequestDto){
        return lookUpRepository.getLookUpTypes(commonRequestDto);
    }

}