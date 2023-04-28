@Repository
public interface ViewHistoryByMemberIdMemberSearchControllerRepository extends JpaRepository<TransactionHistory, Long> {
    
    List<TransactionHistory> findByMemberId(Long memberId);
    
}