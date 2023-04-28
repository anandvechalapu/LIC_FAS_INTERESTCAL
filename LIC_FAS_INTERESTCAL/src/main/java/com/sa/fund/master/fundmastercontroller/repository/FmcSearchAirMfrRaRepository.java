@Repository
public interface FmcSearchAirMfrRaRepository extends JpaRepository<AirMfrRaMstRateDto, Long> {
 
    //Finds the AirMfrRaMstRates by product, variant, financial year, effective start and end date, and active status
    @Query(value = "SELECT * FROM air_mfr_ra_mst_rate WHERE product = :product AND variant = :variant AND financial_year = :financial_year AND effective_start_date = :effective_start_date AND effective_end_date = :effective_end_date AND active_status = :active_status ORDER BY modified_date DESC")
    List<AirMfrRaMstRateDto> findBySearchCriteria(@Param("product") String product, @Param("variant") String variant, @Param("financial_year") String financial_year, @Param("effective_start_date") Date effective_start_date, @Param("effective_end_date") Date effective_end_date, @Param("active_status") Boolean active_status, Pageable pageable);
 
}