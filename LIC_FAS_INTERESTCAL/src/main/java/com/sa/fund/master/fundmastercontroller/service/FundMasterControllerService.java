package com.sa.fund.master.fundmastercontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.sa.fund.master.fundmastercontroller.model.Variant;
import com.sa.fund.master.fundmastercontroller.repository.FundMasterControllerRepository;
import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@Service
@Timed
public class FundMasterControllerService {

	@Autowired
	private FundMasterControllerRepository fundMasterControllerRepository;
	
	private final Counter counter;

	public FundMasterControllerService(MeterRegistry meterRegistry) {
		this.counter = meterRegistry.counter("fund.master.controller");
	}

	@Cacheable(unless = "#result == null")
	public Optional<Variant> getVariant(Long variantId) {
		counter.increment();
		return fundMasterControllerRepository.getVariant(variantId);
	}
	
}