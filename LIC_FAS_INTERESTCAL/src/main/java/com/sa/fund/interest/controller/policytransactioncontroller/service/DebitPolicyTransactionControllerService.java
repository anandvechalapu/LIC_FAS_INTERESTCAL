package com.sa.fund.interest.controller.policytransactioncontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.fund.interest.controller.policytransactioncontroller.dto.AccountsDto;
import com.sa.fund.interest.controller.policytransactioncontroller.repository.DebitPolicyTransactionControllerRepository;

@Service
public class DebitPolicyTransactionControllerService {
	
	@Autowired
	private DebitPolicyTransactionControllerRepository repository;
	
	public AccountsDto findByPolicyId(Long policyId) {
		return repository.findByPolicyId(policyId);
	}
	
	public AccountsDto findByTxnAmount(Double txnAmount) {
		return repository.findByTxnAmount(txnAmount);
	}
	
	public AccountsDto findByEffectiveTxnDate(String effectiveTxnDate) {
		return repository.findByEffectiveTxnDate(effectiveTxnDate);
	}
	
	public AccountsDto findByTxnSubType(String txnSubType) {
		return repository.findByTxnSubType(txnSubType);
	}
	
	public AccountsDto save(AccountsDto accountsDto) {
		return repository.save(accountsDto);
	}
	
	public AccountsDto update(AccountsDto accountsDto) {
		Optional<AccountsDto> optionalAccountsDto = repository.findById(accountsDto.getId());
		
		if (optionalAccountsDto.isPresent()) {
			AccountsDto accountsDto1 = optionalAccountsDto.get();
			
			//Update the fields
			
			return repository.save(accountsDto1);
		}
		
		return null;
	}
}