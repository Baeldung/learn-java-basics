package com.baeldung.domain;

public class Campaign implements Exportable {

    private String code;

    public Campaign() {
    }

    public Campaign(String code) {
        this.code = code;
    }

    @Override
    public void exportToCSV() {
        System.out.println("Exporting Campaign to CSV file...");
    }
}
