Package com.sa.fund.interest.controller.policysearchcontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DebitFundHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long policyNo;
    private String fundName;
    private Double amountDebited;
    private String date;

    public DebitFundHistory() {
    }
    
    public DebitFundHistory(Long policyNo, String fundName, Double amountDebited, String date) {
        this.policyNo = policyNo;
        this.fundName = fundName;
        this.amountDebited = amountDebited;
        this.date = date;
    }

    public Long getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(Long policyNo) {
        this.policyNo = policyNo;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public Double getAmountDebited() {
        return amountDebited;
    }

    public void setAmountDebited(Double amountDebited) {
        this.amountDebited = amountDebited;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}