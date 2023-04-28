package com.sa.fund.interest.controller.policybatchcontroller.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sa.fund.interest.controller.policybatchcontroller.model.PolicyFundCalcRateDetailsDto;

@Repository
public interface ViewPolicyTransactionCalc_PolicyBatchControllerRepository extends JpaRepository<PolicyFundCalcRateDetailsDto, Long> {

    Optional<PolicyFundCalcRateDetailsDto> findByTransactionId(Long transactionId);

}