package com.sa.fund.interest.integration.fundintegrationcontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sa.fund.interest.integration.fundintegrationcontroller.model.MemberTransferOutIn;
import com.sa.fund.interest.integration.fundintegrationcontroller.repository.MemberTransferOutInRepository;

@Service
@Transactional
public class MemberTransferOutInService {
    
    @Autowired
    private MemberTransferOutInRepository memberTransferOutInRepository;
    
    public MemberTransferOutIn saveMemberTransferOutIn(MemberTransferOutIn memberTransferOutIn) {
        return memberTransferOutInRepository.save(memberTransferOutIn);
    }
    
    public List<MemberTransferOutIn> getAllMemberTransferOutIn() {
        return memberTransferOutInRepository.findAll();
    }
    
    public MemberTransferOutIn getMemberTransferOutInById(Long memberTransferOutInId) {
        return memberTransferOutInRepository.findById(memberTransferOutInId).orElse(null);
    }
    
    public void deleteMemberTransferOutInById(Long memberTransferOutInId) {
        memberTransferOutInRepository.deleteById(memberTransferOutInId);
    }
}