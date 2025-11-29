package com.baeldung;

import com.baeldung.domain.Task;
// import com.baeldung.domain.TaskHelper; // It is not accessible due to package-private

public class Main {

    public static void main(String[] args) {
        Task myTask = new Task("Organize code with packages");
        // TaskHelper helper = new TaskHelper(); // Not accessible
    }
}