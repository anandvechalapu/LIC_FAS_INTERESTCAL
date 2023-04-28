@Repository
public interface GetInterestRateSlabRepository extends JpaRepository<GetInterestRateSlab, Long> {
 
  List<GetInterestRateSlab> findAllByFundCode(String fundCode);
 
  GetInterestRateSlab save(GetInterestRateSlab getInterestRateSlab);
  
  List<GetInterestRateSlab> findAllByEffectiveStartDateAndEffectiveEndDate(Date effectiveStartDate, Date effectiveEndDate);
  
  List<GetInterestRateSlab> findAllByLastModifiedDate(Date lastModifiedDate);
  
  Optional<GetInterestRateSlab> findById(Long id);
}