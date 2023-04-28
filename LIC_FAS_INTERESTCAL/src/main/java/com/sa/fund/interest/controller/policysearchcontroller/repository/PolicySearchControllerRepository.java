package com.sa.fund.interest.controller.policysearchcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicySearchControllerRepository extends JpaRepository<DebitFundHistory, Long> {

    public DebitFundHistory getDebitFundHistoryByPolicy(Long policyNo);

}