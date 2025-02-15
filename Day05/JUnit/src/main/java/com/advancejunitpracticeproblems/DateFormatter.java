package com.advancejunitpracticeproblems;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {

    // Convert "yyyy-MM-dd" to "dd-MM-yyyy"
    public static String formatDate(String inputDate) {
        try {
            // Define input format
            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            // Define output format
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            // Parse input date and format it
            LocalDate date = LocalDate.parse(inputDate, inputFormatter);
            return date.format(outputFormatter);

        } catch (DateTimeParseException e) {
            return "Invalid Date Format";
        }
    }
}

