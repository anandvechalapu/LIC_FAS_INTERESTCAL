@Repository
public interface ViewPolicyBatchSummaryDetailsPolicyBatchControllerRepository extends JpaRepository<ViewPolicyBatchSummaryDetailsPolicyBatchController, Long> {

    Optional<ViewPolicyBatchSummaryDetailsPolicyBatchController> findByBatchNumber(String batchNumber);
    
    List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByBatchNumberAsc(Pageable pageable);
    
    List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByBatchNumberDesc(Pageable pageable);
    
    List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByBatchDateAsc(Pageable pageable);
    
    List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByBatchDateDesc(Pageable pageable);
    
    List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByFinancialYearAsc(Pageable pageable);
    
    List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByFinancialYearDesc(Pageable pageable);
    
    List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByRemarksAsc(Pageable pageable);
    
    List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByRemarksDesc(Pageable pageable);
    
    List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByBatchTypeAsc(Pageable pageable);
    
    List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByBatchTypeDesc(Pageable pageable);
    
    List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByCurrentQuarterAsc(Pageable pageable);
    
    List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByCurrentQuarterDesc(Pageable pageable);
    
    List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByPolicyIdAsc(Pageable pageable);
    
    List<ViewPolicyBatchSummaryDetailsPolicyBatchController> findAllByOrderByPolicyIdDesc(Pageable pageable);
    
}