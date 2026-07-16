package SmallProjects;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        //Title
        System.out.println("Welcome to guessing number! \n");
        System.out.println("You have 5 chances, let's get start! \n");
        //define variables
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        int winningNumber = new Random().nextInt(100);
        int digitCounter = 0;

        while(counter < 5) {

            System.out.print("Guess a number from 0 to 100: "); //This say to user the purpose of the game
            int userGuess = scanner.nextInt();
            counter ++;

            //the logical structure of guess wright or wrong
            if (winningNumber == userGuess) {
                System.out.printf("Congratulations! the winning number is %d", winningNumber);
                break;
            } else {
                if (winningNumber > userGuess) {
                    System.out.println("It's higher than you guess! try again");
                    

                } else {
                    System.out.println("It's lower than you guess! try again");
                    

                }
            }
        }

        if (counter == 5 && digitCounter != winningNumber) {
            System.out.println("Sorry your chances were gone!");
        }

        scanner.close();
    }
}
