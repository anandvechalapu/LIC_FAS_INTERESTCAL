@Repository
public interface MemberFundHistoryV2Repository {
 
    List<MemberFundHistoryV2Entity> viewMembersHistoryByPolicyNo(Long policyNo);
 
}