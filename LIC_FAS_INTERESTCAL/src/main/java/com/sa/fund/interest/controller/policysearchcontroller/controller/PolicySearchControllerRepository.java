package com.sa.fund.interest.controller.policysearchcontroller.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.sa.fund.interest.controller.policysearchcontroller.model.PolicySearchControllerModel;

@Repository
public class PolicySearchControllerRepository {

    private EntityManager entityManager;

    @Autowired
    public PolicySearchControllerRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public ResponseEntity<?> searchByPolicyNo(String policyNumber) {
        List<PolicySearchControllerModel> resultList = entityManager.createQuery("from PolicySearchControllerModel where policyNumber = :policyNumber",
                PolicySearchControllerModel.class).setParameter("policyNumber", policyNumber).getResultList();
        if (resultList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        Map<String, Object> response = new HashMap<>();
        response.put("policySearchControllerModel", resultList);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}

package com.sa.fund.interest.controller.policysearchcontroller.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.controller.policysearchcontroller.service.PolicySearchControllerService;

@RestController
@RequestMapping("/policysearch")
public class PolicySearchController {

    private PolicySearchControllerService policySearchControllerService;

    @Autowired
    public PolicySearchController(PolicySearchControllerService policySearchControllerService) {
        this.policySearchControllerService = policySearchControllerService;
    }

    @GetMapping("/{policyNumber}")
    public ResponseEntity<?> searchByPolicyNo(@PathVariable String policyNumber) {
        return policySearchControllerService.searchByPolicyNo(policyNumber);
    }

}