@Repository
public interface GetFmcChargesHistoryByPolicy_MemberSearchController9Repository extends JpaRepository<Transaction, Long> {

    List<Transaction> findByPolicyNumberAndMemberId(String policyNumber, String memberId);

    @Query("SELECT t FROM Transaction t WHERE t.policyNumber = :policyNumber AND t.memberId = :memberId")
    List<Transaction> findAllTransactionsByPolicyNumberAndMemberId(@Param("policyNumber") String policyNumber, @Param("memberId") String memberId);

}