package com.baeldung.domain;

public class Task {
    // 1. Fields are now private to enforce encapsulation (Information Hiding)
    private String description;
    private boolean completed;
    private int workedHours;

    public Task(String description) {
        this.description = description != null ? description : "";
        this.completed = false; // Default value
        this.workedHours = 0;   // Default value
    }

    // --- 2. Public Getter Methods (Accessors) ---

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    // --- 2. Public Setter Methods   ---

    public void setDescription(String description) {
        this.description = description != null ? description : "";
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours >= 0 ? workedHours : 0;
    }
}
