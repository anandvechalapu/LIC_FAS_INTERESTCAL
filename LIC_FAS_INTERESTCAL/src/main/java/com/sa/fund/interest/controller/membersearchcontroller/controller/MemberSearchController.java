package com.sa.fund.interest.controller.membersearchcontroller.controller;

import com.sa.fund.interest.controller.membersearchcontroller.model.CommonResponseDto;
import com.sa.fund.interest.controller.membersearchcontroller.service.MemberSearchControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberSearchController {
 
    @Autowired
    MemberSearchControllerService memberSearchControllerService;
 
    @GetMapping("/search")
    public CommonResponseDto<Object> searchByMember(@RequestParam String code) {
        return memberSearchControllerService.searchByMember(code);
    }
}