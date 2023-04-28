import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sa.fund.interest.controller.policysearchcontroller.model.CreditFundHistory;

@Repository
public interface GetCreditFundHistoryByPolicy_PolicySearchControllerRepository extends JpaRepository<CreditFundHistory, Long> {

    @Query("SELECT c FROM CreditFundHistory c WHERE c.policyNo = :policyNo AND c.transactionType = 'CREDIT' ORDER BY c.effectiveTransactionDate ASC")
    List<CreditFundHistory> findCreditFundHistoryByPolicyNo(String policyNo);
}