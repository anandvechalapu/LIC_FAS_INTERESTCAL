package com.sa.fund.master.lookupcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sa.fund.master.lookupcontroller.model.LookUpType;

@Repository
public interface SaveLookUpType_LookupControllerRepository extends JpaRepository<LookUpType, Long> {

    public LookUpType save(LookUpType lookUpType);

    public LookUpType findById(Long id);

    public LookUpType findByCode(String code);

}