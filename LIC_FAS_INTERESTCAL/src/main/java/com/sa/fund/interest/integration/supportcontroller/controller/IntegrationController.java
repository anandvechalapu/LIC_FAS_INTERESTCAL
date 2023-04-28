//BatchService.java

package com.sa.fund.interest.integration.supportcontroller.service;

import com.sa.fund.interest.integration.supportcontroller.dto.BatchDto;

public interface BatchService {

    BatchDto saveBatch(BatchDto batchDto);

    BatchDto getBatchByNumber(String batchNumber);

    void deleteBatch(String batchNumber);

}

//Spring Boot Controller

package com.sa.fund.interest.integration.supportcontroller.controller;

import com.sa.fund.interest.integration.supportcontroller.dto.ClaimDto;
import com.sa.fund.interest.integration.supportcontroller.dto.BatchDto;
import com.sa.fund.interest.integration.supportcontroller.service.ClaimService;
import com.sa.fund.interest.integration.supportcontroller.service.BatchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class IntegrationController {

    @Autowired
    private ClaimService claimService;

    @Autowired
    private BatchService batchService;

    @PostMapping("claims")
    public ClaimDto saveClaim(@RequestBody ClaimDto claimDto) {
        return claimService.saveClaim(claimDto);
    }

    @GetMapping("claims")
    public List<ClaimDto> getClaims() {
        return claimService.getClaims();
    }

    @GetMapping("claims/{id}")
    public ClaimDto getClaimById(@PathVariable Long id) {
        return claimService.getClaimById(id);
    }

    @DeleteMapping("claims/{id}")
    public void deleteClaim(@PathVariable Long id) {
        claimService.deleteClaim(id);
    }

    @PostMapping("batches")
    public BatchDto saveBatch(@RequestBody BatchDto batchDto) {
        return batchService.saveBatch(batchDto);
    }

    @GetMapping("batches/{batchNumber}")
    public BatchDto getBatchByNumber(@PathVariable String batchNumber) {
        return batchService.getBatchByNumber(batchNumber);
    }

    @DeleteMapping("batches/{batchNumber}")
    public void deleteBatch(@PathVariable String batchNumber) {
        batchService.deleteBatch(batchNumber);
    }
}