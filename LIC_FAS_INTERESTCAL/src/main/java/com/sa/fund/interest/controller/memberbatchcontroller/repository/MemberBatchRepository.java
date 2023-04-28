class implements the findByBatchNumber method to fetch the MemberFundStmtV2Entity objects for the provided batch number using pagination.

package com.sa.fund.interest.controller.memberbatchcontroller.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sa.fund.interest.controller.memberbatchcontroller.model.InterestFundResponseDto;
import com.sa.fund.interest.controller.memberbatchcontroller.model.MemberFundStmtV2Entity;

@Repository
public interface MemberBatchRepository extends JpaRepository<MemberFundStmtV2Entity, Long> {

    Page<MemberFundStmtV2Entity> findByBatchNumber(String batchNumber, Pageable pageable);

    InterestFundResponseDto mapMemberBatchSummaryoDtoList(MemberFundStmtV2Entity memberFundStmtV2Entity);

}