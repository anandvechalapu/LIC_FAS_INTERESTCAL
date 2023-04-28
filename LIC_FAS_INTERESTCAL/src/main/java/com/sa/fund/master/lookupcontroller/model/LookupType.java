package com.sa.fund.master.lookupcontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lookup_type")
public class LookupType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long lookupTypeId;
	
	private String lookupTypeName;
	
	private String description;
	
	public LookupType() {
		
	}

	public Long getLookupTypeId() {
		return lookupTypeId;
	}

	public void setLookupTypeId(Long lookupTypeId) {
		this.lookupTypeId = lookupTypeId;
	}

	public String getLookupTypeName() {
		return lookupTypeName;
	}

	public void setLookupTypeName(String lookupTypeName) {
		this.lookupTypeName = lookupTypeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}

package com.sa.fund.master.lookupcontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lookup_value")
public class LookupValue {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long lookupValueId;
	
	private Long lookupTypeId;
	
	private String lookupValueName;
	
	private String description;
	
	public LookupValue() {
		
	}

	public Long getLookupValueId() {
		return lookupValueId;
	}

	public void setLookupValueId(Long lookupValueId) {
		this.lookupValueId = lookupValueId;
	}

	public Long getLookupTypeId() {
		return lookupTypeId;
	}

	public void setLookupTypeId(Long lookupTypeId) {
		this.lookupTypeId = lookupTypeId;
	}

	public String getLookupValueName() {
		return lookupValueName;
	}

	public void setLookupValueName(String lookupValueName) {
		this.lookupValueName = lookupValueName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}