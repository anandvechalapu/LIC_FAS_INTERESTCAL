package com.sa.fund.interest.integration.fundintegrationcontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.integration.fundintegrationcontroller.model.MemberTransferOutIn;
import com.sa.fund.interest.integration.fundintegrationcontroller.service.MemberTransferOutInService;

@RestController
@RequestMapping("/api/memberTransferOutIn")
public class MemberTransferOutInController {

    @Autowired
    private MemberTransferOutInService memberTransferOutInService;
    
    @PostMapping
    public MemberTransferOutIn createMemberTransferOutIn(@RequestBody MemberTransferOutIn memberTransferOutIn) {
        return memberTransferOutInService.saveMemberTransferOutIn(memberTransferOutIn);
    }
    
    @GetMapping
    public List<MemberTransferOutIn> getAllMemberTransferOutIn() {
        return memberTransferOutInService.getAllMemberTransferOutIn();
    }
    
    @GetMapping("/{id}")
    public MemberTransferOutIn getMemberTransferOutInById(@PathVariable Long id) {
        return memberTransferOutInService.getMemberTransferOutInById(id);
    }
    
    @PutMapping
    public MemberTransferOutIn updateMemberTransferOutIn(@RequestBody MemberTransferOutIn memberTransferOutIn) {
        return memberTransferOutInService.saveMemberTransferOutIn(memberTransferOutIn);
    }
    
    @DeleteMapping("/{id}")
    public void deleteMemberTransferOutInById(@PathVariable Long id) {
        memberTransferOutInService.deleteMemberTransferOutInById(id);
    }
    
}