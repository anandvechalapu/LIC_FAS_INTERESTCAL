package com.sa.fund.interest.controller.policybatchcontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.controller.policybatchcontroller.model.BatchRequestResponse;
import com.sa.fund.interest.controller.policybatchcontroller.service.BatchRequestResponseService;

@RestController
@RequestMapping("/policybatchcontroller")
public class BatchRequestResponseController {

	@Autowired
	private BatchRequestResponseService batchRequestResponseService;

	@GetMapping("/executebatch/{policyNumber}")
	public BatchRequestResponse executeBatchByPolicy_PolicyBatchController(@PathVariable Long policyNumber) {
		return batchRequestResponseService.executeBatchByPolicy_PolicyBatchController(policyNumber);
	}

	@GetMapping("/all")
	public List<BatchRequestResponse> getAllBatchByPolicy_PolicyBatchController() {
		return batchRequestResponseService.getAllBatchByPolicy_PolicyBatchController();
	}

	@PostMapping("/save")
	public BatchRequestResponse saveBatchByPolicy_PolicyBatchController(@RequestBody BatchRequestResponse batchRequestResponse) {
		return batchRequestResponseService.saveBatchByPolicy_PolicyBatchController(batchRequestResponse);
	}

	@PutMapping("/update")
	public BatchRequestResponse saveBatchByPolicy_PolicyBatchController(@RequestBody BatchRequestResponse batchRequestResponse) {
		return batchRequestResponseService.saveBatchByPolicy_PolicyBatchController(batchRequestResponse);
	}

	@DeleteMapping("/delete/{policyNumber}")
	public void deleteBatchByPolicy_PolicyBatchController(@PathVariable Long policyNumber) {
		batchRequestResponseService.deleteBatchByPolicy_PolicyBatchController(policyNumber);
	}
}