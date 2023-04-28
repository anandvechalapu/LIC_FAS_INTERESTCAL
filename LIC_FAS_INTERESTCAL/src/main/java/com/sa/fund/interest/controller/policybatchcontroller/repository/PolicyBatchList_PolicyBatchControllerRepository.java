package com.sa.fund.interest.controller.policybatchcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PolicyBatchList_PolicyBatchControllerRepository extends JpaRepository<PolicyBatch, Long> {

  /**
   * This method is used to get the policy batch list based on a specific date or policy ID.
   * @param policyId The policy ID.
   * @param transactionDate The transaction date.
   * @return The list of policy batch details.
   */
  @Query(value = "SELECT batch_number, batch_date, financial_year, remarks, batch_type, current_quarter FROM policy_batch WHERE (:policyId IS NULL OR policy_id = :policyId) AND (:transactionDate IS NULL OR batch_date = :transactionDate)", nativeQuery = true)
  List<Object[]> getPolicyBatchList(@Param("policyId") Long policyId, @Param("transactionDate") String transactionDate);

}