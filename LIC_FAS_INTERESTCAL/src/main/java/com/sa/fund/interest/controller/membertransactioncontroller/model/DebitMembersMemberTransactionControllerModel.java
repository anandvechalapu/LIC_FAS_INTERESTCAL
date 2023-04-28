package com.sa.fund.interest.controller.membertransactioncontroller.model;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import org.springframework.beans.BeanUtils;

import com.sa.fund.interest.exception.InsufficientFundsException;
import com.sa.fund.interest.model.CommonResponseDto;
import com.sa.fund.interest.model.DebitRequestDto;
import com.sa.fund.interest.model.MembersDto;
import com.sa.fund.interest.model.entity.MemberFundHistoryV2Entity;

public class DebitMembersMemberTransactionControllerModel {

    private EntityManager entityManager;

    public DebitMembersMemberTransactionControllerModel(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public CommonResponseDto debitMemberAccount(DebitRequestDto debitRequestDto) {
        MembersDto membersDto = new MembersDto();
        BeanUtils.copyProperties(debitRequestDto, membersDto);
        MemberFundHistoryV2Entity memberFundHistoryV2Entity = entityManager.find(MemberFundHistoryV2Entity.class, debitRequestDto.getMemberId());
        
        //validate effective date of entity
        if (memberFundHistoryV2Entity.getEffectiveDate().isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Invalid effective date of entity.");
        }
        //check if policy is an exit policy
        if (memberFundHistoryV2Entity.isExitPolicy()) {
            throw new UnsupportedOperationException("Cannot debit from an exit policy.");
        }
        //check if closing balance is greater than or equal to debit amount
        if (memberFundHistoryV2Entity.getClosingBalance() < debitRequestDto.getDebitAmount()) {
            throw new InsufficientFundsException("Insufficient funds.");
        }
        
        //save debit transaction
        memberFundHistoryV2Entity.setClosingBalance(memberFundHistoryV2Entity.getClosingBalance() - debitRequestDto.getDebitAmount());
        entityManager.persist(memberFundHistoryV2Entity);
        
        //calculate interest rate for debit transaction
        double interestRate = calculateInterestRate(debitRequestDto.getDebitAmount(), memberFundHistoryV2Entity.getClosingBalance());
        
        //execute policy batch if necessary
        if (memberFundHistoryV2Entity.isBatchExecutionRequired()) {
            executePolicyBatch();
        }

        //return CommonResponseDto containing updated account details
        return new CommonResponseDto(membersDto, interestRate);
    }

    private double calculateInterestRate(double debitAmount, double closingBalance) {
        //TODO: implement interest rate calculation
        return 0.0;
    }

    private void executePolicyBatch() {
        //TODO: implement policy batch execution
    }
}