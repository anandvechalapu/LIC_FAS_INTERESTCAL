package com.sa.fund.interest.integration.supportcontroller.service;

import com.sa.fund.interest.dto.ClaimDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FindApprovedPolicyClaimSupportControllerService {

    private FindApprovedPolicyClaimSupportControllerRepository findApprovedPolicyClaimSupportControllerRepository;

    public FindApprovedPolicyClaimSupportControllerService(FindApprovedPolicyClaimSupportControllerRepository findApprovedPolicyClaimSupportControllerRepository) {
        this.findApprovedPolicyClaimSupportControllerRepository = findApprovedPolicyClaimSupportControllerRepository;
    }

    public List<ClaimDto> findApprovedPolicyClaims(String financialYear, String policyId) {
        return findApprovedPolicyClaimSupportControllerRepository.findApprovedPolicyClaims(financialYear, policyId);
    }
}