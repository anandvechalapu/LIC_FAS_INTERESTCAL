package com.sa.fund.interest.controller.policysearchcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sa.fund.interest.domain.DebitFundHistory;

@Repository
public interface PolicySearchControllerRepository extends JpaRepository<DebitFundHistory, Long> {

    @Query("SELECT d FROM DebitFundHistory d where policyNo = ?1")
    DebitFundHistory getDebitFundHistoryByPolicy(Long policyNo);
}

package com.sa.fund.interest.controller.policysearchcontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.controller.policysearchcontroller.model.DebitFundHistory;
import com.sa.fund.interest.controller.policysearchcontroller.service.PolicySearchControllerService;

@RestController
@RequestMapping("/api/policysearchcontroller")
public class PolicySearchController {

    @Autowired
    private PolicySearchControllerService policySearchControllerService;

    @GetMapping("/debitfundhistory/{policyNo}")
    public DebitFundHistory getDebitFundHistoryByPolicy(@PathVariable Long policyNo) {
        return policySearchControllerService.getDebitFundHistoryByPolicy(policyNo);
    }

}