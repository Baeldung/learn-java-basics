package com.baeldung.domain;

public class Task {

    private String description;
    private boolean completed;
    private int workedHours;

    public Task(String description) {
        this.description = description;
    }

    public void markAsComplete() {
        this.completed = true;
        System.out.println("[Task] Task is marked as complete.");
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    protected int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

}