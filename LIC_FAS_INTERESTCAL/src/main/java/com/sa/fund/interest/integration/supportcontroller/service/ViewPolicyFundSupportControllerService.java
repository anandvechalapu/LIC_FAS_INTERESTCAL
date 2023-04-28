package com.sa.fund.interest.integration.supportcontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sa.fund.interest.integration.supportcontroller.dto.BatchDto;
import com.sa.fund.interest.integration.supportcontroller.dto.ResponseData;
import com.sa.fund.interest.integration.supportcontroller.repository.ViewPolicyFundSupportControllerRepository;

@Service
public class ViewPolicyFundSupportControllerService {

    @Autowired
    private ViewPolicyFundSupportControllerRepository viewPolicyFundSupportControllerRepository;

    @Transactional
    public ResponseData viewPolicyFund(Integer policyId, String policyNumber, String trnxDate, Boolean isBatch,
            Boolean isAuto, Boolean setOpeningBalance, Boolean recalculate) {
        ResponseData responseData = null;
        Optional<BatchDto> batchDto = viewPolicyFundSupportControllerRepository.findByPolicyIdAndPolicyNumberAndTrnxDateAndIsBatchAndIsAutoAndSetOpeningBalanceAndRecalculate(
                policyId, policyNumber, trnxDate, isBatch, isAuto, setOpeningBalance, recalculate);
        if (batchDto.isPresent()) {
            responseData = new ResponseData();
            responseData.setData(batchDto.get());
        }
        return responseData;
    }

}