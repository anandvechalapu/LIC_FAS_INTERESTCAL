@Service
public class GetFmcChargesHistoryByPolicy_MemberSearchController9Service {

    @Autowired
    GetFmcChargesHistoryByPolicy_MemberSearchController9Repository getFmcChargesHistoryByPolicy_MemberSearchController9Repository;

    public List<Transaction> findByPolicyNumberAndMemberId(String policyNumber, String memberId){
        return getFmcChargesHistoryByPolicy_MemberSearchController9Repository.findByPolicyNumberAndMemberId(policyNumber, memberId);
    }

    public List<Transaction> findAllTransactionsByPolicyNumberAndMemberId(String policyNumber, String memberId){
        return getFmcChargesHistoryByPolicy_MemberSearchController9Repository.findAllTransactionsByPolicyNumberAndMemberId(policyNumber, memberId);
    }
}