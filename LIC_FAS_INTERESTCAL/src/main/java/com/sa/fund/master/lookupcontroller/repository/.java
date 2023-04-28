package com.sa.fund.master.lookupcontroller.repository; 

import org.springframework.stereotype.Repository;
import java.util.Base64;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Repository
public class DecodeLookupControllerRepository {

    public ResponseEntity decode(@RequestParam(value="input") String input) {
        if (input == null || input.isEmpty()) {
            return ResponseEntity.status(400).body("Bad Request: Input string is null or empty");
        }
        try {
            String decodedString = new String(Base64.getDecoder().decode(input));
            return ResponseEntity.status(200).body(decodedString);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(400).body("Bad Request: Input string cannot be decoded due to an invalid format or any other error");
        }
    }
}