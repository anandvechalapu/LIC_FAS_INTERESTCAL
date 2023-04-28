@Repository
public interface PolicyBatchControllerRepository extends JpaRepository<PolicyMasterEntity, Long> {
    
    List<PolicyMasterEntity> findAllByIsActiveAndFinancialYearAndPredicates(Boolean isActive, String financialYear, Predicates predicates);

    @Query("SELECT p FROM PolicyMasterEntity p WHERE p.isActive = :isActive AND p.financialYear = :financialYear ORDER BY p.modifiedOn DESC")
    List<PolicyMasterEntity> findAllByIsActiveAndFinancialYearOrderByModifiedOnDesc(Boolean isActive, String financialYear);

    @Query("SELECT p FROM PolicyMasterEntity p WHERE p.policyId = :policyId OR p.policyNumber = :policyNumber")
    List<PolicyMasterEntity> searchPolicy(String policyId, String policyNumber);
}