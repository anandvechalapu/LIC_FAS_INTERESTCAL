@RestController
@RequestMapping("/api/v1/viewPolicyFund")
public class ViewPolicyFund_PolicyBatchController {
    
    @Autowired
    ViewPolicyFund_PolicyBatchControllerService viewPolicyFund_PolicyBatchControllerService;
    
    @PostMapping
    public ResponseEntity<CommonResponseDto> viewPolicyFund(@RequestBody BatchDto batchDto) {
        return viewPolicyFund_PolicyBatchControllerService.viewPolicyFund(batchDto);
    }
}