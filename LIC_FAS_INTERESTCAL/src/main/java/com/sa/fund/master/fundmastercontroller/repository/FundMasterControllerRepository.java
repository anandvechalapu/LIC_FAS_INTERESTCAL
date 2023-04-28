package com.sa.fund.master.fundmastercontroller.repository;

import com.sa.fund.master.fundmastercontroller.dto.CommonResponseDto;
import com.sa.fund.master.fundmastercontroller.dto.FundInterestSlabMstDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FundMasterControllerRepository extends JpaRepository<FundInterestSlabMstDto, Long> {

    /**
     * Method to save an interest rate slab for the funds
     * 
     * @param dto
     * @return CommonResponseDto object with the appropriate status and message
     * @throws IllegalArgumentException if any of the mandatory fields are missing or invalid
     */
    public CommonResponseDto<Object> saveInterestRateSlab(FundInterestSlabMstDto dto) throws IllegalArgumentException;
}