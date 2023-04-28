package com.sa.fund.interest.controller.policysearchcontroller.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sa.fund.interest.controller.policysearchcontroller.repository.PolicySearchControllerRepository;

@Service
public class PolicySearchControllerService {

    private PolicySearchControllerRepository policySearchControllerRepository;

    @Autowired
    public PolicySearchControllerService(PolicySearchControllerRepository policySearchControllerRepository) {
        this.policySearchControllerRepository = policySearchControllerRepository;
    }

    public ResponseEntity<?> searchByPolicyNo(String policyNumber) {
        return policySearchControllerRepository.searchByPolicyNo(policyNumber);
    }

}