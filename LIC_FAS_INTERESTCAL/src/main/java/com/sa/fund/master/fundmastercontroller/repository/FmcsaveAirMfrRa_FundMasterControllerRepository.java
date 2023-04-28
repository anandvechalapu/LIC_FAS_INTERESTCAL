@Repository
public interface FmcsaveAirMfrRa_FundMasterControllerRepository extends JpaRepository<AirMfrRaMstRateDto, Long> {
	
	@PostMapping("/fmc/saveAirMfrRa")
	@Transactional
	CommonResponseDto<Object> saveAirMfrRaMstRate(@RequestBody AirMfrRaMstRateDto airMfrRaMstRateDto);
}