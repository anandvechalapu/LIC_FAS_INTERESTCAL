@Repository
public interface DebitMemberTransactionControllerRepository extends JpaRepository<MembersDto, Long> {

    CommonResponseDto findByDebitRequestDto(DebitRequestDto debitRequestDto);
    
    MemberFundHistoryV2Entity findByMember(MembersDto membersDto);
    
    boolean validateEffectiveDate(Date effectiveDate);
    
    boolean isExitPolicy(String policy);
    
    boolean isClosingBalanceGreaterThanDebitAmount(int closingBalance, int debitAmount);
    
    void saveDebitTransaction(MembersDto membersDto);
    
    double calculateInterestRate(double interestRate);
    
    void executePolicyBatch();
}