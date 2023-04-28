package com.sa.fund.interest.controller.membertransactioncontroller.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.controller.membertransactioncontroller.service.DebitMemberTransactionControllerService;
import com.sa.fund.interest.dto.CommonResponseDto;
import com.sa.fund.interest.dto.DebitRequestDto;
import com.sa.fund.interest.entity.MembersDto;

@RestController
@RequestMapping("/api/v1/transaction")
public class DebitMemberTransactionController {
    
    @Autowired
    private DebitMemberTransactionControllerService debitMemberTransactionControllerService;
    
    @PostMapping("/debit")
    public CommonResponseDto debitTransaction(@RequestBody DebitRequestDto debitRequestDto) {
        CommonResponseDto commonResponseDto = debitMemberTransactionControllerService.findByDebitRequestDto(debitRequestDto);
        if (commonResponseDto.isSuccess()) {
            MembersDto membersDto = debitMemberTransactionControllerService.findByMember(debitRequestDto.getMember());
            if (debitMemberTransactionControllerService.validateEffectiveDate(debitRequestDto.getEffectiveDate())) {
                if (debitMemberTransactionControllerService.isExitPolicy(debitRequestDto.getPolicy())) {
                    if (debitMemberTransactionControllerService.isClosingBalanceGreaterThanDebitAmount(membersDto.getClosingBalance(), debitRequestDto.getDebitAmount())) {
                        double interestRate = debitMemberTransactionControllerService.calculateInterestRate(membersDto.getInterestRate());
                        membersDto.setInterestRate(interestRate);
                        membersDto.setClosingBalance(membersDto.getClosingBalance() - debitRequestDto.getDebitAmount());
                        membersDto.setDebitAmount(debitRequestDto.getDebitAmount());
                        membersDto.setEffectiveDate(debitRequestDto.getEffectiveDate());
                        membersDto.setPolicy(debitRequestDto.getPolicy());
                        debitMemberTransactionControllerService.saveDebitTransaction(membersDto);
                        debitMemberTransactionControllerService.executePolicyBatch();
                        commonResponseDto.setSuccess(true);
                        commonResponseDto.setMessage("Debit transaction is success");
                    } else {
                        commonResponseDto.setSuccess(false);
                        commonResponseDto.setMessage("Debit transaction is fail, closing balance is not sufficient");
                    }
                } else {
                    commonResponseDto.setSuccess(false);
                    commonResponseDto.setMessage("Debit transaction is fail, policy not found");
                }
            } else {
                commonResponseDto.setSuccess(false);
                commonResponseDto.setMessage("Debit transaction is fail, effective date is not valid");
            }
        } else {
            commonResponseDto.setSuccess(false);
            commonResponseDto.setMessage("Debit transaction is fail, member not found");
        }
        return commonResponseDto;
    }
    
}