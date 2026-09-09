package Level3;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        //instancing an object
        Scanner sc = new Scanner(System.in);

        //setting input and other variables nature
        var tries = 2;

        System.out.print("Type your password: ");
        String correctPassword = sc.nextLine();

        for (int i = tries; i >= 0; i--) {
            System.out.print("Insert your password: ");
            var passwordTry = sc.nextLine();

            if (!passwordTry.equals(correctPassword)) {
                System.out.println("Wrong try again: " + i + " (attempts)");
            } else {
                System.out.println("Correct! You can use the system.");
                System.out.println("\nWelcome to the System! :)");
                break;
            }
        }
    }
}
