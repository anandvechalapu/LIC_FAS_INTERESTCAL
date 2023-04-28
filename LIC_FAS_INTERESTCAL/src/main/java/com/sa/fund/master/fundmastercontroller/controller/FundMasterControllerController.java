package com.sa.fund.master.fundmastercontroller.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sa.fund.master.fundmastercontroller.model.Variant;

public interface FundMasterControllerRepository extends CrudRepository<Variant, Long> {

	@Query("SELECT v FROM Variant v WHERE v.variantId = :variantId")
	Optional<Variant> getVariant(@Param("variantId") Long variantId);

}

package com.sa.fund.master.fundmastercontroller.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.master.fundmastercontroller.model.Variant;
import com.sa.fund.master.fundmastercontroller.service.FundMasterControllerService;

@RestController
@RequestMapping("/fundMasterController/variants")
public class FundMasterControllerController {

	@Autowired
	private FundMasterControllerService fundMasterControllerService;
	
	@GetMapping("/{variantId}")
	public Optional<Variant> getVariant(@PathVariable("variantId") Long variantId) {
		return fundMasterControllerService.getVariant(variantId);
	}

}