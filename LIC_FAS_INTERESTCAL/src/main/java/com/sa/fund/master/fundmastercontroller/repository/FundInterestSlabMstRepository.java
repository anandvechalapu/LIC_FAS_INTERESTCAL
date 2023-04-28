package com.sa.fund.master.fundmastercontroller.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sa.fund.master.fundmastercontroller.dto.CommonResponseDto;
import com.sa.fund.master.fundmastercontroller.dto.FundInterestSlabMstDto;

@Repository
public interface FundInterestSlabMstRepository extends JpaRepository<FundInterestSlabMstDto, Long>{

	@Query(value = "SELECT f FROM FundInterestSlabMstDto f WHERE f.isActive = true")
	List<FundInterestSlabMstDto> findByIsActiveTrue();
	
	@Query(value = "SELECT new com.sa.fund.master.fundmastercontroller.dto.CommonResponseDto(f.effectiveStartDate, f.effectiveEndDate, f.interestRate) FROM FundInterestSlabMstDto f WHERE f.isActive = true")
	List<CommonResponseDto> getActiveInterestRateSlab_FundMasterController();
}