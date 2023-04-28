//Entity/Model class
package com.sa.fund.interest.integration.fundpolicyservicecontroller.model;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class ProcessMemberPolicyServiceFundPolicyServiceControllerModel {

    private int sourcePolicyNumber;
    private String effectiveTxnDate;
    private String updateSubType;
    private List<MemberChangeDto> policyMembers;
    
    public int getSourcePolicyNumber() {
        return sourcePolicyNumber;
    }
    public void setSourcePolicyNumber(int sourcePolicyNumber) {
        this.sourcePolicyNumber = sourcePolicyNumber;
    }
    public String getEffectiveTxnDate() {
        return effectiveTxnDate;
    }
    public void setEffectiveTxnDate(String effectiveTxnDate) {
        this.effectiveTxnDate = effectiveTxnDate;
    }
    public String getUpdateSubType() {
        return updateSubType;
    }
    public void setUpdateSubType(String updateSubType) {
        this.updateSubType = updateSubType;
    }
    public List<MemberChangeDto> getPolicyMembers() {
        return policyMembers;
    }
    public void setPolicyMembers(List<MemberChangeDto> policyMembers) {
        this.policyMembers = policyMembers;
    }
    
    public void validateRequest() {
        if (sourcePolicyNumber <= 0 || StringUtils.isBlank(effectiveTxnDate) || StringUtils.isBlank(updateSubType) || policyMembers.isEmpty()) {
            throw new IllegalArgumentException("Invalid request");
        }
    }
}