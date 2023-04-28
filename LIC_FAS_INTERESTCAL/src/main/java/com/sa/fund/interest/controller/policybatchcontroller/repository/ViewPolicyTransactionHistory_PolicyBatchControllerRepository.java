import org.springframework.data.jpa.repository.JpaRepository;

import com.sa.fund.interest.controller.policybatchcontroller.dto.BatchRequestDto;
import com.sa.fund.interest.controller.policybatchcontroller.dto.DataTable;
import com.sa.fund.interest.controller.policybatchcontroller.dto.PolicyFundHistoryDto;

/**
 * Repository interface for the BatchRequestDto object.
 */
public interface ViewPolicyTransactionHistory_PolicyBatchControllerRepository extends JpaRepository<BatchRequestDto, Long> {
    
    /**
     * Method to view the transaction history for a policy fund summary based on its ID.
     * 
     * @param summStmtId The summStmtId field in the request body is a mandatory field and should contain a long non-zero value.
     * 
     * @return The DataTable object containing a list of PolicyFundHistoryDto objects with the following details.
     */
    DataTable viewPolicyTransactionHistory(long summStmtId);
}