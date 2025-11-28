package com.baeldung.domain;

import com.baeldung.domain.BaseTask;

public class Task extends BaseTask {

    public Task(String description) {
        super(description);
    }

    @Override
    protected void applyTaskSpecificLogic() {
        System.out.println(super.getDescription() + ": Applying standard task logic");
    }

}