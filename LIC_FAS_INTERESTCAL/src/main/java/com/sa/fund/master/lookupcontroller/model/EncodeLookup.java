package com.sa.fund.master.lookupcontroller.model;

import javax.persistence.*;

@Entity
@Table(name = "encode_lookup")
public class EncodeLookup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "payload")
    private String payload;

    @Column(name = "encoded_value")
    private String encodedValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getEncodedValue() {
        return encodedValue;
    }

    public void setEncodedValue(String encodedValue) {
        this.encodedValue = encodedValue;
    }
}