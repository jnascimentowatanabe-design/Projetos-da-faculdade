package Level4;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTimeNow {
    public static void main(String[] args) {
        //Setting the objects
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        //Executing the code
        System.out.println("Date now: " + date);
        System.out.println("Time now: " + time);
    }
}
