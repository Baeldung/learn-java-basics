package com.baeldung;

import com.baeldung.domain.Task;

public class Main {

    // --- Main Method Assembly ---
    public static void main(String[] args) {
        Task myTask = new Task("Implement Encapsulation Example");

        System.out.println("--- 1. Direct Field Access (Will NOT Compile) ---");
        // Uncomment one of these to test Compiler errors
        /*
        System.out.println(myTask.description);
        myTask.description = null;
        System.out.println(myTask.description);
        */
        System.out.println("Cannot directly access private fields like 'myTask.description' or 'myTask.workedHours'.");
        System.out.println("-------------------------------------------------");

        System.out.println("--- 2. Successful Access/Modification ---");
        System.out.print("Initial Description: ");
        System.out.println(myTask.getDescription());

        myTask.setWorkedHours(25);
        System.out.print("Getting New workedHours: ");
        System.out.println(myTask.getWorkedHours());

        myTask.setDescription("New Description");
        System.out.print("Getting New description: ");
        System.out.println(myTask.getDescription());

        myTask.setCompleted(true);
        System.out.print("Getting New completed Status: ");
        System.out.println(myTask.isCompleted());
        System.out.println("-------------------------------------------------");

        System.out.println("--- 3. Data Consistency ---");
        myTask.setWorkedHours(-40);
        System.out.print("Getting New workedHours: ");
        System.out.println(myTask.getWorkedHours());

        myTask.setDescription(null);
        System.out.print("Getting description: ");
        System.out.println(myTask.getDescription());
        System.out.println("-------------------------------------------------");
    }
}
