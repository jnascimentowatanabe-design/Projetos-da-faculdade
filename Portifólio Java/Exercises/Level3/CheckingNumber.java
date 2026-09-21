package Level3;

import java.util.Scanner;
import java.util.ArrayList;

public class CheckingNumber {
    public static void main(String[] args) {

        //Instancing an object
        Scanner sc = new Scanner(System.in);

        //Setting input and others variables nature
        int positiveCounter = 0;
        int negativeCounter = 0;

        //Logic
        while (true) {
            System.out.print("Type a number (type end to finish the program): ");
            String ask = sc.nextLine();

            if (ask.equalsIgnoreCase("end")) {
                break;
            }
            int number = Integer.parseInt(ask);


            if (number > 0) {
                positiveCounter ++;
            } else {
                negativeCounter ++;
            }
        }


        System.out.printf("amount of positive numbers: %d\namount of negative numbers: %d",
                positiveCounter, negativeCounter);
    }
}
