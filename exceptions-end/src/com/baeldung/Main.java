package com.baeldung;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String invalidDate = "2050/12/31";
        try {
            LocalDate date = LocalDate.parse(invalidDate);
            System.out.println("Date parsed: " + date);
        } catch (DateTimeParseException e) {
            System.out.println("Error: The date format isn’t correct.");
        }

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Error: That's not a valid number.");
        } 
        finally {
            System.out.println("Closing scanner...");
            scanner.close();
        }


        System.out.println("Validating priority number:");
        try {
            validatePriority(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        String text = null;
        // int length = text.length(); // uncomment to trigger NPE

        int[] numbers = {1, 2, 3};
        // int number = numbers[5]; // uncomment to trigger ArrayIndexOutOfBoundsException
    }

    public static void validatePriority(int priority) {
        if (priority < 0) {
            throw new IllegalArgumentException("Priority cannot be negative");
        }
        System.out.println("Priority is valid: " + priority);
    }
}
