package com.sa.fund.interest.controller.policybatchcontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.fund.interest.controller.policybatchcontroller.model.BatchRequestResponse;
import com.sa.fund.interest.controller.policybatchcontroller.repository.BatchRequestResponseRepository;

@Service
public class BatchRequestResponseService {

	@Autowired
	private BatchRequestResponseRepository batchRequestResponseRepository;

	public BatchRequestResponse executeBatchByPolicy_PolicyBatchController(Long policyNumber) {
		return batchRequestResponseRepository.executeBatchByPolicy_PolicyBatchController(policyNumber);
	}

	public List<BatchRequestResponse> getAllBatchByPolicy_PolicyBatchController() {
		return batchRequestResponseRepository.findAll();
	}

	public BatchRequestResponse saveBatchByPolicy_PolicyBatchController(BatchRequestResponse batchRequestResponse) {
		return batchRequestResponseRepository.save(batchRequestResponse);
	}

	public void deleteBatchByPolicy_PolicyBatchController(Long policyNumber) {
		batchRequestResponseRepository.deleteById(policyNumber);
	}
}