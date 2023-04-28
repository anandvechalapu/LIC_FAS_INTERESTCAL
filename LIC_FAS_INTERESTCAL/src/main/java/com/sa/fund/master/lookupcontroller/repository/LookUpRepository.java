package com.sa.fund.master.lookupcontroller.repository;

import com.sa.fund.master.lookupcontroller.dto.CommonRequestDto;
import com.sa.fund.master.lookupcontroller.entity.MstLookUpTypesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LookUpRepository extends JpaRepository<MstLookUpTypesEntity, Long> {

    @Query("select l from MstLookUpTypesEntity l where l.status = 'ACTIVE' order by l.name asc")
    public List<MstLookUpTypesEntity> getLookUpTypes(CommonRequestDto commonRequestDto);

}