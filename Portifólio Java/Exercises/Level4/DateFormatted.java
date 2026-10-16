package Level4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class DateFormatted {
    static void main() {
        // Setting an object:
        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd - MM - yyyy");
        // Setting date and time variables:
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println("Date now: " + date.format(form) + "\n");
        System.out.println("Time now: " + time + "\n");

    }
}
