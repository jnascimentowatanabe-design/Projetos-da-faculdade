package Level1;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        //Instancing object
        Scanner sc = new Scanner(System.in);
        var number = "";

        while(!number.equalsIgnoreCase("Exit")) {
            //Setting input variables
            System.out.print("Type a random number: ");
            number = sc.nextLine();
            if(number.equals("Exit")) {
                break;
            }
            var castingNumber = Integer.parseInt(number);
            //Block if-else
            if (castingNumber % 2 == 0) {
                System.out.println("Number " + castingNumber + " is odd!");
            } else {
                System.out.println("Number " + castingNumber + " is even!");
            }
        }
    }
}
