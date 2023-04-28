package com.sa.fund.master.lookupcontroller.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.master.lookupcontroller.model.MstLookUpTypesEntity;
import com.sa.fund.master.lookupcontroller.service.MstPageLookUpTypeService;

@RestController
@RequestMapping("/lookup")
public class MstLookUpTypeController {

    @Autowired
    private MstPageLookUpTypeService mstPageLookUpTypeService;

    @GetMapping("/{id}")
    public Optional<MstLookUpTypesEntity> getByIdAndIsActiveTrue(@PathVariable Long id) {
        return mstPageLookUpTypeService.getByIdAndIsActiveTrue(id);
    }

    @GetMapping("/code/{code}")
    public Optional<MstLookUpTypesEntity> getByCodeAndIsActiveTrue(@PathVariable String code) {
        return mstPageLookUpTypeService.getByCodeAndIsActiveTrue(code);
    }

    @GetMapping("/all")
    public List<MstLookUpTypesEntity> getAllByIsActiveTrue() {
        return mstPageLookUpTypeService.getAllByIsActiveTrue();
    }
}