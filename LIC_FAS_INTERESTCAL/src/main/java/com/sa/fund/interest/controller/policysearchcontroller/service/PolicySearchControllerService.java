package com.sa.fund.interest.controller.policysearchcontroller.service;

import com.sa.fund.interest.controller.policysearchcontroller.dto.AccountsDto;
import com.sa.fund.interest.controller.policysearchcontroller.dto.CommonRequestDto;
import com.sa.fund.interest.controller.policysearchcontroller.dto.CommonResponseDto;
import com.sa.fund.interest.controller.policysearchcontroller.entity.PolicyFundHistoryV2Entity;
import com.sa.fund.interest.controller.policysearchcontroller.entity.PolicyFundStmtV2Entity;
import com.sa.fund.interest.controller.policysearchcontroller.repository.PolicySearchControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PolicySearchControllerService {

    @Autowired
    private PolicySearchControllerRepository policySearchControllerRepository;

    public CommonResponseDto getAllPolicyFundHistoryV2Entities(CommonRequestDto commonRequestDto) {
        List<PolicyFundHistoryV2Entity> policyFundHistoryV2Entities = policySearchControllerRepository.getAllPolicyFundHistoryV2Entities(commonRequestDto);
        List<AccountsDto> accountsDtos = new ArrayList<>();
        for (PolicyFundHistoryV2Entity policyFundHistoryV2Entity : policyFundHistoryV2Entities) {
            PolicyFundStmtV2Entity policyFundStmtV2Entity = policyFundHistoryV2Entity.getPolicyFundStmtV2Entity();
            AccountsDto accountsDto = policySearchControllerRepository.getAllAccountsDtos(policyFundHistoryV2Entities, policyFundStmtV2Entity).get(0);
            accountsDtos.add(accountsDto);
        }
        CommonResponseDto commonResponseDto = new CommonResponseDto();
        commonResponseDto.setAccountsDtos(accountsDtos);
        return commonResponseDto;
    }
}