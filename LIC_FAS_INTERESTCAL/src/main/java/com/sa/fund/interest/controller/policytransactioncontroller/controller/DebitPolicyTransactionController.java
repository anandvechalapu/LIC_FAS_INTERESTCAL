package com.sa.fund.interest.controller.policytransactioncontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.controller.policytransactioncontroller.dto.AccountsDto;
import com.sa.fund.interest.controller.policytransactioncontroller.service.DebitPolicyTransactionControllerService;

@RestController
@RequestMapping("/api/v1/debit-policy-transaction-controller")
public class DebitPolicyTransactionController {
	
	@Autowired
	private DebitPolicyTransactionControllerService service;
	
	@GetMapping("/{policyId}")
	public ResponseEntity<AccountsDto> findByPolicyId(@PathVariable Long policyId) {
		
		AccountsDto accountsDto = service.findByPolicyId(policyId);
		
		if (accountsDto == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(accountsDto, HttpStatus.OK);
	}
	
	@GetMapping("/txn-amount/{txnAmount}")
	public ResponseEntity<AccountsDto> findByTxnAmount(@PathVariable Double txnAmount) {
		
		AccountsDto accountsDto = service.findByTxnAmount(txnAmount);
		
		if (accountsDto == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(accountsDto, HttpStatus.OK);
	}
	
	@GetMapping("/effective-txn-date/{effectiveTxnDate}")
	public ResponseEntity<AccountsDto> findByEffectiveTxnDate(@PathVariable String effectiveTxnDate) {
		
		AccountsDto accountsDto = service.findByEffectiveTxnDate(effectiveTxnDate);
		
		if (accountsDto == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(accountsDto, HttpStatus.OK);
	}
	
	@GetMapping("/txn-sub-type/{txnSubType}")
	public ResponseEntity<AccountsDto> findByTxnSubType(@PathVariable String txnSubType) {
		
		AccountsDto accountsDto = service.findByTxnSubType(txnSubType);
		
		if (accountsDto == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(accountsDto, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<AccountsDto> save(@RequestBody AccountsDto accountsDto) {
		
		AccountsDto accountsDto1 = service.save(accountsDto);
		
		if (accountsDto1 == null) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<>(accountsDto1, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<AccountsDto> update(@RequestBody AccountsDto accountsDto) {
		
		AccountsDto accountsDto1 = service.update(