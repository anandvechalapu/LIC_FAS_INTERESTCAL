package com.sa.fund.master.lookupcontroller.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.sa.fund.master.lookupcontroller.repository.DecodeLookupControllerRepository;

@Service
public class DecodeLookupControllerService {
    private DecodeLookupControllerRepository decodeLookupControllerRepository;

    public DecodeLookupControllerService(DecodeLookupControllerRepository decodeLookupControllerRepository) {
        this.decodeLookupControllerRepository = decodeLookupControllerRepository;
    }

    public ResponseEntity decode(@RequestParam(value="input") String input) {
        return decodeLookupControllerRepository.decode(input);
    }
}