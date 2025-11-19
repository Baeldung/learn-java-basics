package com.baeldung.domain;

public class TaskUtils {

    public static boolean isDescriptionValid(String description) {
        return description != null && description.length() <= Task.MAX_DESCRIPTION_LENGTH;
    }
}