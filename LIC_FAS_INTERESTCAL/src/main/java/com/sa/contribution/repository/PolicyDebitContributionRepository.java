package com.sa.contribution.repository;

import com.sa.contribution.dto.DebitRequestDto;
import com.sa.contribution.dto.CommonResponseDto;

public interface PolicyDebitContributionRepository {

    CommonResponseDto processDebitRequest(DebitRequestDto debitRequestDto);

    void logDebitTransaction(DebitRequestDto debitRequestDto);

}