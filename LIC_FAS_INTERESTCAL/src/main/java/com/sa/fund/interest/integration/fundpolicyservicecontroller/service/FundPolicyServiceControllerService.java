@Service
public class FundPolicyServiceControllerService {
 
    @Autowired
    private FundPolicyServiceControllerRepository repository;
 
    public CommonResponseDto processPolicy(FundChangeDto fundChangeDto, String serviceId) {
        return repository.processPolicy(fundChangeDto, serviceId);
    }
 
    public FundPolicyService findPolicyServiceById(String serviceId) {
        return repository.findPolicyServiceById(serviceId);
    }
}