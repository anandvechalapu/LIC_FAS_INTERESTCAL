package com.sa.fund.interest.controller.membertransactioncontroller.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sa.fund.interest.controller.membertransactioncontroller.model.MemberTransaction;
import com.sa.fund.interest.controller.membertransactioncontroller.repository.MemberTransactionRepository;

@Service
public class MemberTransactionService {

    private MemberTransactionRepository memberTransactionRepository;

    public MemberTransactionService(MemberTransactionRepository memberTransactionRepository) {
        this.memberTransactionRepository = memberTransactionRepository;
    }

    public List<MemberTransaction> getAllMemberTransactions() {
        return memberTransactionRepository.findAll();
    }

    public Optional<MemberTransaction> getMemberTransactionById(Long memberId) {
        return memberTransactionRepository.findById(memberId);
    }

    public Optional<MemberTransaction> getMemberTransactionByTransactionId(Long transactionId) {
        return memberTransactionRepository.findByTransactionId(transactionId);
    }

    public Optional<MemberTransaction> getMemberTransactionByTransactionType(String transactionType) {
        return memberTransactionRepository.findByTransactionType(transactionType);
    }

    public Optional<MemberTransaction> getMemberTransactionByTransactionStatus(String transactionStatus) {
        return memberTransactionRepository.findByTransactionStatus(transactionStatus);
    }

    public MemberTransaction saveMemberTransaction(MemberTransaction memberTransaction) {
        return memberTransactionRepository.save(memberTransaction);
    }

    public void deleteMemberTransactionById(Long memberId) {
        memberTransactionRepository.deleteByMemberId(memberId);
    }
}