@Repository
public class FundPolicyServiceControllerRepository {
 
    @Autowired
    private EntityManager entityManager;
 
    public CommonResponseDto processPolicy(FundChangeDto fundChangeDto, String serviceId) {
        FundPolicyService policyService = findPolicyServiceById(serviceId);
        if (policyService == null) {
            throw new ApplicationException("Policy service not found")
                    || new RequiredFieldException("Required field not found");
        }
        Map<String, String> result = policyService.processPolicy(fundChangeDto);
        return new CommonResponseDto(result);
    }
 
    public FundPolicyService findPolicyServiceById(String serviceId) {
        return entityManager.find(FundPolicyService.class, serviceId);
    }
}