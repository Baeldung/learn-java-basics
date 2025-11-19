package com.baeldung.domain;

public class Task {

    public static final int MAX_DESCRIPTION_LENGTH = 100;

    private final String name;

    private String description;
    private boolean completed;
    private int workedHours;

    public static int publicTaskCounter = 0;
    private static int taskCounter = 0;

    public Task(String name, String description) {
        this.description = description;
        this.name = name;
        publicTaskCounter++;
        taskCounter++;
    }

    public static int getTaskCounter() {
        // boolean hasDescription = description == null; // uncommenting this raises a compilation error
        return taskCounter;
    }

    public void setDescription(String description) {
        if (TaskUtils.isDescriptionValid(description)) {
            this.description = description;
        } else {
            System.out.println("Updating description rejected. Reason: Description is not valid");
        }
    }

    public String getName() {
        return name;
    }

    // uncommenting this would raise a compilation error
    /*
    public void setName(String name) {
        this.name = name;
    }*/

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }
}