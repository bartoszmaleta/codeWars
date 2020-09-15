package javaExe.kyu7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

import static java.time.LocalDate.now;
import static java.time.LocalDate.of;
import static java.time.temporal.ChronoUnit.DAYS;

public class AgeInDays {
    public static void main(String[] args) {
        LocalDate birthday = now().minusYears(1);
        System.out.println(ageInDays(birthday.getYear(), birthday.getMonthValue(), birthday.getDayOfMonth()));

    }

    // MORE DESCRIPTIVE SOLUTION
    public static String ageInDays2(int year, int month, int day) {
        String monthStr = month < 10 ? "0" + month : String.valueOf(month);
        String dayStr = day < 10 ? "0" + day : String.valueOf(day);
        LocalDate birthday = LocalDate.parse(year + "-" + monthStr + "-" + dayStr);
        LocalDateTime birthdayDateTime = birthday.atStartOfDay();
        double birthdayLong = birthdayDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();

        double now = LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();

        int days = (int) Math.floor(Math.abs(birthdayLong - now) / (1000 * 3600 * 24));

        return days > 1 ? "You are " + days + " days old" : "You are " + " day old";
    }

    public static String ageInDays(int year, int month, int day) {
        String monthStr = month < 10 ? "0" + month : String.valueOf(month);
        String dayStr = day < 10 ? "0" + day : String.valueOf(day);
        double birthday = LocalDate.parse(year + "-" + monthStr + "-" + dayStr).atStartOfDay()
                .atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();

        double now = LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();

        int days = (int) Math.floor(Math.abs(birthday - now) / (1000 * 3600 * 24));

        return days > 1 ? String.format("You are %d days old", days) : "You are 1 day old";
    }

    // SECOND SOLUTION
    public static String ageInDays3(final int y, final int m, int d) {
        return String.format("You are %d days old", now().toEpochDay() - of(y, m, d).toEpochDay());
    }

    // THIRD SOLUTION
    static String ageInDays4(int year, int month, int day) {
        return "You are " + DAYS.between(of(year, month, day), now()) + " days old";
    }
}