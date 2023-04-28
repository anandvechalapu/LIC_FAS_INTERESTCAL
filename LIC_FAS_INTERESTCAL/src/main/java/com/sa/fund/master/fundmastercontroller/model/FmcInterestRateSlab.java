package com.sa.fund.master.fundmastercontroller.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "fmcinterestrateslab")
public class FmcInterestRateSlab {
	
	private Long id;
	private String fundName;
	private String category;
	private Double startAmount;
	private Double endAmount;
	private Double interestRate;
	
	public FmcInterestRateSlab() {
		
	}
	
	public FmcInterestRateSlab(Long id, String fundName, String category, Double startAmount, Double endAmount, Double interestRate) {
		this.id = id;
		this.fundName = fundName;
		this.category = category;
		this.startAmount = startAmount;
		this.endAmount = endAmount;
		this.interestRate = interestRate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFundName() {
		return fundName;
	}

	public void setFundName(String fundName) {
		this.fundName = fundName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getStartAmount() {
		return startAmount;
	}

	public void setStartAmount(Double startAmount) {
		this.startAmount = startAmount;
	}

	public Double getEndAmount() {
		return endAmount;
	}

	public void setEndAmount(Double endAmount) {
		this.endAmount = endAmount;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	

}