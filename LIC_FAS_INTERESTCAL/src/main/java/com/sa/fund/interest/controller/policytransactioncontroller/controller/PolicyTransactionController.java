package com.sa.fund.interest.controller.policytransactioncontroller.controller;

import com.sa.fund.interest.controller.policytransactioncontroller.dto.AccountDTO;
import com.sa.fund.interest.controller.policytransactioncontroller.model.PolicyFundHistoryV2Model;
import com.sa.fund.interest.controller.policytransactioncontroller.service.CreditPolicyTransactionControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/policy_transaction_controller")
public class PolicyTransactionController {

    @Autowired
    CreditPolicyTransactionControllerService creditPolicyTransactionControllerService;

    @PostMapping("/validate_credit_request")
    public ResponseEntity<List<AccountDTO>> validateCreditRequest(@RequestBody List<AccountDTO> accounts) {
        List<AccountDTO> validatedAccounts = creditPolicyTransactionControllerService.validateCreditRequest(accounts);
        return ResponseEntity.status(HttpStatus.OK).body(validatedAccounts);
    }

    @PostMapping("/save_credit_details")
    public ResponseEntity<List<AccountDTO>> saveCreditDetails(@RequestBody List<AccountDTO> accounts) {
        List<AccountDTO> savedAccounts = creditPolicyTransactionControllerService.saveCreditDetails(accounts);
        return ResponseEntity.status(HttpStatus.OK).body(savedAccounts);
    }

}