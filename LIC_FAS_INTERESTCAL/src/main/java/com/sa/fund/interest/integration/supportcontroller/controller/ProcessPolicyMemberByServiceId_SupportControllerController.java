package com.sa.fund.interest.integration.supportcontroller.controller;

import com.sa.fund.interest.integration.supportcontroller.dto.FundChangeDto;
import com.sa.fund.interest.integration.supportcontroller.service.ProcessPolicyMemberByServiceId_SupportControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supportController")
public class ProcessPolicyMemberByServiceId_SupportControllerController {

    @Autowired
    ProcessPolicyMemberByServiceId_SupportControllerService processPolicyMemberByServiceId_SupportControllerService;

    @PutMapping("/fundChange")
    public ResponseEntity<Object> updateFundChangeDto(@RequestParam String service_id, @RequestParam String source_policy_id, @RequestParam String destination_policy_id, @RequestParam String id) {
        int updated = processPolicyMemberByServiceId_SupportControllerService.updateFundChangeDto(service_id, source_policy_id, destination_policy_id, id);
        if (updated == 0) {
            return new ResponseEntity<>("No Record Found", HttpStatus.PRECONDITION_FAILED);
        }
        return new ResponseEntity<>("Updated Sucessfully", HttpStatus.OK);
    }

    @GetMapping("/findByServiceIdOrSourceAndDestinationPolicies")
    public ResponseEntity<Object> findByServiceIdOrSourceAndDestinationPolicies(@RequestParam String service_id, @RequestParam String source_policy_id, @RequestParam String destination_policy_id) {
        List<FundChangeDto> fundChangeDtoList = processPolicyMemberByServiceId_SupportControllerService.findByServiceIdOrSourceAndDestinationPolicies(service_id, source_policy_id, destination_policy_id);
        if (fundChangeDtoList == null) {
            return new ResponseEntity<>("No Record Found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(fundChangeDtoList, HttpStatus.OK);
    }

}