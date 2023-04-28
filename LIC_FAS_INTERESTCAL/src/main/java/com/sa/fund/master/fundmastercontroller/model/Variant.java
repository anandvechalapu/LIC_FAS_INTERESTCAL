package com.sa.fund.master.fundmastercontroller.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.cache.annotation.Cached;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Entity
@Table(name = "variant")
public class Variant implements Serializable {

	@Id
	private Long variantId;
	private String variantName;
	private String variantDescription;
	
	public Long getVariantId() {
		return variantId;
	}
	
	public void setVariantId(Long variantId) {
		this.variantId = variantId;
	}
	
	public String getVariantName() {
		return variantName;
	}
	
	public void setVariantName(String variantName) {
		this.variantName = variantName;
	}
	
	public String getVariantDescription() {
		return variantDescription;
	}
	
	public void setVariantDescription(String variantDescription) {
		this.variantDescription = variantDescription;
	}

}