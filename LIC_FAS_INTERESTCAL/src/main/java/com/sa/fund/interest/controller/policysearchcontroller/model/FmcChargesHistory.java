@Entity
@Table(name = "FMC_CHARGES_HISTORY")
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
public class FmcChargesHistory implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "POLICY_FUND_STMT_POLICY_ID")
    private Long policyFundStmtPolicyId;

    @Column(name = "EFFECTIVE_TXN_DATE")
    private LocalDateTime effectiveTxnDate;

    @Column(name = "FMC_TYPE")
    private String fmcType;

    @Column(name = "FMC_AMOUNT")
    private BigDecimal fmcAmount;

    @Column(name = "FMC_PERCENTAGE")
    private BigDecimal fmcPercentage;

    @Column(name = "CREATED_AT", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(name = "UPDATED_AT", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;
}