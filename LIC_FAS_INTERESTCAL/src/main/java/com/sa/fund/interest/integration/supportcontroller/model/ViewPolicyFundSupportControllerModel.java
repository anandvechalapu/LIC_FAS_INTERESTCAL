@Entity
@Table(name = "ViewPolicyFundSupportController")
public class ViewPolicyFundSupportControllerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "policy_id")
    private Integer policyId;

    @Column(name = "policy_number")
    private String policyNumber;

    @Column(name = "trnx_date")
    private String trnxDate;

    @Column(name = "is_batch")
    private Boolean isBatch;

    @Column(name = "is_auto")
    private Boolean isAuto;

    @Column(name = "set_opening_balance")
    private Boolean setOpeningBalance;

    @Column(name = "recalculate")
    private Boolean recalculate;

}