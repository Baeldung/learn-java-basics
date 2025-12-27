package com.baeldung;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n --- Creating Dates ---");
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date (LocalDate): " + today);

        LocalTime now = LocalTime.now();
        System.out.println("Current Time (LocalTime): " + now);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time (LocalDateTime): " + currentDateTime);

        ZonedDateTime currentDateTimeInParis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Current Date and Time in Paris (ZonedDateTime): " + currentDateTimeInParis);

        LocalDate specificDate = LocalDate.of(2030, 10, 15);
        System.out.println("A specific Date (LocalDate): " + specificDate);

        ZonedDateTime zonedDate = ZonedDateTime.of(2050, 10, 15, 12, 0, 0, 0, ZoneId.of("Europe/Paris"));
        System.out.println("Zoned Date (ZonedDateTime): " + zonedDate);

        System.out.println("\n --- Immutability ---");
        LocalDate nextWeek = today.plusDays(7);
        System.out.println("Next Week: " + nextWeek);
        System.out.println("Today is still : " + today);

        System.out.println("\n --- Manipulating Dates ---");
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime yesterdaySameTime = nowDt.minusDays(1);
        LocalDateTime nextYear = nowDt.plusYears(1);

        System.out.println("Now is: " + nowDt);
        System.out.println("The same time yesterday is: " + yesterdaySameTime);
        System.out.println("Next year is: " + nextYear);

        LocalDateTime futureDate = nowDt.withYear(2055);
        System.out.println("futureDate [calling withYear(2055)] is: " + futureDate);

        boolean isFuture = nextYear.isAfter(nowDt);
        boolean isPast = yesterdaySameTime.isBefore(nowDt);

        System.out.println("Is next year after now? " + isFuture);
        System.out.println("Is yesterday before now? " + isPast);

        System.out.println("\n --- Formatting and Parsing ---");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedDate = nowDt.format(formatter);
        System.out.println("Now (LocalDateTime) formatted: " + formattedDate);

        String dateString = "15/10/2030";
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parsedDate = LocalDate.parse(dateString, parser);
        System.out.println("Parsed LocalDate: " + parsedDate);
    }
}