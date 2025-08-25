import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class FormatDate {

    public static String formatToFullText(LocalDateTime dateTime) {
        // your code here
        if (dateTime == null) {
            return null;
        }
        int hours = dateTime.getHour();
        int min = dateTime.getMinute();
        int sec = dateTime.getSecond();
        int day = dateTime.getDayOfMonth();
        Month mon = dateTime.getMonth();
        int year = dateTime.getYear();
        String month = mon.getDisplayName(TextStyle.SHORT, Locale.FRENCH);
        return String.format("Le %d %s de l'an %d à %dh%dm et %ds", day, month, year, hours, min, sec);

    }
    // ✘ Should return Le 27 oct. de l'an 2021 à 16h52m et 31s, but was Le 27
    // octobre de l'an 2021 à 16h52 et 31s

    public static String formatSimple(LocalDate date) {
        // your code here
        if (date == null) {
            return null;
        }
        Month mon = date.getMonth();
        String month = mon.getDisplayName(TextStyle.FULL, Locale.ITALIAN);
        int day = date.getDayOfMonth();
        int year = date.getYear() % 100;
        return String.format("%s %d %d", month, day, year);
    }

    public static String formatIso(LocalTime time) {
        // your code here
        if (time == null) {
            return null;
        }
        DateTimeFormatter formatter;
        int n = time.getNano();
        if (n > 0) {
            formatter = DateTimeFormatter.ofPattern("HH:mm:ss.nnnnnnnnn");

        } else {
            formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        }
        return formatter.format(time).toString();
    }

    public static void main(String[] args) {
        System.out.println(FormatDate.formatToFullText(LocalDateTime.of(2021, 8, 22, 13, 25, 46)));
        System.out.println(FormatDate.formatSimple(LocalDate.of(2022, 2, 13)));
        System.out.println(FormatDate.formatIso(LocalTime.of(16, 18, 56, 8495847)));
    }

}