import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sa.fund.interest.integration.report.model.DownloadMemberFundStatementReport;

@Repository
public interface DownloadMemberFundStatement_reportRepository extends JpaRepository<DownloadMemberFundStatementReport, Long> {
    DownloadMemberFundStatementReport findByPolicyIdAndMemberId(String policyId, String memberId);
}