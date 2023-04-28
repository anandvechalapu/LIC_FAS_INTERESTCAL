@Repository
public interface ProcessClaim_SupportControllerRepository extends JpaRepository<ClaimRequestDto, Long> {
    // To save the integration request and response to the log
    void saveIntegrationRequestAndResponse(ClaimRequestDto claimRequestDto);
    
    // To validate the policy and member details in the request
    Boolean validatePolicyAndMemberDetails(ClaimRequestDto claimRequestDto);
    
    // To retrieve the policy transaction summary entity and validate that the closing balance is not zero
    Boolean validateClosingBalance(ClaimRequestDto claimRequestDto);
    
    // To retrieve the policy master entity and the interest rate for the variant
    Boolean retrievePolicyMasterEntityAndInterestRate(ClaimRequestDto claimRequestDto);
    
    // To process the claim for DB policy and return the response
    CommonResponseDto<Object> processClaimsForDBPolicy(ClaimRequestDto claimRequestDto);
    
    // To retrieve the member transaction summary entity and validate that it is not null
    Boolean validateMemberTransactionSummary(ClaimRequestDto claimRequestDto);
    
    // To validate the debit amount of the member transaction summary entity
    Boolean validateDebitAmount(ClaimRequestDto claimRequestDto);
    
    // To retrieve the top member transaction entry and the top policy transaction entry
    Boolean retrieveTopMemberAndPolicyTransactionEntry(ClaimRequestDto claimRequestDto);
    
    // To validate the policy and member entity using the retrieved entities
    Boolean validatePolicyAndMemberEntities(ClaimRequestDto claimRequestDto);
    
    // To validate the process date and transaction date
    Boolean validateProcessAndTransactionDates(ClaimRequestDto claimRequestDto);
    
    // To create a debit request object and populate it with the necessary values from the request
    Boolean createDebitRequestObject(ClaimRequestDto claimRequestDto);
    
    // To set the variant to the interest rate variant and the transaction type to DEBIT
    Boolean setVariantToInterestRateAndTransactionTypeToDebit(ClaimRequestDto claimRequestDto);
    
    // To return the processed claim response
    CommonResponseDto<Object> returnProcessedClaimResponse(ClaimRequestDto claimRequestDto);
}