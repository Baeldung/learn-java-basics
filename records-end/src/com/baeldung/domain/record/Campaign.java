package com.baeldung.domain.record;

public record Campaign(String code) {

    public Campaign {
        if (code == null) {
            throw new IllegalArgumentException("Code value cannot be null");
        }
    }

    public void exportCampaign() {
        System.out.println("Exporting campaign...");
    }
}