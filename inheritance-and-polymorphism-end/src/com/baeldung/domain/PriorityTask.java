package com.baeldung.domain;

public class PriorityTask extends Task {

    private int priority;

    public PriorityTask(String description, int priority) {
        super(description);
        this.priority = priority;
    }

    @Override
    public void markAsComplete() {
        super.markAsComplete();
        if (this.priority > 100) {
            System.out.print("[PriorityTask] Alert: A high-priority task completed with worked hours: ");
            System.out.println(this.getWorkedHours());
        }
    }

    public int getPriority() {
        return priority;
    }
}