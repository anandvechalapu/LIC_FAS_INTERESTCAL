package com.sa.fund.interest.controller.policytransactioncontroller.repository;

import com.sa.fund.interest.controller.policytransactioncontroller.dto.AccountsDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebitPolicyTransactionControllerRepository extends JpaRepository<AccountsDto,Long> {

    public AccountsDto findByPolicyId(Long policyId);
	public AccountsDto findByTxnAmount(Double txnAmount);
	public AccountsDto findByEffectiveTxnDate(String effectiveTxnDate);
	public AccountsDto findByTxnSubType(String txnSubType);
	public AccountsDto save(AccountsDto accountsDto);
	public AccountsDto update(AccountsDto accountsDto);
}