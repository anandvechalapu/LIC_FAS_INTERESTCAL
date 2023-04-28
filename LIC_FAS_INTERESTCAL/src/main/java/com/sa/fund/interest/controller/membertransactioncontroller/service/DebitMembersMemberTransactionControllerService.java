@Service
public class DebitMembersMemberTransactionControllerService {

    @Autowired
    private DebitMembersMemberTransactionControllerRepository debitMembersMemberTransactionControllerRepository;

    public CommonResponseDto debitMemberAccount(DebitRequestDto debitRequestDto) {
        return debitMembersMemberTransactionControllerRepository.debitMemberAccount(debitRequestDto);
    }

}