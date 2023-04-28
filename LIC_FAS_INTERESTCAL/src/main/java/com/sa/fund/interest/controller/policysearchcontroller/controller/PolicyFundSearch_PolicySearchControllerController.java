package com.sa.fund.interest.controller.policysearchcontroller.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.controller.policysearchcontroller.model.PolicyFundSearch;
import com.sa.fund.interest.controller.policysearchcontroller.service.PolicyFundSearch_PolicySearchControllerService;

@RestController
@RequestMapping("/policysearchcontroller")
public class PolicyFundSearch_PolicySearchControllerController {
	
	@Autowired
	private PolicyFundSearch_PolicySearchControllerService policyFundSearch_PolicySearchControllerService;
	
	@GetMapping("/product/{product}/variant/{variant}/transactionType/{transactionType}/transactionDate/{transactionDate}")
	public List<PolicyFundSearch> findByProductAndVariantAndTransactionTypeAndTransactionDate(@PathVariable("product") String product, @PathVariable("variant") String variant, @PathVariable("transactionType") String transactionType, @PathVariable("transactionDate") Date transactionDate){
		return policyFundSearch_PolicySearchControllerService.findByProductAndVariantAndTransactionTypeAndTransactionDate(product, variant, transactionType, transactionDate);
	}
	
	@GetMapping("/closingBalanceWithoutInterest/{closingBalanceWithoutInterest}")
	public List<PolicyFundSearch> findByClosingBalanceWithoutInterest(@PathVariable("closingBalanceWithoutInterest") BigDecimal closingBalanceWithoutInterest){
		return policyFundSearch_PolicySearchControllerService.findByClosingBalanceWithoutInterest(closingBalanceWithoutInterest);
	}
	
	@GetMapping("/fundSize/{fundSize}")
	public List<PolicyFundSearch> findByFundSize(@PathVariable("fundSize") long fundSize){
		return policyFundSearch_PolicySearchControllerService.findByFundSize(fundSize);
	}
	
	@GetMapping("/product/{product}")
	public List<PolicyFundSearch> findByProduct(@PathVariable("product") String product){
		return policyFundSearch_PolicySearchControllerService.findByProduct(product);
	}
	
	@GetMapping("/variant/{variant}")
	public List<PolicyFundSearch> findByVariant(@PathVariable("variant") String variant){
		return policyFundSearch_PolicySearchControllerService.findByVariant(variant);
	}
	
	@GetMapping("/transactionType/{transactionType}")
	public List<PolicyFundSearch> findByTransactionType(@PathVariable("transactionType") String transactionType){
		return policyFundSearch_PolicySearchControllerService.findByTransactionType(transactionType);
	}
	
	@GetMapping("/transactionDate/{transactionDate}")
	public List<PolicyFundSearch> findByTransactionDate(@PathVariable("transactionDate") Date transactionDate){
		return policyFundSearch_PolicySearchControllerService.findByTransactionDate(transactionDate);
	}
	
}