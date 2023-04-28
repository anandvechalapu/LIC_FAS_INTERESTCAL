@Repository
public interface GetDebitFundHistoryByPolicy_MemberSearchController8Repository extends JpaRepository<DebitFundTransaction, Long> {

    @Query("SELECT t FROM DebitFundTransaction t WHERE t.policyNo = :policyNo AND t.memberId = :memberId AND t.isActive = true AND t.txnType = 'DEBIT' ORDER BY t.effectiveTxnDate ASC")
    List<DebitFundTransaction> findActiveDebitFundTransactionsByPolicyAndMemberId(@Param("policyNo") String policyNo, @Param("memberId") String memberId);
}