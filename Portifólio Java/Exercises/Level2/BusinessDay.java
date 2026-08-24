package Level2;

import java.util.Scanner;

public class BusinessDay {
    public static void main(String[] args) {

        //Instancing an object
        Scanner sc = new Scanner(System.in);

        //Setting input Variables
        System.out.print("Type a week day: ");
        var question = sc.nextLine();

        //Logic
            //Block if-else
        if (question.equalsIgnoreCase("monday") || question.equalsIgnoreCase("Tuesday") ||
            question.equalsIgnoreCase("wednesday") || question.equalsIgnoreCase("Thursday") ||
            question.equalsIgnoreCase("friday")) {
            System.out.println("This day is business day");
        } else if (question.equalsIgnoreCase("saturday") || question.equalsIgnoreCase("sunday")) {
            System.out.println("This day isn't a business day");
        } else {
            System.out.println("I don't know this day");
        }

    }
}
