@Repository
public interface ProcessPolicyMemberByServiceId_SupportControllerRepository extends JpaRepository<FundChangeDto, String> {
    @Modifying
    @Query("UPDATE FundChangeDto SET service_id = :service_id, source_policy_id = :source_policy_id, destination_policy_id = :destination_policy_id WHERE id = :id")
    int updateFundChangeDto(@Param("service_id") String service_id, @Param("source_policy_id") String source_policy_id, 
    @Param("destination_policy_id") String destination_policy_id, @Param("id") String id);
    
    @Query("SELECT f FROM FundChangeDto f WHERE service_id = :service_id OR (source_policy_id = :source_policy_id AND destination_policy_id = :destination_policy_id)")
    List<FundChangeDto> findByServiceIdOrSourceAndDestinationPolicies(@Param("service_id") String service_id, 
    @Param("source_policy_id") String source_policy_id, @Param("destination_policy_id") String destination_policy_id);
}