package com.sa.fund.interest.controller.policybatchcontroller.service;

import com.sa.fund.interest.controller.policybatchcontroller.repository.PolicyBatchList_PolicyBatchControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PolicyBatchList_PolicyBatchControllerService {

  @Autowired
  private PolicyBatchList_PolicyBatchControllerRepository policyBatchList_PolicyBatchControllerRepository;

  @Transactional
  public List<Object[]> getPolicyBatchList(Long policyId, String transactionDate) {
    return policyBatchList_PolicyBatchControllerRepository.getPolicyBatchList(policyId, transactionDate);
  }

}