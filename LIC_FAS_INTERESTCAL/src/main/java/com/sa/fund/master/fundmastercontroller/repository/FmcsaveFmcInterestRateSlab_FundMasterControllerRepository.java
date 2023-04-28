@Repository
public interface FmcsaveFmcInterestRateSlab_FundMasterControllerRepository extends JpaRepository<FundInterestRateSlabMst, Long>  {
    
    // Method to save the interest rate slab to the database
    public FundInterestRateSlabMst saveFmcInterestRateSlab(FundInterestRateSlabMst fundInterestRateSlabMst);
    
    // Method to validate the request body using the @Valid annotation
    @Valid
    public FundInterestRateSlabMst validateRequestBody(FundInterestRateSlabMst fundInterestRateSlabMst);
    
    // Method to call the saveFmcInterestRateSlab method of the FundMasterService class, passing the validated request body as an argument
    public CommonResponseDto<Object> callSaveFmcInterestRateSlab(FundInterestRateSlabMst fundInterestRateSlabMst);
    
    // Method to return a CommonResponseDto<Object> object with the following properties
    public CommonResponseDto<Object> returnResponse(String status, int statusId, String message);
}