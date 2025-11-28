package com.baeldung.domain;

public abstract class BaseTask {

    private String description;
    private boolean completed;

    public BaseTask(String description) {
        this.description = description;
    }

    public final void complete() {
        if (!completed) {
            applyTaskSpecificLogic();
            completed = true;
        }
    }

    protected abstract void applyTaskSpecificLogic();

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

}
