package com.sa.fund.interest.controller.memberbatchcontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MemberFundStmtV2 {
    
    @Id
    private Long id;
    private String dept;
    private Double salary;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getDept() {
        return dept;
    }
    
    public void setDept(String dept) {
        this.dept = dept;
    }
    
    public Double getSalary() {
        return salary;
    }
    
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
}