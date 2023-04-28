package com.sa.fund.interest.integration.supportcontroller.service;

import com.sa.fund.interest.integration.supportcontroller.dto.FundChangeDto;
import com.sa.fund.interest.integration.supportcontroller.repository.ProcessPolicyMemberByServiceId_SupportControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessPolicyMemberByServiceId_SupportControllerService {

    @Autowired
    ProcessPolicyMemberByServiceId_SupportControllerRepository processPolicyMemberByServiceId_SupportControllerRepository;

    public int updateFundChangeDto(String service_id, String source_policy_id, String destination_policy_id, String id) {
        return processPolicyMemberByServiceId_SupportControllerRepository.updateFundChangeDto(service_id, source_policy_id, destination_policy_id, id);
    }

    public List<FundChangeDto> findByServiceIdOrSourceAndDestinationPolicies(String service_id, String source_policy_id, String destination_policy_id) {
        return processPolicyMemberByServiceId_SupportControllerRepository.findByServiceIdOrSourceAndDestinationPolicies(service_id, source_policy_id, destination_policy_id);
    }
}