package com.sa.fund.master.fundmastercontroller.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sa.fund.master.fundmastercontroller.model.AirMfrRa;

@Repository
public interface FundMasterControllerRepository extends JpaRepository<AirMfrRa, Long> {

    @Query("SELECT a FROM AirMfrRa a")
    List<AirMfrRa> getAirMfrRa();

}