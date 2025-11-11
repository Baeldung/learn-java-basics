package com.baeldung;

import com.baeldung.domain.Task;

public class Main {

    public static void main(String[] args) {
        Task task1 = new Task("Learn about methods");

        System.out.println(task1.description);
        System.out.println(task1.completed);

        task1.markAsComplete();

        System.out.println("After calling markAsComplete() ... ");
        System.out.println(task1.completed);
        System.out.println("\n-------------------------\n");

        System.out.println(task1.workedHours);
        task1.addWorkedHours(4);
        task1.addWorkedHours(2);
        System.out.println("After two addWorkedHours() calls... ");
        System.out.println(task1.workedHours);
        System.out.println("\n-------------------------\n");

        Task task2 = new Task("Learn about method's return value");
        task2.addWorkedHours(4);
        int totalHours = task2.markAsCompleteAndReturnWorkedHours();

        System.out.println(task2.description);
        System.out.println(task2.completed);
        System.out.println(totalHours);
        System.out.println("\n-------------------------\n");

        Task task3 = new Task("Simple completion");
        task3.addWorkedHours(3);
        int totalHours3 = task3.markAsCompleteAndReturnWorkedHours();
        System.out.println(task3.description);
        System.out.println(task3.completed);
        System.out.println(totalHours3);
        System.out.println("\n-------------------------\n");

        Task task4 = new Task("Completion with final hours");
        task4.addWorkedHours(4);
        int totalHours4 = task4.markAsCompleteAndReturnWorkedHours(3);
        System.out.println(task4.description);
        System.out.println(task4.completed);
        System.out.println(totalHours4);

    }

}