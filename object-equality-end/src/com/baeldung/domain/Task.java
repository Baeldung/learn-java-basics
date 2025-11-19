package com.baeldung.domain;

import java.util.Objects;

public class Task {
    private String description;
    private boolean completed;
    private int workedHours;

    public Task(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Task task = (Task) o;

        return Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }
}
