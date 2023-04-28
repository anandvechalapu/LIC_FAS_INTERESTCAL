package com.sa.fund.interest.controller.membertransactioncontroller.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.controller.membertransactioncontroller.model.MemberTransaction;
import com.sa.fund.interest.controller.membertransactioncontroller.service.MemberTransactionService;

@RestController
@RequestMapping("/member-transactions")
public class MemberTransactionController {

    @Autowired
    private MemberTransactionService memberTransactionService;

    @GetMapping
    public ResponseEntity<Object> getAllMemberTransactions() {
        return ResponseEntity.ok().body(memberTransactionService.getAllMemberTransactions());
    }

    @GetMapping("/{memberId}")
    public ResponseEntity<Object> getMemberTransactionById(@PathVariable Long memberId) {
        Optional<MemberTransaction> memberTransaction = memberTransactionService.getMemberTransactionById(memberId);
        if (!memberTransaction.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(memberTransaction.get());
    }

    @GetMapping("/transaction/{transactionId}")
    public ResponseEntity<Object> getMemberTransactionByTransactionId(@PathVariable Long transactionId) {
        Optional<MemberTransaction> memberTransaction = memberTransactionService.getMemberTransactionByTransactionId(transactionId);
        if (!memberTransaction.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(memberTransaction.get());
    }

    @GetMapping("/type/{transactionType}")
    public ResponseEntity<Object> getMemberTransactionByTransactionType(@PathVariable String transactionType) {
        Optional<MemberTransaction> memberTransaction = memberTransactionService.getMemberTransactionByTransactionType(transactionType);
        if (!memberTransaction.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(memberTransaction.get());
    }

    @GetMapping("/status/{transactionStatus}")
    public ResponseEntity<Object> getMemberTransactionByTransactionStatus(@PathVariable String transactionStatus) {
        Optional<MemberTransaction> memberTransaction = memberTransactionService.getMemberTransactionByTransactionStatus(transactionStatus);
        if (!memberTransaction.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(memberTransaction.get());
    }

    @PostMapping
    public ResponseEntity<Object> saveMemberTransaction(@RequestBody MemberTransaction memberTransaction) {
        return ResponseEntity.ok().body(memberTransactionService.saveMemberTransaction(memberTransaction));
    }

    @PutMapping("/{memberId}")
    public ResponseEntity<Object> updateMemberTransaction(@RequestBody MemberTransaction memberTransaction, @PathVariable Long memberId) {
        Optional<MemberTransaction> memberTransactionOptional = memberTransactionService.getMemberTransactionById(memberId);
        if (!memberTransactionOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(memberTransactionService.saveMemberTransaction(memberTransaction));
    }

    @DeleteMapping("/{memberId}")
    public ResponseEntity<Object> deleteMemberTransactionById(@PathVariable Long memberId) {
        memberTransactionService.deleteMemberTransactionById(memberId);
        return ResponseEntity.ok().build();
    }

}