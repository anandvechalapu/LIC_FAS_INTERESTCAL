package com.sa.fund.master.lookupcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sa.fund.master.lookupcontroller.model.EncodeLookup;

@Repository
public interface EncodeLookupRepository extends JpaRepository<EncodeLookup, Long> {

    EncodeLookup findByPayload(String payload);
}