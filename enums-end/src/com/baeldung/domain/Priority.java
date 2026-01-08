package com.baeldung.domain;

public enum Priority {
    LOW(5),
    MEDIUM(3),
    HIGH(1);

    private final int estimatedDays;

    Priority(int estimatedDays) {
        this.estimatedDays = estimatedDays;
    }

    public int getEstimatedDays() {
        return estimatedDays;
    }
}