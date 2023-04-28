package com.sa.fund.interest.controller.memberbatchcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sa.fund.interest.controller.memberbatchcontroller.dto.BatchDto;
import com.sa.fund.interest.controller.memberbatchcontroller.dto.CommonResponseDto;

@Repository
public interface SetCreditOpeningByPolicyAndLicId_MemberBatchControllerRepository extends JpaRepository<BatchDto, Long> {

    /**
     * This method is used to set the credit opening balance for a policy and lic ID.
     *
     * @param policyId the policy ID
     * @param licId the lic ID
     * @return a {@link CommonResponseDto} object with a status field indicating success or failure, and a message field with a relevant message
     */
    @Operation(summary = "This API endpoint is used to set the credit opening balance for a policy and lic ID.",
            description = "This API endpoint is used to set the credit opening balance for a policy and lic ID. It accepts a policy ID and lic ID and returns a CommonResponseDto<Object> object with a status field indicating success or failure, and a message field with a relevant message.")
    CommonResponseDto<Object> setCreditOpeningByPolicyAndLicId(Long policyId, Long licId);

}