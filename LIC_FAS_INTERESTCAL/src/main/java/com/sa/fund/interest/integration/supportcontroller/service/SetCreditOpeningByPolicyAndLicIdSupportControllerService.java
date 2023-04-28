@Service
@Slf4j
public class SetCreditOpeningByPolicyAndLicIdSupportControllerService {
    
    @Autowired
    private SetCreditOpeningByPolicyAndLicIdSupportControllerRepository repository;
    
    public CommonResponseDto<Object> setCreditOpeningByPolicyAndLicId(BatchDto batchDto) {
        log.info("Set Credit Opening by Policy Id and Lic Id: {}", batchDto);
        return repository.setCreditOpeningByPolicyAndLicId(batchDto);
    }
}