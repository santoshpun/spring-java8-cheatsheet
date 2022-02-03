package com.santosh.springjava8cheatsheet.datetime;

import org.springframework.stereotype.Component;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

@Component
public class DatetimeExample1 {

    public void test() {

        // the current date
        LocalDate date = LocalDate.now();
        System.out.println(String.format("Current date : %s", date));

        // the current time
        LocalTime time = LocalTime.now();
        System.out.println(String.format("Current time : %s", time));

        // will give us the current time and date
        LocalDateTime current = LocalDateTime.now();
        System.out.println(String.format("Current date & time : %s", current));

        // to print in a particular format
        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDateTime = current.format(format);
        System.out.println(String.format("Formatted date & time : %s", formattedDateTime));

        // printing months days and seconds
        Month month = current.getMonth();
        int day = current.getDayOfMonth();
        int minute = current.getMinute();
        System.out.println(String.format("Month : %s, Day : %s, Seconds : %s", month, day, minute));

        // printing some specified date
        LocalDate date2 = LocalDate.of(2022, 1, 26);
        System.out.println(String.format("Specified date & time : %s", date2));

        // printing date with current time.
        LocalDateTime specificDate = current
                .withDayOfMonth(24)
                .withYear(2020);
        System.out.println(String.format("Specified date & time : %s", specificDate));

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println(String.format("Tomorrow : %s", tomorrow));

        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println(String.format("Date before 1 month : %s", previousMonthSameDay));

        boolean notBefore = LocalDate.parse("2016-06-12")
                .isBefore(LocalDate.parse("2016-06-11"));
        System.out.println(String.format("Date is not before : %s", notBefore));

        boolean isAfter = LocalDate.parse("2016-06-12")
                .isAfter(LocalDate.parse("2016-06-11"));
        System.out.println(String.format("Date is after : %s", isAfter));

        LocalTime sixThirty = LocalTime.of(6, 30);
        LocalTime sixThirty1 = LocalTime.parse("06:30");

        LocalTime sevenThirty = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);
        int six = LocalTime.parse("06:30").getHour();

        boolean isBefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));

        LocalDate initialDate = LocalDate.parse("2019-05-10");
        LocalDate finalDate = initialDate.plus(Period.ofDays(5));
        int five = Period.between(initialDate, finalDate).getDays();

        LocalTime initialTime = LocalTime.of(6, 30, 0);
        LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
        long thirty = Duration.between(initialTime, finalTime).getSeconds();
    }
}
