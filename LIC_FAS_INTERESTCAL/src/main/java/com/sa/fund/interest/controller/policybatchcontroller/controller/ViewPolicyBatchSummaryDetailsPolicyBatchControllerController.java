}

    public List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByPolicyIdAsc(Pageable pageable) {
        return viewPolicyBatchSummaryDetailsPolicyBatchControllerRepository.findAllByOrderByPolicyIdAsc(pageable);
    }

    public List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByPolicyIdDesc(Pageable pageable) {
        return viewPolicyBatchSummaryDetailsPolicyBatchControllerRepository.findAllByOrderByPolicyIdDesc(pageable);
    }
}

package com.sa.fund.interest.controller.policybatchcontroller.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.controller.policybatchcontroller.model.ViewPolicyBatchSummaryDetailsPolicyBatchController;
import com.sa.fund.interest.controller.policybatchcontroller.service.ViewPolicyBatchSummaryDetailsPolicyBatchControllerService;

@RestController
@RequestMapping("/policyBatchController/v1")
public class ViewPolicyBatchSummaryDetailsPolicyBatchControllerController {

    @Autowired
    private ViewPolicyBatchSummaryDetailsPolicyBatchControllerService viewPolicyBatchSummaryDetailsPolicyBatchControllerService;

    @GetMapping("/byBatchNumber/{batchNumber}")
    public Optional<ViewPolicyBatchSummaryDetailsPolicyBatchController> getByBatchNumber(@PathVariable String batchNumber) {
        return viewPolicyBatchSummaryDetailsPolicyBatchControllerService.findByBatchNumber(batchNumber);
    }

    @GetMapping("/orderByBatchNumberAsc")
    public List<ViewPolicyBatchSummaryDetailsPolicyBatchController> getAllByOrderByBatchNumberAsc(Pageable pageable) {
        return viewPolicyBatchSummaryDetailsPolicyBatchControllerService.findAllByOrderByBatchNumberAsc(pageable);
    }

    @GetMapping("/orderByBatchNumberDesc")
    public List<ViewPolicyBatchSummaryDetailsPolicyBatchController> getAllByOrderByBatchNumberDesc(Pageable pageable) {
        return viewPolicyBatchSummaryDetailsPolicyBatchControllerService.findAllByOrderByBatchNumberDesc(pageable);
    }

    @GetMapping("/orderByBatchDateAsc")
    public List<ViewPolicyBatchSummaryDetailsPolicyBatchController> getAllByOrderByBatchDateAsc(Pageable pageable) {
        return viewPolicyBatchSummaryDetailsPolicyBatchControllerService.findAllByOrderByBatchDateAsc(pageable);
    }

    @GetMapping("/orderByBatchDateDesc")
    public List<ViewPolicyBatchSummaryDetailsPolicyBatchController> getAllByOrderByBatchDateDesc(Pageable pageable) {
        return viewPolicyBatchSummaryDetailsPolicyBatchControllerService.findAllByOrderByBatchDateDesc(pageable);
    }

    @GetMapping("/orderByFinancialYearAsc")
    public List<ViewPolicyBatchSummaryDetailsPolicyBatchController> getAllByOrderByFinancialYearAsc(Pageable pageable) {
        return viewPolicyBatchSummaryDetailsPolicyBatchControllerService.findAllByOrderByFinancialYearAsc(pageable);
    }

    @GetMapping("/orderByFinancialYearDesc")
    public List<ViewPolicyBatchSummaryDetailsPolicyBatchController> getAllByOrderByFinancialYearDesc(Pageable pageable) {
        return viewPolicyBatchSummaryDetailsPolicyBatchControllerService.findAllByOrderByFinancialYearDesc(pageable);
    }

    @GetMapping("/orderByRemarksAsc")
    public List<ViewPolicyBatchSummaryDetailsPolicyBatchController> getAllByOrderByRemarksAsc(Pageable pageable) {
        return viewPolicyBatchSummaryDetailsPolicyBatchControllerService.findAllByOrderByRemarksAsc(pageable);
    }

    @