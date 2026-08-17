package Level1;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        //Instancing object
        Scanner sc = new Scanner(System.in);


        //Setting input variables
        System.out.print("Type a random number: ");
        var number = sc.nextInt();

        //Block if-else
        if (number % 2 == 0) {
            System.out.println("Number " + number + " is odd!");
        } else {
            System.out.println("Number " + number + " is even!");
        }
    }
}
