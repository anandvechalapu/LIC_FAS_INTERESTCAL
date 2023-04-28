package com.sa.fund.interest.integration.supportcontroller.repository;

import com.sa.fund.interest.dto.ClaimDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FindApprovedPolicyClaimSupportControllerRepository {

    public List<ClaimDto> findApprovedPolicyClaims(String financialYear, String policyId) {
        List<ClaimDto> claims = new ArrayList<>();
        ClaimDto claimDto = new ClaimDto();
        claims.add(claimDto);
        return claims;
    }
}

//Generated Spring Boot Controller Class

package com.sa.fund.interest.integration.supportcontroller.controller;

import com.sa.fund.interest.dto.ClaimDto;
import com.sa.fund.interest.integration.supportcontroller.model.ClaimDto;
import com.sa.fund.interest.integration.supportcontroller.service.FindApprovedPolicyClaimSupportControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/policy")
public class FindApprovedPolicyClaimSupportController {

    @Autowired
    private FindApprovedPolicyClaimSupportControllerService findApprovedPolicyClaimSupportControllerService;

    @GetMapping("/findApprovedPolicyClaims")
    public List<ClaimDto> findApprovedPolicyClaims(@RequestParam String financialYear, @RequestParam String policyId) {
        return findApprovedPolicyClaimSupportControllerService.findApprovedPolicyClaims(financialYear, policyId);
    }

}