@Repository
public class ExternalcalculateAirMfrRaFundIntegrationControllerRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExternalcalculateAirMfrRaFundIntegrationControllerRepository.class);

    @Autowired
    private PolicyFundCoreService policyFundCoreService;

    public FundSearchResponseDto calculateAirMfrRa(AirMfrRaRequestDto airMfrRaRequestDto) {
        FundSearchResponseDto fundSearchResponseDto = new FundSearchResponseDto();
        try {
            LOGGER.info("Start of calculation process");
            fundSearchResponseDto = policyFundCoreService.calcInterestForAirMfrRa(airMfrRaRequestDto);
            fundSearchResponseDto.setResponseStatus("SUCCESS");
            fundSearchResponseDto.setStatusId("1");
            fundSearchResponseDto.setResponseMessage("RECORD_RETRIEVED");
            LOGGER.info("End of calculation process");
        } catch (Exception e) {
            fundSearchResponseDto.setResponseStatus("ERROR");
            fundSearchResponseDto.setStatusId("0");
            fundSearchResponseDto.setResponseMessage(e.getMessage());
        }
        return fundSearchResponseDto;
    }
}