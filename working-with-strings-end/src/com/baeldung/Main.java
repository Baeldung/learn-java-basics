package com.baeldung;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n --- Literal vs Object---");
        String literalString = "Task: Learn Java Basics";
        String objectString = new String("Task: Learn Java Basics");

        System.out.println("\n --- Understanding String Immutability ---");
        String task1 = "Task X: Learn Java Class and Object Basics";
        task1.replace("X", "One");
        System.out.println(task1);

        System.out.println("\n --- Fix: modify and assign  ---");
        String newTask1 = task1.replace("X", "One");
        System.out.println(newTask1);

        System.out.println("\n --- Comparing Strings  ---");
        String taskA = "Task of today: Learn Java Strings";
        String taskB = "Task of today: Learn Java Strings";
        String taskC = new String("Task of today: Learn Java Strings");

        System.out.println("taskA == taskB ?");
        System.out.println((taskA == taskB));
        System.out.println("taskA == taskC ?");
        System.out.println((taskA == taskC));
        System.out.println("taskA equals taskC ?");
        System.out.println(taskA.equals(taskC));

        System.out.println("\n --- Concatenation  ---");
        String task2Prefix = "Task Two: ";
        String task2 = task2Prefix.concat("Learn Java Methods");
        System.out.println(task2);

        System.out.println("\n --- The '+' Operator  ---");
        String task3Prefix = "Task Three: ";
        String learn = "Learn ";
        String what = "Java Inheritance";
        String task3 = task3Prefix + learn + what + "!";
        System.out.println(task3);
        int hours = 5;
        String task3WithHours = task3 + " in " + hours + " hours.";
        System.out.println(task3WithHours);

        System.out.println("\n --- Common String Operations  ---");
        String task4 = "  Task Four: Learn Java Polymorphism  ";
        System.out.println("The task4 String's length:" + task4.length());
        System.out.println("The task4 String to uppercase: [" + task4.toUpperCase() + "]");
        System.out.println("The task4 String to lowercase: [" + task4.toLowerCase() + "]");
        System.out.println("The task4 String trimmed: [" + task4.trim() + "]");

        System.out.println("\n --- Searching and Extracting  ---");
        String task5 = "Task Five: Learn Java Abstraction.";
        System.out.println("task5 starts with 'Task': " + task5.startsWith("Task"));
        System.out.println("task5 ends with 'Abstraction': " + task5.endsWith("Abstraction"));
        System.out.println("task5 ends with 'Abstraction.': " + task5.endsWith("Abstraction."));
        System.out.println("task5 contains 'java': " + task5.contains("java"));
        System.out.println("task5 contains 'Java': " + task5.contains("Java"));
        int colonIndex = task5.indexOf(": ");
        System.out.println("The index of ': ' in task5: " + colonIndex);
        String task5Content = task5.substring(colonIndex + 2);
        System.out.println("The content of task5: [" + task5Content + "]");
        System.out.println("The prefix of task5: [" + task5.substring(0, colonIndex) + "]");

    }
}