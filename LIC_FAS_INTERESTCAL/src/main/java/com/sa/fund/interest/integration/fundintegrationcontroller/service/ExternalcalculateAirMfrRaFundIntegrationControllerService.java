@Service
public class ExternalcalculateAirMfrRaFundIntegrationControllerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExternalcalculateAirMfrRaFundIntegrationControllerService.class);

    @Autowired
    ExternalcalculateAirMfrRaFundIntegrationControllerRepository externalcalculateAirMfrRaFundIntegrationControllerRepository;

    public FundSearchResponseDto calculateAirMfrRa(AirMfrRaRequestDto airMfrRaRequestDto) {
        FundSearchResponseDto fundSearchResponseDto = null;
        try {
            LOGGER.info("Start of calculation process");
            fundSearchResponseDto = externalcalculateAirMfrRaFundIntegrationControllerRepository.calculateAirMfrRa(airMfrRaRequestDto);
            LOGGER.info("End of calculation process");
        } catch (Exception e) {
            fundSearchResponseDto.setResponseStatus("ERROR");
            fundSearchResponseDto.setStatusId("0");
            fundSearchResponseDto.setResponseMessage(e.getMessage());
        }
        return fundSearchResponseDto;
    }
}