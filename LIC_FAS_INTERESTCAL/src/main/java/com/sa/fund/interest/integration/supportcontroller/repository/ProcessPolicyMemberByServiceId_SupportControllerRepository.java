import org.springframework.data.jpa.repository.JpaRepository;

import com.sa.fund.interest.integration.supportcontroller.dto.CommonResponseDto;
import com.sa.fund.interest.integration.supportcontroller.exception.RequiredFieldException;

public interface ProcessPolicyMemberByServiceId_SupportControllerRepository extends JpaRepository<Long, Long> {
	
	CommonResponseDto<Map<String, String>> processMemberFundByPolicy(Long serviceId) throws RequiredFieldException, ApplicationException;
    
}