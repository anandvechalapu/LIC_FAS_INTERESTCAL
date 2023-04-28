package com.sa.fund.master.lookupcontroller.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.master.lookupcontroller.model.LookupType;
import com.sa.fund.master.lookupcontroller.model.LookupValue;
import com.sa.fund.master.lookupcontroller.service.UploadLookUpValue_LookupControllerService;

@RestController
@RequestMapping("/lookupcontroller")
public class UploadLookUpValue_LookupControllerController {

    @Autowired
    private UploadLookUpValue_LookupControllerService service;

    @GetMapping("/lookuptype/{lookupTypeId}")
    public ResponseEntity<LookupType> getLookupType(@PathVariable Long lookupTypeId) {
        LookupType lookupType = service.findByLookupTypeId(lookupTypeId);
        if (lookupType == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(lookupType, HttpStatus.OK);
    }

    @GetMapping("/lookupvalues/{lookupTypeId}")
    public ResponseEntity<List<LookupValue>> getLookupValues(@PathVariable Long lookupTypeId) {
        List<LookupValue> lookupValues = service.findByLookupTypeId(lookupTypeId);
        if (lookupValues == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(lookupValues, HttpStatus.OK);
    }

    @PostMapping("/lookupvalues")
    public ResponseEntity<Void> saveLookupValues(@Valid @RequestBody List<LookupValue> lookupValues) {
        service.saveAllLookupValues(lookupValues);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/lookuptype")
    public ResponseEntity<Void> saveLookupType(@Valid @RequestBody LookupType lookupType) {
        service.saveLookupType(lookupType);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/lookuptype/{lookupTypeId}")
    public ResponseEntity<Void> deleteLookupValuesByLookupTypeId(@PathVariable Long lookupTypeId) {
        service.deleteLookupValuesByLookupTypeId(lookupTypeId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}