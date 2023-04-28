import org.springframework.scheduling.annotation.Async;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sa.fund.interest.integration.fundintegrationcontroller.dto.CommonResponseDto;

@Transactional
public interface TransactionEntriesAsyncFundIntegrationControllerRepository extends JpaRepository<Long, Object> {

    @Async
    CommonResponseDto<Map<String, Object>> savePolicyAndMemberContributionEntries(Long policyId, Integer financialYear);

}