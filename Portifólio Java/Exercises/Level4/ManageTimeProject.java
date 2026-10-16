/*
In this challenge you are a manager, and you want to know the duration of time of one activity of the
enterprise. For this you need to grab the input of the time start and the end. After this you show
the duration of the activity.
 */

package Level4;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

import java.util.Scanner;


public class ManageTimeProject {
    static void main() {
        //Setting an object:
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter standard = DateTimeFormatter.ofPattern("hh:mm");

        //Setting input and another's variables nature:
        System.out.print("Insert the start time: ");
        LocalTime stratTimeInput = LocalTime.parse(sc.nextLine());
        System.out.print("Insert the finish time: ");
        LocalTime endTimeInput = LocalTime.parse(sc.nextLine());
            //Translating for LocalTime
        stratTimeInput.format(standard);
        endTimeInput.format(standard);

        //Using Duration for calculate
        Duration duration = Duration.between(stratTimeInput, endTimeInput);

        //print the answer:
        System.out.println("The Duration is: " + duration.toHours() +
                " hours " + duration.toMinutesPart() + " minutes");
    }
}
