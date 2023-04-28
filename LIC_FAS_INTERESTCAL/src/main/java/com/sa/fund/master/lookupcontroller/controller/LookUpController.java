package com.sa.fund.master.lookupcontroller.controller;

import com.sa.fund.master.lookupcontroller.dto.CommonRequestDto;
import com.sa.fund.master.lookupcontroller.entity.MstLookUpTypesEntity;
import com.sa.fund.master.lookupcontroller.service.LookUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lookup")
public class LookUpController {

    @Autowired
    private LookUpService lookUpService;

    @GetMapping
    public ResponseEntity<List<MstLookUpTypesEntity>> getLookUpTypes(CommonRequestDto commonRequestDto){
        return ResponseEntity.status(HttpStatus.OK).body(lookUpService.getLookUpTypes(commonRequestDto));

    }

}