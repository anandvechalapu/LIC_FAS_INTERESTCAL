@Repository
public interface GetCreditFundHistoryByPolicy_PolicySearchControllerRepository extends JpaRepository<CreditFundHistory, Long> {
    List<CreditFundHistory> findCreditFundHistoryByPolicyNo(String policyNo);
}

package com.sa.fund.interest.controller.policysearchcontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.controller.policysearchcontroller.model.CreditFundHistory;
import com.sa.fund.interest.controller.policysearchcontroller.service.GetCreditFundHistoryByPolicy_PolicySearchControllerService;

@RestController
@RequestMapping("/policysearchcontroller")
public class GetCreditFundHistoryByPolicy_PolicySearchControllerController {

    @Autowired
    private GetCreditFundHistoryByPolicy_PolicySearchControllerService getCreditFundHistoryByPolicy_PolicySearchControllerService;

    @GetMapping("/getCreditFundHistoryByPolicyNo")
    public List<CreditFundHistory> getCreditFundHistoryByPolicyNo(@RequestParam("policyNo") String policyNo) {
        return getCreditFundHistoryByPolicy_PolicySearchControllerService.getCreditFundHistoryByPolicyNo(policyNo);
    }

}