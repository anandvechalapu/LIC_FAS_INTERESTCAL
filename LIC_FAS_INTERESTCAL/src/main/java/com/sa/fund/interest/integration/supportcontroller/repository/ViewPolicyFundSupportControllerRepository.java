@Repository
public interface ViewPolicyFundSupportControllerRepository extends JpaRepository<BatchDto, Long> {

    /**
     * Method to view policy fund based on policyId, policyNumber, trnxDate, isBatch, isAuto, setOpeningBalance and recalculate.
     * 
     * @param policyId
     * @param policyNumber
     * @param trnxDate
     * @param isBatch
     * @param isAuto
     * @param setOpeningBalance
     * @param recalculate
     * @return responseData
     */
    public ResponseData viewPolicyFund(Integer policyId, String policyNumber, String trnxDate, Boolean isBatch,
            Boolean isAuto, Boolean setOpeningBalance, Boolean recalculate);

}