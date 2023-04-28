package com.sa.fund.master.fundmastercontroller.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.master.fundmastercontroller.model.GetInterestRateSlab;
import com.sa.fund.master.fundmastercontroller.service.GetInterestRateSlabService;

@RestController
@RequestMapping("/getInterestRateSlab")
public class GetInterestRateSlabController {

  private GetInterestRateSlabService getInterestRateSlabService;
  
  @PostMapping
  public GetInterestRateSlab save(@RequestBody GetInterestRateSlab getInterestRateSlab) {
    return getInterestRateSlabService.save(getInterestRateSlab);
  }
  
  @GetMapping
  public List<GetInterestRateSlab> findAllByFundCode(@RequestParam String fundCode) {
    return getInterestRateSlabService.findAllByFundCode(fundCode);
  }
  
  @GetMapping
  public List<GetInterestRateSlab> findAllByEffectiveStartDateAndEffectiveEndDate(@RequestParam Date effectiveStartDate, @RequestParam Date effectiveEndDate) {
    return getInterestRateSlabService.findAllByEffectiveStartDateAndEffectiveEndDate(effectiveStartDate, effectiveEndDate);
  }
  
  @GetMapping
  public List<GetInterestRateSlab> findAllByLastModifiedDate(@RequestParam Date lastModifiedDate) {
    return getInterestRateSlabService.findAllByLastModifiedDate(lastModifiedDate);
  }
  
  @GetMapping
  public Optional<GetInterestRateSlab> findById(@RequestParam Long id) {
    return getInterestRateSlabService.findById(id);
  }

}