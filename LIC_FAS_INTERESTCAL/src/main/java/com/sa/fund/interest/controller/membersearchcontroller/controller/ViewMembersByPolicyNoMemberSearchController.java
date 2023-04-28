package com.sa.fund.interest.controller.membersearchcontroller.controller;

import com.sa.fund.interest.controller.membersearchcontroller.model.Member;
import com.sa.fund.interest.controller.membersearchcontroller.service.ViewMembersByPolicyNoMemberSearchControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/members")
public class ViewMembersByPolicyNoMemberSearchController {

    @Autowired
    private ViewMembersByPolicyNoMemberSearchControllerService viewMembersByPolicyNoMemberSearchControllerService;

    @GetMapping("/{policyNumber}")
    public ResponseEntity<List<Member>> getMembersByPolicyNumber(@PathVariable String policyNumber) {
        List<Member> members = viewMembersByPolicyNoMemberSearchControllerService.findByPolicyNumber(policyNumber);
        if (members == null || members.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(members, HttpStatus.OK);
    }
}