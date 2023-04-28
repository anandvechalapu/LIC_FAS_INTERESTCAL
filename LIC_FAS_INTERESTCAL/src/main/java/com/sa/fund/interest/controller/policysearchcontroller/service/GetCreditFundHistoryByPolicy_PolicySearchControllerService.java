@Service
public class GetCreditFundHistoryByPolicy_PolicySearchControllerService {
    @Autowired
    private GetCreditFundHistoryByPolicy_PolicySearchControllerRepository getCreditFundHistoryByPolicy_PolicySearchControllerRepository;

    public List<CreditFundHistory> getCreditFundHistoryByPolicyNo(String policyNo) {
        return getCreditFundHistoryByPolicy_PolicySearchControllerRepository.findCreditFundHistoryByPolicyNo(policyNo);
    }
}