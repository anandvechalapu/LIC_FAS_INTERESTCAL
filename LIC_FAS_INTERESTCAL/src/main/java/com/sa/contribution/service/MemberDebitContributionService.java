package com.sa.contribution.service;

import com.sa.contribution.dto.CommonResponseDto;
import com.sa.contribution.dto.DebitRequestDto;
import com.sa.contribution.repository.MemberDebitContributionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberDebitContributionService {

    @Autowired
    private MemberDebitContributionRepository memberDebitContributionRepository;

    public CommonResponseDto debitContribution(DebitRequestDto debitRequestDto){
        return memberDebitContributionRepository.debitContribution(debitRequestDto);
    }
}