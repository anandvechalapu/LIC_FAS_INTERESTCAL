package com.sa.fund.master.lookupcontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.master.lookupcontroller.model.LookUpTypeAndValueModel;
import com.sa.fund.master.lookupcontroller.service.LookupControllerService;

@RestController
@RequestMapping("/lookupController")
public class LookupControllerController {
	
	@Autowired
	LookupControllerService lookupControllerService;
	
	@GetMapping("/{id}")
	public LookUpTypeAndValueModel getLookUpTypeValueById(@PathVariable Long id) {
		return lookupControllerService.getLookUpTypeValueById(id);
	}
	
	@GetMapping("")
	public List<LookUpTypeAndValueModel> getAllLookUpTypeValue(){
		return lookupControllerService.getAllLookUpTypeValue();
	}
	
	@PostMapping("")
	public LookUpTypeAndValueModel saveLookUpTypeValue(@RequestBody LookUpTypeAndValueModel lookUpTypeAndValueModel) {
		return lookupControllerService.saveLookUpTypeValue(lookUpTypeAndValueModel);
	}
	
	@DeleteMapping("/{id}")
	public void deleteLookUpTypeValue(@PathVariable Long id) {
		lookupControllerService.deleteLookUpTypeValue(id);
	}
	
	@PutMapping("")
	public LookUpTypeAndValueModel updateLookUpTypeValue(@RequestBody LookUpTypeAndValueModel lookUpTypeAndValueModel) {
		return lookupControllerService.updateLookUpTypeValue(lookUpTypeAndValueModel);
	}

}