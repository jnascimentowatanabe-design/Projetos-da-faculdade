package Level4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class DateFormatted {
    static void main() {
        // Setting an object:
        DateTimeFormatter formDate = DateTimeFormatter.ofPattern("dd - MM - yyyy");
        DateTimeFormatter formTime = DateTimeFormatter.ofPattern("hh:mm");

        // Setting date and time variables:
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println("Date now: " + date.format(formDate) + "\n");
        System.out.println("Time now: " + time.format(formTime) + "\n");

    }
}
