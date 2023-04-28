package com.sa.fund.interest.controller.membertransactioncontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sa.fund.interest.controller.membertransactioncontroller.model.MemberTransaction;

public interface MemberTransactionRepository extends JpaRepository<MemberTransaction, Long> {

    MemberTransaction findByMemberId(Long memberId);
    MemberTransaction save(MemberTransaction memberTransaction);

    void deleteByMemberId(Long memberId);
    
    MemberTransaction findByTransactionId(Long transactionId);
    
    MemberTransaction findByTransactionType(String transactionType);
    
    MemberTransaction findByTransactionStatus(String transactionStatus);
    
}