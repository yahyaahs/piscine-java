import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        // your code he
        LocalDateTime date = LocalDateTime.parse(stringDate);
        return date;

    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        // your code here
        DateTimeFormatter form = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.FRENCH);
        return LocalDate.parse(stringDate, form);
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        // your code here
        if (stringDate == null){
            return null;
        }
        int hours = Integer.parseInt(stringDate.substring(0, 2));
        int min = Integer.parseInt(stringDate.substring(19, 21));
        int sec = Integer.parseInt(stringDate.substring(33, 35));
        if(stringDate.contains("du soir") && hours < 12 ){
            hours+=12;
        }
        return LocalTime.of(hours, min, sec);
    }
        public static void main(String[] args) {
        System.out.println(ParseDate.parseIsoFormat("2022-04-25T20:51:28.709039322"));
        System.out.println(ParseDate.parseFullTextFormat("lundi 25 avril 2022"));
        System.out.println(ParseDate.parseTimeFormat("09 heures du soir, 07 minutes et 23 secondes"));
    }

}