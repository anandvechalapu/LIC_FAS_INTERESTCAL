package com.sa.fund.interest.controller.policysearchcontroller.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.fund.interest.controller.policysearchcontroller.model.PolicyFundSearch;
import com.sa.fund.interest.controller.policysearchcontroller.repository.PolicyFundSearch_PolicySearchControllerRepository;

@Service
public class PolicyFundSearch_PolicySearchControllerService {

	@Autowired
	private PolicyFundSearch_PolicySearchControllerRepository policyFundSearch_PolicySearchControllerRepository;
	
	public List<PolicyFundSearch> findByProductAndVariantAndTransactionTypeAndTransactionDate(String product, String variant, String transactionType, Date transactionDate){
		return policyFundSearch_PolicySearchControllerRepository.findByProductAndVariantAndTransactionTypeAndTransactionDate(product, variant, transactionType, transactionDate);
	}
	
	public List<PolicyFundSearch> findByClosingBalanceWithoutInterest(BigDecimal closingBalanceWithoutInterest){
		return policyFundSearch_PolicySearchControllerRepository.findByClosingBalanceWithoutInterest(closingBalanceWithoutInterest);
	}
	
	public List<PolicyFundSearch> findByFundSize(long fundSize){
		return policyFundSearch_PolicySearchControllerRepository.findByFundSize(fundSize);
	}
	
	public List<PolicyFundSearch> findByProduct(String product){
		return policyFundSearch_PolicySearchControllerRepository.findByProduct(product);
	}
	
	public List<PolicyFundSearch> findByVariant(String variant){
		return policyFundSearch_PolicySearchControllerRepository.findByVariant(variant);
	}
	
	public List<PolicyFundSearch> findByTransactionType(String transactionType){
		return policyFundSearch_PolicySearchControllerRepository.findByTransactionType(transactionType);
	}
	
	public List<PolicyFundSearch> findByTransactionDate(Date transactionDate){
		return policyFundSearch_PolicySearchControllerRepository.findByTransactionDate(transactionDate);
	}
}