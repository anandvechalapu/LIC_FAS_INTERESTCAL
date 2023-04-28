package com.sa.fund.master.fundmastercontroller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "air_mfr_ra_mst_rate")
public class AirMfrRaMstRateDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "mfr_id")
    private Long mfrId;

    @Column(name = "air_id")
    private Long airId;

    @Column(name = "air_rate")
    private Double airRate;

    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMfrId() {
        return mfrId;
    }

    public void setMfrId(Long mfrId) {
        this.mfrId = mfrId;
    }

    public Long getAirId() {
        return airId;
    }

    public void setAirId(Long airId) {
        this.airId = airId;
    }

    public Double getAirRate() {
        return airRate;
    }

    public void setAirRate(Double airRate) {
        this.airRate = airRate;
    }

}