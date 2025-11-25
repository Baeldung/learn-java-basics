package com.baeldung;

import com.baeldung.domain.Campaign;
import com.baeldung.domain.Exportable;
import com.baeldung.domain.Task;

public class Main {

    public static void main(String[] args) {
        Task task = new Task("Finish lesson on interfaces");
        Campaign campaign = new Campaign("C1");
        performExport(task);
        performExport(campaign);

    }

    public static void performExport(Exportable item) {
        item.exportToCSV();
    }
}