import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Task10 {
    public static String timeConversion(String s) {
        // Define a formatter for 12-hour format with seconds

        String time = LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa", Locale.US))
                .format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        return time;
    }

    public static void main(String[] args) {
        String s = "07:05:45PM";
        System.out.println(timeConversion(s)); // Output: 19:05:45
    }
}
