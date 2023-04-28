package com.sa.fund.master.lookupcontroller.repository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

public interface DecodeLookupControllerRepository {

    public ResponseEntity decode(@RequestParam(value="input") String input);

}

package com.sa.fund.master.lookupcontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.master.lookupcontroller.service.DecodeLookupControllerService;

@RestController
public class DecodeLookupController {
    @Autowired
    private DecodeLookupControllerService decodeLookupControllerService;

    @GetMapping("/decode")
    public ResponseEntity decode(@RequestParam(value="input") String input) {
        return decodeLookupControllerService.decode(input);
    }
}