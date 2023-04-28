@Service
public class PolicyBatchControllerServiceImpl implements PolicyBatchControllerService{

    @Autowired
    private PolicyBatchControllerRepository policyBatchControllerRepository;

    @Override
    public List<PolicyMasterEntity> findAllByIsActiveAndFinancialYearAndPredicates(Boolean isActive, String financialYear, Predicates predicates) {
        return policyBatchControllerRepository.findAllByIsActiveAndFinancialYearAndPredicates(isActive, financialYear, predicates);
    }

    @Override
    public List<PolicyMasterEntity> findAllByIsActiveAndFinancialYearOrderByModifiedOnDesc(Boolean isActive, String financialYear) {
        return policyBatchControllerRepository.findAllByIsActiveAndFinancialYearOrderByModifiedOnDesc(isActive, financialYear);
    }

    @Override
    public List<PolicyMasterEntity> searchPolicy(String policyId, String policyNumber) {
        return policyBatchControllerRepository.searchPolicy(policyId, policyNumber);
    }

}