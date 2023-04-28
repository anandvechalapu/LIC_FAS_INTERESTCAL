import org.springframework.data.jpa.repository.JpaRepository;

import com.sa.fund.interest.controller.memberbatchcontroller.dto.MemberFundHistoryDto;
import com.sa.fund.interest.controller.memberbatchcontroller.entity.MemberFundStmtV2Entity;

public interface ViewMemberTransactionHistoryRepository extends JpaRepository<MemberFundStmtV2Entity, Integer> {

	//Method to fetch MemberFundHistoryDto by summStmtId from MemberFundStmtV2Entity
	public List<MemberFundHistoryDto> findBySummStmtId(Integer summStmtId);

}