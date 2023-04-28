package com.sa.fund.interest.controller.policybatchcontroller.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "policy_batch")
public class PolicyBatch {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "policy_id")
  private Long policyId;

  @Column(name = "batch_number")
  private Long batchNumber;

  @Column(name = "batch_date")
  private Date batchDate;

  @Column(name = "financial_year")
  private String financialYear;

  @Column(name = "remarks")
  private String remarks;

  @Column(name = "batch_type")
  private String batchType;

  @Column(name = "current_quarter")
  private String currentQuarter;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getPolicyId() {
    return policyId;
  }

  public void setPolicyId(Long policyId) {
    this.policyId = policyId;
  }

  public Long getBatchNumber() {
    return batchNumber;
  }

  public void setBatchNumber(Long batchNumber) {
    this.batchNumber = batchNumber;
  }

  public Date getBatchDate() {
    return batchDate;
  }

  public void setBatchDate(Date batchDate) {
    this.batchDate = batchDate;
  }

  public String getFinancialYear() {
    return financialYear;
  }

  public void setFinancialYear(String financialYear) {
    this.financialYear = financialYear;
  }

  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public String getBatchType() {
    return batchType;
  }

  public void setBatchType(String batchType) {
    this.batchType = batchType;
  }

  public String getCurrentQuarter() {
    return currentQuarter;
  }

  public void setCurrentQuarter(String currentQuarter) {
    this.currentQuarter = currentQuarter;
  }
}