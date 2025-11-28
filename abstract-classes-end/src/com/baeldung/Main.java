package com.baeldung;

import com.baeldung.domain.BaseTask;
import com.baeldung.domain.PriorityTask;
import com.baeldung.domain.Task;

public class Main {

    public static void main(String[] args) {
        BaseTask standardTask = new Task("Finish the lesson");
        BaseTask highPriorityTask = new PriorityTask("Submit the report", 10);

        standardTask.complete();
        highPriorityTask.complete();
    }

}
