package com.sa.fund.master.lookupcontroller.controller;

import com.sa.fund.master.lookupcontroller.model.LookUpType;
import com.sa.fund.master.lookupcontroller.service.SaveLookUpTypeLookupControllerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lookup")
public class LookUpTypeLookupController {

    private SaveLookUpTypeLookupControllerService saveLookUpTypeLookupControllerService;

    public LookUpTypeLookupController(SaveLookUpTypeLookupControllerService saveLookUpTypeLookupControllerService) {
        this.saveLookUpTypeLookupControllerService = saveLookUpTypeLookupControllerService;
    }

    @PostMapping
    public ResponseEntity<LookUpType> saveLookUpType(@RequestBody LookUpType lookUpType){
        return new ResponseEntity<>(saveLookUpTypeLookupControllerService.save(lookUpType), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LookUpType> findById(@PathVariable Long id){
        return new ResponseEntity<>(saveLookUpTypeLookupControllerService.findById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<LookUpType>> findAll(){
        return new ResponseEntity<>(saveLookUpTypeLookupControllerService.findAll(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<LookUpType> updateLookUpType(@RequestBody LookUpType lookUpType){
        return new ResponseEntity<>(saveLookUpTypeLookupControllerService.update(lookUpType), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        saveLookUpTypeLookupControllerService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/exists/{id}")
    public ResponseEntity<Boolean> existsById(@PathVariable Long id){
        return new ResponseEntity<>(saveLookUpTypeLookupControllerService.existsById(id), HttpStatus.OK);
    }

    @GetMapping("/generateCode")
    public ResponseEntity<LookUpType> generateCode(@RequestBody LookUpType lookUpType){
        return new ResponseEntity<>(saveLookUpTypeLookupControllerService.generateCode(lookUpType), HttpStatus.OK);
    }

    @PutMapping("/updateLookupValues")
    public ResponseEntity<LookUpType> updateLookUpValues(@RequestBody LookUpType lookUpType){
        return new ResponseEntity<>(saveLookUpTypeLookupControllerService.updateLookUpValues(lookUpType), HttpStatus.OK);
    }

}