@Service
public class ViewPolicyFund_PolicyBatchControllerServiceImpl implements ViewPolicyFund_PolicyBatchControllerService {
    
    @Autowired
    ViewPolicyFund_PolicyBatchControllerRepository viewPolicyFund_PolicyBatchControllerRepository;
    
    @Override
    public ResponseEntity<CommonResponseDto> viewPolicyFund(@Valid BatchDto batchDto) {
        try {
            viewPolicyFund_PolicyBatchControllerRepository.validateBatchDtoObject(batchDto);
            CommonResponseDto response = viewPolicyFund_PolicyBatchControllerRepository.generateResponse(batchDto);
            viewPolicyFund_PolicyBatchControllerRepository.logResponse(response);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            CommonResponseDto response = viewPolicyFund_PolicyBatchControllerRepository.generateErrorResponse(e);
            viewPolicyFund_PolicyBatchControllerRepository.logError(e);
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }
}