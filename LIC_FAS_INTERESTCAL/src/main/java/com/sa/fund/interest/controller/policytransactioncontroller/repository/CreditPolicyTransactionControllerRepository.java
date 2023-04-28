package com.sa.fund.interest.controller.policytransactioncontroller.repository;

import com.sa.fund.interest.controller.policytransactioncontroller.dto.AccountDTO;
import com.sa.fund.interest.controller.policytransactioncontroller.entity.PolicyFundHistoryV2Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CreditPolicyTransactionControllerRepository extends JpaRepository<PolicyFundHistoryV2Entity, Integer> {

    /**
     * This method will validate the credit request for a list of account DTOs
     *
     * @param accounts list of AccountDTOs
     * @return list of AccountDTOs with updated statuses and status ids
     */
    @Transactional
    @Modifying
    @Query("UPDATE PolicyFundHistoryV2Entity p SET p.status = :status, p.statusId = :statusId, p.errorMessage = :errorMessage WHERE p.accountId IN (:accountIds)")
    int validateCreditRequest(@Param("status") String status, @Param("statusId") int statusId, @Param("errorMessage") String errorMessage, @Param("accountIds") List<String> accountIds);

    /**
     * This method will save the credit details for a list of account DTOs
     *
     * @param accounts list of AccountDTOs
     * @return list of AccountDTOs with updated statuses and status ids
     */
    @Transactional
    @Modifying
    @Query("UPDATE PolicyFundHistoryV2Entity p SET p.status = :status, p.statusId = :statusId, p.errorMessage = :errorMessage WHERE p.accountId IN (:accountIds)")
    int saveCreditDetails(@Param("status") String status, @Param("statusId") int statusId, @Param("errorMessage") String errorMessage, @Param("accountIds") List<String> accountIds);
}