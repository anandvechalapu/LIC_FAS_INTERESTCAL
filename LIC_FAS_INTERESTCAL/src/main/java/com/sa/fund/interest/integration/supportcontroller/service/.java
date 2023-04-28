atchStatus() {
        return batchStatus;
    }

    public void setBatchStatus(String batchStatus) {
        this.batchStatus = batchStatus;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }
}

//ClaimService.java

package com.sa.fund.interest.integration.supportcontroller.service;

import com.sa.fund.interest.integration.supportcontroller.dto.ClaimDto;

import java.util.List;

public interface ClaimService {

    ClaimDto saveClaim(ClaimDto claimDto);

    List<ClaimDto> getClaims();

    ClaimDto getClaimById(Long id);

    void deleteClaim(Long id);
}