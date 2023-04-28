@Service
public class ExternalCalculateAirMfrRaFundIntegrationControllerService {

    private Logger logger = LoggerFactory.getLogger(ExternalCalculateAirMfrRaFundIntegrationControllerService.class);

    @Autowired
    private ExternalCalculateAirMfrRaFundIntegrationControllerRepository externalCalculateAirMfrRaFundIntegrationControllerRepository;

    public FundSearchResponseDto calculateAirMfrRa(AirMfrRaRequestDto requestDto){
        logger.info("Starting to calculate AIR, MFR, and RA values");
        return externalCalculateAirMfrRaFundIntegrationControllerRepository.calculateAirMfrRa(requestDto);
    }
}