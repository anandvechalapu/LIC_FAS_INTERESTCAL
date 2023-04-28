import org.springframework.data.jpa.repository.JpaRepository;

import com.sa.fund.interest.controller.policysearchcontroller.model.PolicyFundSearch;

public interface PolicyFundSearch_PolicySearchControllerRepository extends JpaRepository<PolicyFundSearch, Long> {
    
    List<PolicyFundSearch> findByProductAndVariantAndTransactionTypeAndTransactionDate(String product, String variant, String transactionType, Date transactionDate);
    
    List<PolicyFundSearch> findByClosingBalanceWithoutInterest(BigDecimal closingBalanceWithoutInterest);
    
    List<PolicyFundSearch> findByFundSize(long fundSize);
    
    List<PolicyFundSearch> findByProduct(String product);
    
    List<PolicyFundSearch> findByVariant(String variant);
    
    List<PolicyFundSearch> findByTransactionType(String transactionType);
    
    List<PolicyFundSearch> findByTransactionDate(Date transactionDate);
}