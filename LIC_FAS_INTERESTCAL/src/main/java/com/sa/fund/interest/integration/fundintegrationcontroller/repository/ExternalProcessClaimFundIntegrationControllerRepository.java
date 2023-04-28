@Repository
public interface ExternalProcessClaimFundIntegrationControllerRepository {
    
    /**
     * Method to process a claim fund
     * 
     * @param jsonPayload - JSON payload containing the necessary fields
     * @return CommonResponseDto with status ERROR if an exception is thrown during the processing of the claim, and SUCCESS if the claim is processed successfully.
     * @throws ApplicationException with an appropriate error message if a member transaction summary does not exist for the given policy ID, lic ID, and financial year.
     * @throws ApplicationException with an appropriate error message if the closing balance of the policy is zero in the transaction summary details. 
     * @throws ApplicationException with an appropriate error message if the closing balance of the member is negative.
     * @throws ApplicationException with an appropriate error message if the process date is not greater than or equal to the transaction date.
     */
    CommonResponseDto processClaimFund(JSONObject jsonPayload) throws ApplicationException;

}