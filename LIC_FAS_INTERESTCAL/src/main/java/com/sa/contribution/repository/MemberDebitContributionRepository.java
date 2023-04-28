package com.sa.contribution.repository;

import com.sa.contribution.dto.DebitRequestDto;
import com.sa.contribution.dto.CommonResponseDto;

import org.springframework.stereotype.Repository;

@Repository
public interface MemberDebitContributionRepository {

    CommonResponseDto debitContribution(DebitRequestDto debitRequestDto);
}