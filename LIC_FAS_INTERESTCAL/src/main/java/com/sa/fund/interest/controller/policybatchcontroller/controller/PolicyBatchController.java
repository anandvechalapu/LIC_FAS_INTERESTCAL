package com.sa.fund.interest.controller.policybatchcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PolicyBatchList_PolicyBatchControllerRepository extends JpaRepository<Long, Object[]> {

  @Query(value = "SELECT batch_number, batch_date, financial_year, remarks, batch_type, current_quarter " +
      "FROM policy_batch " +
      "WHERE policy_id = ?1 AND batch_date <= ?2 " +
      "ORDER BY batch_date DESC, batch_number DESC LIMIT 1", nativeQuery = true)
  List<Object[]> getPolicyBatchList(Long policyId, String transactionDate);

}

package com.sa.fund.interest.controller.policybatchcontroller.controller;

import com.sa.fund.interest.controller.policybatchcontroller.model.PolicyBatch;
import com.sa.fund.interest.controller.policybatchcontroller.service.PolicyBatchList_PolicyBatchControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/policyBatch")
public class PolicyBatchController {

  @Autowired
  PolicyBatchList_PolicyBatchControllerService policyBatchList_PolicyBatchControllerService;

  @GetMapping(value = "/")
  public ResponseEntity<List<Object[]>> getPolicyBatchList(@RequestParam Long policyId,
                                                          @RequestParam String transactionDate) {
    return ResponseEntity.ok(policyBatchList_PolicyBatchControllerService.getPolicyBatchList(policyId, transactionDate));
  }

  @PostMapping(value = "/")
  public ResponseEntity<PolicyBatch> createPolicyBatch(@RequestBody PolicyBatch policyBatch) {
    policyBatchList_PolicyBatchControllerService.save(policyBatch);
    return ResponseEntity.ok(policyBatch);
  }
}