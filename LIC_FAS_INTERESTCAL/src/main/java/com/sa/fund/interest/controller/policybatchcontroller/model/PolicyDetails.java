//Model class
package com.sa.fund.interest.controller.policybatchcontroller.model;

import java.io.Serializable;

public class PolicyDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long policyId;
	private String policyNumber;
	private String trnxDate;
	private String variant;
	private String policyType;
	private Boolean isBatch;
	private Boolean isAuto;
	private Boolean setOpeningBalance;
	private Boolean recalculate;
	private String licId;
	
	public Long getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Long policyId) {
		this.policyId = policyId;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getTrnxDate() {
		return trnxDate;
	}
	public void setTrnxDate(String trnxDate) {
		this.trnxDate = trnxDate;
	}
	public String getVariant() {
		return variant;
	}
	public void setVariant(String variant) {
		this.variant = variant;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public Boolean getIsBatch() {
		return isBatch;
	}
	public void setIsBatch(Boolean isBatch) {
		this.isBatch = isBatch;
	}
	public Boolean getIsAuto() {
		return isAuto;
	}
	public void setIsAuto(Boolean isAuto) {
		this.isAuto = isAuto;
	}
	public Boolean getSetOpeningBalance() {
		return setOpeningBalance;
	}
	public void setSetOpeningBalance(Boolean setOpeningBalance) {
		this.setOpeningBalance = setOpeningBalance;
	}
	public Boolean getRecalculate() {
		return recalculate;
	}
	public void setRecalculate(Boolean recalculate) {
		this.recalculate = recalculate;
	}
	public String getLicId() {
		return licId;
	}
	public void setLicId(String licId) {
		this.licId = licId;
	}

}

public class InterestRateVariant implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long policyId;
	private String variant;
	
	public Long getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Long policyId) {
		this.policyId = policyId;
	}
	public String getVariant() {
		return variant;
	}
	public void setVariant(String variant) {
		this.variant = variant;
	}

}

public class BatchDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long policyId;
	private String policyNumber;
	private String trnxDate;
	private String variant;
	private String policyType;
	private Boolean isBatch;
	private Boolean isAuto;
	private Boolean setOpeningBalance;
	private Boolean recalculate;
	private String licId;
	
	public Long getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Long policyId) {
		this.policyId = policyId;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getTrnxDate() {
		return trnxDate;
	}
	public void setTrnxDate(String trnxDate) {
		this.trnxDate = trnxDate;
	}
	public String getVariant() {
		