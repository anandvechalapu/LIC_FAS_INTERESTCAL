package com.sa.fund.interest.controller.membersearchcontroller.service;

import com.sa.fund.interest.controller.membersearchcontroller.model.Member;
import com.sa.fund.interest.controller.membersearchcontroller.model.CommonResponseDto;
import com.sa.fund.interest.controller.membersearchcontroller.repository.MemberSearchControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberSearchControllerService {
 
    @Autowired
    MemberSearchControllerRepository memberSearchControllerRepository;
 
    public CommonResponseDto<Object> searchByMember(String code) {
        Member member = memberSearchControllerRepository.findByCode(code);
        CommonResponseDto<Object> response = new CommonResponseDto<>();
        if (member == null) {
            response.setStatus("failure");
            response.setMessage("No member found");
            return response;
        }
        response.setStatus("success");
        response.setData(member);
        return response;
    }
}