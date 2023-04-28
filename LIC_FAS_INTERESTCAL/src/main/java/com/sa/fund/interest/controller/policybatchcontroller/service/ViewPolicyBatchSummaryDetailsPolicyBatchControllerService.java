package com.sa.fund.interest.controller.policybatchcontroller.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sa.fund.interest.controller.policybatchcontroller.model.ViewPolicyBatchSummaryDetailsPolicyBatchController;
import com.sa.fund.interest.controller.policybatchcontroller.repository.ViewPolicyBatchSummaryDetailsPolicyBatchControllerRepository;

@Service
public class ViewPolicyBatchSummaryDetailsPolicyBatchControllerService {

    @Autowired
    private ViewPolicyBatchSummaryDetailsPolicyBatchControllerRepository viewPolicyBatchSummaryDetailsPolicyBatchControllerRepository;

    public Optional<ViewPolicyBatchSummaryDetailsPolicyBatchController> findByBatchNumber(String batchNumber) {
        return viewPolicyBatchSummaryDetailsPolicyBatchControllerRepository.findByBatchNumber(batchNumber);
    }

    public List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByBatchNumberAsc(Pageable pageable) {
        return viewPolicyBatchSummaryDetailsPolicyBatchControllerRepository.findAllByOrderByBatchNumberAsc(pageable);
    }

    public List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByBatchNumberDesc(Pageable pageable) {
        return viewPolicyBatchSummaryDetailsPolicyBatchControllerRepository.findAllByOrderByBatchNumberDesc(pageable);
    }

    public List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByBatchDateAsc(Pageable pageable) {
        return viewPolicyBatchSummaryDetailsPolicyBatchControllerRepository.findAllByOrderByBatchDateAsc(pageable);
    }

    public List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByBatchDateDesc(Pageable pageable) {
        return viewPolicyBatchSummaryDetailsPolicyBatchControllerRepository.findAllByOrderByBatchDateDesc(pageable);
    }

    public List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByFinancialYearAsc(Pageable pageable) {
        return viewPolicyBatchSummaryDetailsPolicyBatchControllerRepository.findAllByOrderByFinancialYearAsc(pageable);
    }

    public List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByFinancialYearDesc(Pageable pageable) {
        return viewPolicyBatchSummaryDetailsPolicyBatchControllerRepository.findAllByOrderByFinancialYearDesc(pageable);
    }

    public List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByRemarksAsc(Pageable pageable) {
        return viewPolicyBatchSummaryDetailsPolicyBatchControllerRepository.findAllByOrderByRemarksAsc(pageable);
    }

    public List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByRemarksDesc(Pageable pageable) {
        return viewPolicyBatchSummaryDetailsPolicyBatchControllerRepository.findAllByOrderByRemarksDesc(pageable);
    }

    public List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByBatchTypeAsc(Pageable pageable) {
        return viewPolicyBatchSummaryDetailsPolicyBatchControllerRepository.findAllByOrderByBatchTypeAsc(pageable);
    }

    public List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByBatchTypeDesc(Pageable pageable) {
        return viewPolicyBatchSummaryDetailsPolicyBatchControllerRepository.findAllByOrderByBatchTypeDesc(pageable);
    }

    public List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByCurrentQuarterAsc(Pageable pageable) {
        return viewPolicyBatchSummaryDetailsPolicyBatchControllerRepository.findAllByOrderByCurrentQuarterAsc(pageable);
    }

    public List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByCurrentQuarterDesc(Pageable pageable) {
        return viewPolicyBatchSummaryDetailsPolicyBatchControllerRepository.findAllByOrderByCurrentQuarterDesc(pageable);
