package com.sa.fund.master.lookupcontroller.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "lookup_type")
public class LookUpType {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private String status;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lookUpType")
    private List<LookUpValue> lookUpValues;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<LookUpValue> getLookUpValues() {
        return lookUpValues;
    }

    public void setLookUpValues(List<LookUpValue> lookUpValues) {
        this.lookUpValues = lookUpValues;
    }
}