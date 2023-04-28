@Repository
public class ProcessMemberPolicyServiceFundPolicyServiceControllerRepository {

    public void processMemberFunds(int sourcePolicyNumber, String effectiveTxnDate, String updateSubType, List<MemberChangeDto> policyMembers) {
        
        //Validate the request 
        if (sourcePolicyNumber <= 0 || StringUtils.isBlank(effectiveTxnDate) || StringUtils.isBlank(updateSubType) || policyMembers.isEmpty()) {
            throw new IllegalArgumentException("Invalid request");
        }
        // Process the member funds here
    }
}