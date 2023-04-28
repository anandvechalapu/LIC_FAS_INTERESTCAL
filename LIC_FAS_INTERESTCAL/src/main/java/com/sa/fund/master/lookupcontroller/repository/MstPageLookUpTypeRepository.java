package com.sa.fund.master.lookupcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sa.fund.master.lookupcontroller.model.MstLookUpTypesEntity;

@Repository
public interface MstPageLookUpTypeRepository extends JpaRepository<MstLookUpTypesEntity, Long> {

    MstLookUpTypesEntity findByIdAndIsActiveTrue(Long id);
    
    MstLookUpTypesEntity findByCodeAndIsActiveTrue(String code);
}