package com.sa.fund.master.lookupcontroller.service;

import com.sa.fund.master.lookupcontroller.model.EncodeLookup;
import com.sa.fund.master.lookupcontroller.repository.EncodeLookupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EncodeLookupService {

    @Autowired
    private EncodeLookupRepository encodeLookupRepository;

    public EncodeLookup saveEncodeLookup(EncodeLookup encodeLookup) {
        return encodeLookupRepository.save(encodeLookup);
    }

    public Optional<EncodeLookup> getEncodeLookupByPayload(String payload) {
        return encodeLookupRepository.findByPayload(payload);
    }

}