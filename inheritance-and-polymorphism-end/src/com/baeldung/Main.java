package com.baeldung;

import com.baeldung.domain.PriorityTask;
import com.baeldung.domain.Task;

public class Main {

    public static void main(String[] args) {
        PriorityTask priorityTask1 = new PriorityTask("[Prio-Task One]: learn Java basics", 10);
        System.out.println("Priority Task Created:");
        System.out.println(priorityTask1.getDescription());
        System.out.println("With Priority:");
        System.out.println(priorityTask1.getPriority());

        System.out.println("\n-------------------------\n");

        Task normalTask = new Task("[Normal-Task]: learn Java Methods");
        Task highPriorityTask = new PriorityTask("[Prio-Task]: learn Java Inheritance", 120);
        System.out.println("Mark normalTask as complete:");
        normalTask.markAsComplete();
        System.out.println("Mark highPriorityTask as complete:");
        highPriorityTask.markAsComplete();
        // This line will cause a compiler error!
        // int priority = highPriorityTask.getPriority();

        System.out.println("\n-------------------------\n");
        if (highPriorityTask instanceof PriorityTask priorityTask) {
            System.out.println("[Prio-Task] highPriorityTask's priority:");
            System.out.println(priorityTask.getPriority());
        }

        // This line will cause a compiler error!
        // highPriorityTask.getWorkedHours();
    }
}