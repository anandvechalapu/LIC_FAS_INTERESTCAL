package com.sa.fund.master.lookupcontroller.controller;

import com.sa.fund.master.lookupcontroller.model.MstPageLookUpValue;
import com.sa.fund.master.lookupcontroller.service.MstPageLookUpValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class MstPageLookUpValueController {

    private final MstPageLookUpValueService mstPageLookUpValueService;

    @Autowired
    public MstPageLookUpValueController(MstPageLookUpValueService mstPageLookUpValueService) {
        this.mstPageLookUpValueService = mstPageLookUpValueService;
    }

    @GetMapping("/lookup/{code}")
    public Optional<MstPageLookUpValue> getMstPageLookUpValueByCode(@PathVariable String code) {
        return mstPageLookUpValueService.findByCodeAndIsActiveTrue(code);
    }

}