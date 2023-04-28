package com.sa.fund.master.lookupcontroller.repository; 

import org.springframework.data.jpa.repository.JpaRepository; 
import com.sa.fund.master.lookupcontroller.entity.LookUpTypeAndValueEntity; 

public interface LookupControllerRepository extends JpaRepository<LookUpTypeAndValueEntity, Long> { 
	
	LookUpTypeAndValueEntity getLookUpTypeValueById(Long id); 
}