package com.sa.fund.interest.controller.memberbatchcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sa.fund.interest.controller.memberbatchcontroller.model.ViewMemberTransactionCalc_MemberBatchController;

public interface ViewMemberTransactionCalc_MemberBatchControllerRepository extends JpaRepository<ViewMemberTransactionCalc_MemberBatchController, Long> {

    @Query("SELECT m FROM ViewMemberTransactionCalc_MemberBatchController m WHERE m.memberFundTransactionRateDetailsId = :memberFundTransactionRateDetailsId")
    ViewMemberTransactionCalc_MemberBatchController findByMemberFundTransactionRateDetailsId(@Param("memberFundTransactionRateDetailsId") Long memberFundTransactionRateDetailsId);

}