package com.baeldung.domain;

import com.baeldung.domain.BaseTask;

public class PriorityTask extends BaseTask {
    
    private int priority;

    public PriorityTask(String description, int priority) {
        super(description);
        this.priority = priority;
    }

    @Override
    protected void applyTaskSpecificLogic() {
        if (priority >= 10) {
            System.out.println(super.getDescription() + ": Sending high priority notification for task");
        } else {
            System.out.println(super.getDescription() + ": Normal priority task completed");
        }
    }

}
