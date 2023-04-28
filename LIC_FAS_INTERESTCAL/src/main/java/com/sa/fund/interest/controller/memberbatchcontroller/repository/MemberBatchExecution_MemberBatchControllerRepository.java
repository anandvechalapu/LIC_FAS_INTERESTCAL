@Repository
public interface MemberBatchExecution_MemberBatchControllerRepository {
 
    ResponseEntity<FundBatchResponseDto> executeMemberBatch(BatchDto batchDto);
 
    Map<String, Map<String, FundResponseDetailsDto>> getExecutionResults(String batchNumber);
 
}