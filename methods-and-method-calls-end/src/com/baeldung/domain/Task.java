package com.baeldung.domain;

public class Task {

    public String description;
    public boolean completed;
    public int workedHours;

    public Task(String description) {
        this.description = description;
    }

    public void markAsComplete() {
        this.completed = true;
    }

    public void addWorkedHours(int hours) {
        this.workedHours = this.workedHours + hours;
    }

    public int markAsCompleteAndReturnWorkedHours() {
        this.completed = true;
        return this.workedHours;
    }

    public int markAsCompleteAndReturnWorkedHours(int finalHours) {
        addWorkedHours(finalHours);
        return markAsCompleteAndReturnWorkedHours();
    }
}