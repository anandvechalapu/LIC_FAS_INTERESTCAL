@Repository
public interface ViewMembersByPolicyNoMemberSearchControllerRepository extends JpaRepository<Member, Long> {
    
    /**
     * @param policyNumber The policy number to search for
     * @return A list of members associated with the provided policy number
     */
    @Query("SELECT m FROM Member m WHERE m.policyNumber = :policyNumber")
    List<Member> findByPolicyNumber(@Param("policyNumber") String policyNumber);

}