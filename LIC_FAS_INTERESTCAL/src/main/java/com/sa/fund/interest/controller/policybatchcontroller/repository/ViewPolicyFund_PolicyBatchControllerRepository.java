@Repository
public interface ViewPolicyFund_PolicyBatchControllerRepository {
    
    ResponseEntity<CommonResponseDto> viewPolicyFund(@Valid BatchDto batchDto);
    
    void validateBatchDtoObject(@Valid BatchDto batchDto) throws Exception;
    
    CommonResponseDto generateErrorResponse(Exception e);
    
    InterestFundResponseDto generateResponse(BatchDto batchDto) throws Exception;
    
    void logResponse(CommonResponseDto response);
    
    void logError(Exception e);
}