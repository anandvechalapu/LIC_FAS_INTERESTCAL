package com.sa.fund.master.lookupcontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.master.lookupcontroller.model.LookUpType;
import com.sa.fund.master.lookupcontroller.service.SaveLookUpType_LookupControllerService;

@RestController
@RequestMapping("/lookup")
public class LookupController {

    @Autowired
    private SaveLookUpType_LookupControllerService saveLookUpType_LookupControllerService;

    @PostMapping("/save")
    public LookUpType save(@RequestBody LookUpType lookUpType) {
        return saveLookUpType_LookupControllerService.save(lookUpType);
    }

    @GetMapping("/findById/{id}")
    public LookUpType findById(@PathVariable Long id) {
        return saveLookUpType_LookupControllerService.findById(id);
    }

    @GetMapping("/findByCode/{code}")
    public LookUpType findByCode(@PathVariable String code) {
        return saveLookUpType_LookupControllerService.findByCode(code);
    }

}