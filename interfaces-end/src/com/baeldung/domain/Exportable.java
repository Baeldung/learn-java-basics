package com.baeldung.domain;

public interface Exportable {

    String FILE_TYPE = "CSV";

    void exportToCSV();

    default void exportWithTimestamp() {
        exportToCSV();
        System.out.println(java.time.Instant.now());
    }
}