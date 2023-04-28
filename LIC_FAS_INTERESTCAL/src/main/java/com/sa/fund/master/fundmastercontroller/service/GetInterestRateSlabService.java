package com.sa.fund.master.fundmastercontroller.service;

import com.sa.fund.master.fundmastercontroller.model.GetInterestRateSlab;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import com.sa.fund.master.fundmastercontroller.repository.GetInterestRateSlabRepository;

@Service
@Transactional
public class GetInterestRateSlabService {

  @Autowired
  private GetInterestRateSlabRepository getInterestRateSlabRepository;
  
  public List<GetInterestRateSlab> findAllByFundCode(String fundCode) {
    return getInterestRateSlabRepository.findAllByFundCode(fundCode);
  }
  
  public GetInterestRateSlab save(GetInterestRateSlab getInterestRateSlab) {
    return getInterestRateSlabRepository.save(getInterestRateSlab);
  }
  
  public List<GetInterestRateSlab> findAllByEffectiveStartDateAndEffectiveEndDate(Date effectiveStartDate, Date effectiveEndDate) {
    return getInterestRateSlabRepository.findAllByEffectiveStartDateAndEffectiveEndDate(effectiveStartDate, effectiveEndDate);
  }
  
  public List<GetInterestRateSlab> findAllByLastModifiedDate(Date lastModifiedDate) {
    return getInterestRateSlabRepository.findAllByLastModifiedDate(lastModifiedDate);
  }
  
  public Optional<GetInterestRateSlab> findById(Long id) {
    return getInterestRateSlabRepository.findById(id);
  }
  
}