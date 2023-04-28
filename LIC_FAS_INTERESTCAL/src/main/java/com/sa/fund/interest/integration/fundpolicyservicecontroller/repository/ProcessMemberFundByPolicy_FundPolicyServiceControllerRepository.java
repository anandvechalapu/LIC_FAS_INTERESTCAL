import org.springframework.data.jpa.repository.JpaRepository;

import com.sa.fund.interest.integration.fundpolicyservicecontroller.dto.CommonResponseDto;
import com.sa.fund.interest.integration.fundpolicyservicecontroller.dto.PolicyServicesDto;

public interface ProcessMemberFundByPolicy_FundPolicyServiceControllerRepository extends JpaRepository<PolicyServicesDto,Long> {
    
    /**
     * This method process member funds for a given service module, so that
     * funds can be transferred from one policy to another.
     *
     * @param PolicyServicesDto requestBody
     * @throws RequiredFieldException if any of the required fields in the request body are missing
     * @throws ApplicationException if no member is found for the given service type and source/destination policy ID or if there is no member transaction summary for the source policy ID.
     * @return CommonResponseDto
     */
    public CommonResponseDto processMemberFundByPolicy(PolicyServicesDto requestBody) throws RequiredFieldException, ApplicationException;
}