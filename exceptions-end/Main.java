package com.baeldung;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String invalidDate = "2050/12/31";
        try {
            LocalDate date = LocalDate.parse(invalidDate);
            System.out.println("Date parsed: " + date);
        } catch (DateTimeParseException e) {
            System.out.println("Error: The date format isn’t correct.");
        }

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt"));
            String line = reader.readLine();
            System.out.println("First line: " + line);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        finally {
            if (reader != null) {
                System.out.println("Closing reader...");
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error closing the reader.");
                }
            }
        }

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
