package com.baeldung;

public class Main {

    public static void main(String[] args) {
        String[] tasks = {"Go to Baeldung", "Learn new things", "Implement"};

        // for (int i = 0; i <= tasks.length; i++) {
        for (int i = 0; i < tasks.length; i++) {
            System.out.println("i = " + i + " Task = " + tasks[i]);
        }
    }
}