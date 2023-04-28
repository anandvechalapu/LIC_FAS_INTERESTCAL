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

package com.sa.fund.interest.controller.policybatchcontroller.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.controller.policybatchcontroller.model.BatchDto;
import com.sa.fund.interest.controller.policybatchcontroller.model.InterestFundResponseDto;
import com.sa.fund.interest.controller.policybatchcontroller.model.PolicyDetails;
import com.sa.fund.interest.controller.policybatchcontroller.model.InterestRateVariant;
import com.sa.fund.interest.controller.policybatchcontroller.service.SetCreditOpeningByPolicyIds_PolicyBatchControllerService;
import com.sa.fund.interest.controller.policybatchcontroller.dto.CommonResponseDto;

@RestController
@RequestMapping("/policybatchcontroller")
public class SetCreditOpeningByPolicyIds_PolicyBatchControllerController {

	@Autowired
	SetCreditOpeningByPolicyIds_PolicyBatchControllerService setCreditOpeningByPolicyIds_PolicyBatchControllerService;

	/**
	 * Endpoint to set the credit opening balance for a list of policy ids through a batch process.
	 * 
	 * @param batchDto BatchDto object (mandatory)
	 * @return CommonResponseDto<Object> with the following parameters: status: String (SUCCESS or ERROR)
	 *         message: String (a message indicating the success or failure of the operation)
	 *         batchNumber: String (a unique identifier for the batch process)
	 *         responseData: Array of InterestFundResponseDto objects.
	 */
	@PostMapping("/setCreditOpeningByPolicyIds")
	public CommonResponseDto<Object> setCreditOpeningByPolicyIds(@RequestBody BatchDto batchDto) {

		return setCreditOpeningByPolicyIds_PolicyBatchControllerService.setCreditOpeningByPolicyIds(batchDto.getPolicyId(), 
				batchDto.getPolicyNumber(), batchDto.getTrnxDate(), batchDto.getVariant(), batchDto.getPolicyType(), 
				batchDto.getIsBatch(), batchDto.getIsAuto(), batchDto.getSetOpeningBalance(), batchDto.getRecalculate(), 
				batchDto.getLicId());
	}

}