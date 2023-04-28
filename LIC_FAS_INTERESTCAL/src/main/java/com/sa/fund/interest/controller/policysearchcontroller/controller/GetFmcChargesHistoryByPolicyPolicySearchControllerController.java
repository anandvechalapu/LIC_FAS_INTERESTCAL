package com.sa.fund.interest.controller.policysearchcontroller.controller;

import com.sa.fund.interest.controller.policysearchcontroller.service.GetFmcChargesHistoryByPolicyPolicySearchControllerService;
import com.sa.fund.interest.model.FmcChargesHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/policysearchcontroller/fmc-charges")
public class GetFmcChargesHistoryByPolicyPolicySearchControllerController {

    @Autowired
    private GetFmcChargesHistoryByPolicyPolicySearchControllerService getFmcChargesHistoryByPolicyPolicySearchControllerService;

    @GetMapping("/get-fmc-charges-history-by-policy")
    public List<FmcChargesHistory> getFmcChargesHistoryByPolicy(@RequestParam Long policyNo) {
        return getFmcChargesHistoryByPolicyPolicySearchControllerService.getFmcChargesHistoryByPolicy(policyNo);
    }

}