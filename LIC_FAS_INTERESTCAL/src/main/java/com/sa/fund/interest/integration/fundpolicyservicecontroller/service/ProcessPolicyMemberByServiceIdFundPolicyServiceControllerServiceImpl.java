@Service
public class ProcessPolicyMemberByServiceIdFundPolicyServiceControllerServiceImpl implements ProcessPolicyMemberByServiceIdFundPolicyServiceControllerService {

    @Autowired
    private ProcessPolicyMemberByServiceIdFundPolicyServiceControllerRepository processPolicyMemberByServiceIdFundPolicyServiceControllerRepository;

    @Override
    public ServiceModule getServiceDetails(Long serviceId) {
        return processPolicyMemberByServiceIdFundPolicyServiceControllerRepository.getServiceDetails(serviceId);
    }

    @Override
    public void processFundForServiceModule(ServiceModule serviceModule) {
        processPolicyMemberByServiceIdFundPolicyServiceControllerRepository.processFundForServiceModule(serviceModule);
    }

    @Override
    public Map<String, Object> getResponseWithSuccessStatus(Long sourcePolicyId, Long destinationPolicyId) {
        return processPolicyMemberByServiceIdFundPolicyServiceControllerRepository.getResponseWithSuccessStatus(sourcePolicyId, destinationPolicyId);
    }

}