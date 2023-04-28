package com.sa.fund.interest.controller.membertransactioncontroller.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.fund.interest.dto.CommonResponseDto;
import com.sa.fund.interest.dto.DebitRequestDto;
import com.sa.fund.interest.entity.MemberFundHistoryV2Entity;
import com.sa.fund.interest.entity.MembersDto;
import com.sa.fund.interest.repository.DebitMemberTransactionControllerRepository;

@Service
public class DebitMemberTransactionControllerServiceImpl implements DebitMemberTransactionControllerService {
    
    @Autowired
    private DebitMemberTransactionControllerRepository debitMemberTransactionControllerRepository;
    
    @Override
    public CommonResponseDto findByDebitRequestDto(DebitRequestDto debitRequestDto) {
        return debitMemberTransactionControllerRepository.findByDebitRequestDto(debitRequestDto);
    }
    
    @Override
    public MemberFundHistoryV2Entity findByMember(MembersDto membersDto) {
        return debitMemberTransactionControllerRepository.findByMember(membersDto);
    }
    
    @Override
    public boolean validateEffectiveDate(Date effectiveDate) {
        return debitMemberTransactionControllerRepository.validateEffectiveDate(effectiveDate);
    }
    
    @Override
    public boolean isExitPolicy(String policy) {
        return debitMemberTransactionControllerRepository.isExitPolicy(policy);
    }
    
    @Override
    public boolean isClosingBalanceGreaterThanDebitAmount(int closingBalance, int debitAmount) {
        return debitMemberTransactionControllerRepository.isClosingBalanceGreaterThanDebitAmount(closingBalance, debitAmount);
    }
    
    @Override
    public void saveDebitTransaction(MembersDto membersDto) {
        debitMemberTransactionControllerRepository.saveDebitTransaction(membersDto);
    }
    
    @Override
    public double calculateInterestRate(double interestRate) {
        return debitMemberTransactionControllerRepository.calculateInterestRate(interestRate);
    }
    
    @Override
    public void executePolicyBatch() {
        debitMemberTransactionControllerRepository.executePolicyBatch();
    }
    
}