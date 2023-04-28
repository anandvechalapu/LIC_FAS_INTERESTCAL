package com.sa.fund.interest.controller.membersearchcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sa.fund.interest.controller.membersearchcontroller.model.CreditFundHistory;

@Repository
public interface GetCreditFundHistoryByPolicy_MemberSearchController extends JpaRepository<CreditFundHistory, Long> {

    @Query(value = "SELECT * FROM credit_fund_history WHERE policy_no = ?1 AND member_id = ?2", nativeQuery = true)
    CreditFundHistory getCreditFundHistoryByPolicy(String policyNo, String memberId);
}