package com.sa.fund.master.lookupcontroller.controller;

import com.sa.fund.master.lookupcontroller.model.EncodeLookup;
import com.sa.fund.master.lookupcontroller.service.EncodeLookupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/encodeLookup")
public class EncodeLookupController {

    @Autowired
    private EncodeLookupService encodeLookupService;

    @PostMapping
    public EncodeLookup saveEncodeLookup(@RequestBody EncodeLookup encodeLookup) {
        return encodeLookupService.saveEncodeLookup(encodeLookup);
    }

    @GetMapping("/{payload}")
    public Optional<EncodeLookup> getEncodeLookupByPayload(@PathVariable String payload) {
        return encodeLookupService.getEncodeLookupByPayload(payload);
    }

}