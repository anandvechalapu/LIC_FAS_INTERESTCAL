package com.sa.fund.master.lookupcontroller.model;

public class DecodeLookup {
    private String input;
    private String decodedString;

    public DecodeLookup() {}

    public DecodeLookup(String input, String decodedString) {
        this.input = input;
        this.decodedString = decodedString;
    }

    public String getInput() {
        return this.input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getDecodedString() {
        return this.decodedString;
    }

    public void setDecodedString(String decodedString) {
        this.decodedString = decodedString;
    }

}