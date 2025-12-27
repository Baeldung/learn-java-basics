package com.baeldung;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main {

    public static void main(String[] args) {
        Path path = Path.of("output.txt");
        String content = "Hello, File World!";

        try {
            // Writing
            Files.writeString(path, content);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        try {
            String secondContent = "\nAppending to file!";
            // create the file if it doesn't exist, and append to it otherwise
            Files.writeString(path, secondContent, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        try {
            // Reading
            String readContent = Files.readString(path);
            System.out.println("Read from file: " + readContent);

        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }

        Path dirPath = Path.of("data");
        Path filePath = dirPath.resolve("output.txt");

        try {
            Files.createDirectories(dirPath);
            Files.writeString(filePath, "Content in a subdirectory");
            System.out.println("File created at: " + filePath.toAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Path noFile = Path.of("non_existent_file.txt");

        if (Files.exists(noFile)) {
            try {
                String contents = Files.readString(noFile);
                System.out.println(content);
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
