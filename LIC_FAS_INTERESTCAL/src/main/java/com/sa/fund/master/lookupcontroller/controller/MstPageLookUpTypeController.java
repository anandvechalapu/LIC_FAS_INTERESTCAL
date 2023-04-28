package com.sa.fund.master.lookupcontroller.controller;

import com.sa.fund.master.lookupcontroller.dto.LookUpValuesDto;
import com.sa.fund.master.lookupcontroller.entity.MstPageLookUpType;
import com.sa.fund.master.lookupcontroller.service.MstPageLookUpTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/lookup")
public class MstPageLookUpTypeController {

    @Autowired
    private MstPageLookUpTypeService mstPageLookUpTypeService;

    @GetMapping("/{id}")
    public Optional<MstPageLookUpType> getMstPageLookUpTypeById(@PathVariable Long id) {
        return mstPageLookUpTypeService.getMstPageLookUpTypeById(id);
    }

    @PostMapping
    public LookUpValuesDto mapPageLookUpTypeAndValueEntityToDto(@RequestBody MstPageLookUpType mstPageLookUpType) {
        return mstPageLookUpTypeService.mapPageLookUpTypeAndValueEntityToDto(mstPageLookUpType);
    }
}