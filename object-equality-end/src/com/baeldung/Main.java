package com.baeldung;

import com.baeldung.domain.Task;

public class Main {
  
    public static void main(String[] args) {
        Task task1 = new Task("Learn Java");
        Task task2 = new Task("Learn Java");
        Task task3 = task1;  
        System.out.println(task1 == task3);
        System.out.println(task1.equals(task3));
        System.out.println("---");
        System.out.println(task1 == task2);
        System.out.println(task1.equals(task2));

    }
}
