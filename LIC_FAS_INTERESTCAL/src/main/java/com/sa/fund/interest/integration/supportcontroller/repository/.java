@Repository
public class FindApprovedPolicyClaimSupportControllerRepository {

    public List<ClaimDto> findApprovedPolicyClaims(String financialYear, String policyId) {
        List<ClaimDto> claims = new ArrayList<>();

        // get approved policy claims for the given financial year and policy ID
        // if no policy ID provided, get all approved policy claims for the financial year

        // populate list with ClaimDto objects
        // set fields: Stream, PolicyId, Module, TransactionDate, LicId, MemberId, TxnAmount, PurchasePrice, CommutationAmt, DateOfExit, Username, CreatedOn, UnitId, StatementDate, BatchStatus, BatchNumber
        // format date fields as DD/MM/YYYY

        return claims;
    }
}