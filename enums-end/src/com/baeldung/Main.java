package com.baeldung;

import java.time.DayOfWeek;

import com.baeldung.domain.Priority;
import com.baeldung.domain.PriorityTask;

public class Main {

    public static void main(String[] args) {
        System.out.println(" ... Why do we need enums ...");
        DayOfWeek dayVariable = DayOfWeek.MONDAY;
        System.out.println("Builtin enum DayOfWeek:" + dayVariable);

        System.out.println("\n ... Enums in control flow ...");

        DayOfWeek today = DayOfWeek.SATURDAY;
        switch (today) {
            case MONDAY:
                System.out.println("It's Monday, back to work!");
                break;
            case FRIDAY:
                System.out.println("It's Friday, almost weekend!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend, time to relax!");
                break;
            default:
                System.out.println("It's a regular weekday.");
                break;
        }

        System.out.println("\n ... Defining custom enums ...");
        Priority p = Priority.HIGH;
        System.out.println("Priority: " + p + ". Estimated days to complete: " + p.getEstimatedDays());

        System.out.println("\n ... Practical example ...");

        PriorityTask task = new PriorityTask("Fix the critical bug", Priority.HIGH);
        System.out.println("Task: " + task.getDescription());
        System.out.println("Priority: " + task.getPriority());
        System.out.println("Estimated days:" + task.getPriority()
            .getEstimatedDays());

        System.out.println("\n ... Builtin enum methods ...");
        for (Priority priority : Priority.values()) {
            System.out.println("Priority: " + priority + ", Estimated days: " + priority.getEstimatedDays() + ", Ordinal: " + priority.ordinal());
        }

        Priority convertedPriority = Priority.valueOf("HIGH");
        System.out.println("Priority from string 'HIGH': " + convertedPriority + ". Estimated days: " + convertedPriority.getEstimatedDays());
    }
}