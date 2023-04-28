@Repository
public interface GetFmcChargesHistoryByPolicyPolicySearchControllerRepository extends JpaRepository<FmcChargesHistory, Long> {


    List<FmcChargesHistory> findByPolicyFundStmtPolicyIdOrderByEffectiveTxnDateAsc(Long policyNo);

}