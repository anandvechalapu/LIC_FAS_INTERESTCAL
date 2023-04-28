package com.sa.fund.interest.controller.policysearchcontroller.repository;

import com.sa.fund.interest.controller.policysearchcontroller.dto.AccountsDto;
import com.sa.fund.interest.controller.policysearchcontroller.dto.CommonRequestDto;
import com.sa.fund.interest.controller.policysearchcontroller.dto.CommonResponseDto;
import com.sa.fund.interest.controller.policysearchcontroller.entity.PolicyFundHistoryV2Entity;
import com.sa.fund.interest.controller.policysearchcontroller.entity.PolicyFundStmtV2Entity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PolicySearchControllerRepository extends JpaRepository<PolicyFundHistoryV2Entity, Long> {
    /**
     * Get a list of PolicyFundHistoryV2Entity objects ordered by createdOn and ID in ascending order
     *
     * @param commonRequestDto The optional payload query parameter in the request
     * @return List of PolicyFundHistoryV2Entity objects
     */
    List<PolicyFundHistoryV2Entity> getAllPolicyFundHistoryV2Entities(CommonRequestDto commonRequestDto);

    /**
     * Get a list of AccountsDto objects from a list of PolicyFundHistoryV2Entity objects
     *
     * @param policyFundHistoryV2Entities List of PolicyFundHistoryV2Entity objects
     * @param policyFundStmtV2Entity      The corresponding PolicyFundStmtV2Entity object in the database
     * @return List of AccountsDto objects
     */
    List<AccountsDto> getAllAccountsDtos(List<PolicyFundHistoryV2Entity> policyFundHistoryV2Entities, PolicyFundStmtV2Entity policyFundStmtV2Entity);
}