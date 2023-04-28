` field of the CommonResponseDto<Object> object to NO_RECORD_FOUND.If the provided ID is invalid or the Master Lookup Type/Value with the provided ID is not found, the method should set the responseData field of the CommonResponseDto<Object> object to null.

package com.sa.fund.master.lookupcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sa.fund.master.lookupcontroller.model.LookUpTypesDto;
import com.sa.fund.master.lookupcontroller.model.CommonResponseDto;

public interface RemoveLookUpTypeValueLookupControllerRepository extends JpaRepository<LookUpTypesDto, Long> {
    CommonResponseDto<Object> removeLookUpTypeValue(LookUpTypesDto lookUpTypesDto);
}