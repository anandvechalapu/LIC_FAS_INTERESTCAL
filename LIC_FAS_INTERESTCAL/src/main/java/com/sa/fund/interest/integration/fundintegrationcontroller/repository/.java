@Repository
public class ExternalCalculateAirMfrRaFundIntegrationControllerRepository {
    private Logger logger = LoggerFactory.getLogger(ExternalCalculateAirMfrRaFundIntegrationControllerRepository.class);

    @Autowired
    private PolicyFundCoreService policyFundCoreService;

    public FundSearchResponseDto calculateAirMfrRa(AirMfrRaRequestDto requestDto){
        logger.info("Starting to calculate AIR, MFR, and RA values");

        FundSearchResponseDto fundSearchResponseDto = null;
        try {
            // Calculate AIR, MFR, and RA values
            fundSearchResponseDto = policyFundCoreService.calcInterestForAirMfrRa(requestDto);
            fundSearchResponseDto.setStatus("SUCCESS");
            fundSearchResponseDto.setStatusId(1);
            fundSearchResponseDto.setMessage("RECORD_RETRIEVED");
            logger.info("Calculation of AIR, MFR, and RA values successful");
        } catch (Exception e) {
            fundSearchResponseDto = new FundSearchResponseDto();
            fundSearchResponseDto.setStatus("ERROR");
            fundSearchResponseDto.setStatusId(0);
            fundSearchResponseDto.setMessage(e.getMessage());
            logger.error("Calculation of AIR, MFR, and RA values failed", e);
        }

        return fundSearchResponseDto;
    }
}