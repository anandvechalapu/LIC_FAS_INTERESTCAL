package com.sa.fund.master.fundmastercontroller.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GetInterestRateSlab {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String fundCode;
	
	private Date effectiveStartDate;
	
	private Date effectiveEndDate;
	
	private Date lastModifiedDate;
	
	public GetInterestRateSlab() {
	
	}
	
	public GetInterestRateSlab(Long id, String fundCode, Date effectiveStartDate, Date effectiveEndDate, Date lastModifiedDate) {
		this.id = id;
		this.fundCode = fundCode;
		this.effectiveStartDate = effectiveStartDate;
		this.effectiveEndDate = effectiveEndDate;
		this.lastModifiedDate = lastModifiedDate;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFundCode() {
		return fundCode;
	}
	
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}
	
	public Date getEffectiveStartDate() {
		return effectiveStartDate;
	}
	
	public void setEffectiveStartDate(Date effectiveStartDate) {
		this.effectiveStartDate = effectiveStartDate;
	}
	
	public Date getEffectiveEndDate() {
		return effectiveEndDate;
	}
	
	public void setEffectiveEndDate(Date effectiveEndDate) {
		this.effectiveEndDate = effectiveEndDate;
	}
	
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	
	@Override
	public String toString() {
		return "GetInterestRateSlab [id=" + id + ", fundCode=" + fundCode + ", effectiveStartDate=" + effectiveStartDate
				+ ", effectiveEndDate=" + effectiveEndDate + ", lastModifiedDate=" + lastModifiedDate + "]";
	}
	
}