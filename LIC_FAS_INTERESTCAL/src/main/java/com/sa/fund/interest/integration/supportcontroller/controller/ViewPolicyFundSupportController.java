@RestController
@RequestMapping("/api/v1/viewpolicyfund")
public class ViewPolicyFundSupportController {
    
    @Autowired
    private ViewPolicyFundSupportControllerService viewPolicyFundSupportControllerService;
    
    @GetMapping
    public ResponseData viewPolicyFund(@RequestParam Integer policyId, 
        @RequestParam String policyNumber, @RequestParam String trnxDate, 
        @RequestParam Boolean isBatch, @RequestParam Boolean isAuto, 
        @RequestParam Boolean setOpeningBalance, @RequestParam Boolean recalculate) {
        return viewPolicyFundSupportControllerService.viewPolicyFund(policyId, policyNumber, trnxDate, isBatch, isAuto, setOpeningBalance, recalculate);
    }
    

}