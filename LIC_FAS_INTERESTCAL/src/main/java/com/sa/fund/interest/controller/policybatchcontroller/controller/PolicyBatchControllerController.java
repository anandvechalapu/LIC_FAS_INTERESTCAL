package com.sa.fund.interest.controller.policybatchcontroller.controller;

import com.sa.fund.interest.controller.policybatchcontroller.model.PolicyMasterEntity;
import com.sa.fund.interest.controller.policybatchcontroller.service.PolicyBatchControllerService;
import com.sa.fund.interest.controller.policybatchcontroller.service.PolicyBatchControllerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/policies")
public class PolicyBatchControllerController {

    @Autowired
    private PolicyBatchControllerService policyBatchControllerService;

    @GetMapping("/all-by-active-and-financial-year")
    public List<PolicyMasterEntity> findAllByIsActiveAndFinancialYearAndPredicates(@RequestParam(value = "isActive", required = true) Boolean isActive,
                                                                                  @RequestParam(value = "financialYear", required = true) String financialYear,
                                                                                  @RequestParam(value = "predicates", required = true) PolicyBatchControllerServiceImpl.Predicates predicates) {
        return policyBatchControllerService.findAllByIsActiveAndFinancialYearAndPredicates(isActive, financialYear, predicates);
    }

    @GetMapping("/all-by-active-and-financial-year-order-by-modified-on-desc")
    public List<PolicyMasterEntity> findAllByIsActiveAndFinancialYearOrderByModifiedOnDesc(@RequestParam(value = "isActive", required = true) Boolean isActive,
                                                                                          @RequestParam(value = "financialYear", required = true) String financialYear) {
        return policyBatchControllerService.findAllByIsActiveAndFinancialYearOrderByModifiedOnDesc(isActive, financialYear);
    }

    @GetMapping("/search-policy")
    public List<PolicyMasterEntity> searchPolicy(@RequestParam(value = "policyId", required = true) String policyId,
                                                 @RequestParam(value = "policyNumber", required = true) String policyNumber) {
        return policyBatchControllerService.searchPolicy(policyId, policyNumber);
    }
}