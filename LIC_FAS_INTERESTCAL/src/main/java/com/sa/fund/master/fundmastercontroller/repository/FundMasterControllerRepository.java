@Repository
public interface FundMasterControllerRepository extends JpaRepository<Variant, Long> {

	@Cached(key = "FUND_getVariant")
	@Cacheable(unless = "#result == null")
	@Query("SELECT v FROM Variant v WHERE v.variantId = :variantId")
	Optional<Variant> getVariant(@Param("variantId") Long variantId); 

}