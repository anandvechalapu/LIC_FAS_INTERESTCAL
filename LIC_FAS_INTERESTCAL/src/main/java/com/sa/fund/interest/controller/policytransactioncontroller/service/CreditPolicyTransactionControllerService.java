package com.sa.fund.interest.controller.policytransactioncontroller.service;

import com.sa.fund.interest.controller.policytransactioncontroller.dto.AccountDTO;
import com.sa.fund.interest.controller.policytransactioncontroller.entity.PolicyFundHistoryV2Entity;
import com.sa.fund.interest.controller.policytransactioncontroller.repository.CreditPolicyTransactionControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CreditPolicyTransactionControllerService {

    @Autowired
    CreditPolicyTransactionControllerRepository creditPolicyTransactionControllerRepository;

    /**
     * This method will validate the credit request for a list of account DTOs
     *
     * @param accounts list of AccountDTOs
     * @return list of AccountDTOs with updated statuses and status ids
     */
    @Transactional
    public List<AccountDTO> validateCreditRequest(List<AccountDTO> accounts) {
        List<String> accountIds = getAccountIds(accounts);
        creditPolicyTransactionControllerRepository.validateCreditRequest("validating", 0, "", accountIds);
        accounts = updateAccountsStatus(accounts, "validating", 0, "");
        return accounts;
    }

    /**
     * This method will save the credit details for a list of account DTOs
     *
     * @param accounts list of AccountDTOs
     * @return list of AccountDTOs with updated statuses and status ids
     */
    @Transactional
    public List<AccountDTO> saveCreditDetails(List<AccountDTO> accounts) {
        List<String> accountIds = getAccountIds(accounts);
        creditPolicyTransactionControllerRepository.saveCreditDetails("saving", 1, "", accountIds);
        accounts = updateAccountsStatus(accounts, "saving", 1, "");
        return accounts;
    }


    private List<AccountDTO> updateAccountsStatus(List<AccountDTO> accounts, String status, int statusId, String errorMessage) {
        for (AccountDTO account : accounts) {
            account.setStatus(status);
            account.setStatusId(statusId);
            account.setErrorMessage(errorMessage);
        }
        return accounts;
    }

    private List<String> getAccountIds(List<AccountDTO> accounts) {
        List<String> accountIds = new ArrayList<>();
        for (AccountDTO account : accounts) {
            accountIds.add(account.getAccountId());
        }
        return accountIds;
    }
}