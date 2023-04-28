package com.sa.fund.master.lookupcontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.fund.master.lookupcontroller.entity.LookUpTypeAndValueEntity;
import com.sa.fund.master.lookupcontroller.repository.LookupControllerRepository;

@Service
public class LookupControllerService {
	
	@Autowired
	LookupControllerRepository lookupControllerRepository;
	
	public LookUpTypeAndValueEntity getLookUpTypeValueById(Long id) {
		return lookupControllerRepository.getLookUpTypeValueById(id);
	}
	
	public List<LookUpTypeAndValueEntity> getAllLookUpTypeValue(){
		return lookupControllerRepository.findAll();
	}
	
	public LookUpTypeAndValueEntity saveLookUpTypeValue(LookUpTypeAndValueEntity lookUpTypeAndValueEntity) {
		return lookupControllerRepository.save(lookUpTypeAndValueEntity);
	}
	
	public void deleteLookUpTypeValue(Long id) {
		lookupControllerRepository.deleteById(id);
	}
	
	public LookUpTypeAndValueEntity updateLookUpTypeValue(LookUpTypeAndValueEntity lookUpTypeAndValueEntity) {
		return lookupControllerRepository.save(lookUpTypeAndValueEntity);
	}

}