@Repository
public class PolicySearchControllerRepository {
    
    @Autowired
    private EntityManager entityManager;

    public ResponseEntity<?> searchByPolicyNo(String policyNumber) {
        try {
            List<Object[]> policyDetails = entityManager.createNativeQuery("SELECT pm.policy_number, pm.financial_year, pm.policy_type, pm.variant, " + 
            "pfh.trnx_date, pfh.effective_txn_date, pfh.quarter, pfh.air_amount FROM policy_master pm JOIN policy_fund_history_v2 pfh " +
            "ON pm.policy_number = pfh.policy_number WHERE pm.policy_number = :policyNumber")
            .setParameter("policyNumber", policyNumber)
            .getResultList();

            if(policyDetails == null || policyDetails.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            else {
                Map<String, Object> policyData = new HashMap<>();
                policyData.put("policyNumber", policyDetails.get(0)[0]);
                policyData.put("financialYear", policyDetails.get(0)[1]);
                policyData.put("policyType", policyDetails.get(0)[2]);
                policyData.put("variant", policyDetails.get(0)[3]);
                policyData.put("trnxDate", policyDetails.get(0)[4]);
                policyData.put("effectiveTxnDate", policyDetails.get(0)[5]);
                policyData.put("quarter", policyDetails.get(0)[6]);
                policyData.put("airAmount", policyDetails.get(0)[7]);
                return ResponseEntity.status(HttpStatus.OK).body(policyData);
            }
        }
        catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}