package com.sa.fund.interest.controller.policybatchcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.data.jpa.repository.Query; 
import org.springframework.data.repository.query.Param; 

import com.sa.fund.interest.controller.policybatchcontroller.model.BatchRequestResponse;

public interface BatchRequestResponseRepository extends JpaRepository<BatchRequestResponse,Long> {

	@Query("SELECT b FROM BatchRequestResponse b WHERE b.policyNumber = :policyNumber")
	BatchRequestResponse executeBatchByPolicy_PolicyBatchController(@Param("policyNumber") Long policyNumber);

}