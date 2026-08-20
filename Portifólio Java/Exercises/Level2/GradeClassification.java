package Level2;

import java.util.Scanner;

public class GradeClassification {
    public static void main(String[] args) {
        //instancing object
        Scanner sc = new Scanner(System.in);

        //setting variable
        double grade = 0.0;
        double sum = 0.0;

        //logic process

            //For block
        for(int counter = 0; counter <= 2; counter ++ ) {
            System.out.println("Type the student grade: ");
            grade = sc.nextDouble();
            sum += grade;
        }

            //average count
        double average = sum / 3;

            //if-else
        if (average >= 7.0) {
            System.out.println("final grade: " + average );
            System.out.println("You are approved! Congratulation\n:)");
        } else if (average <= 6.9 && average > 5.0) {
            System.out.println("final grade: " + average );
            System.out.println("You are in recovery, but you have a chance doing your best");
        } else {
            System.out.println("final grade: " + average );
            System.out.println("You failed\n :(");
        }

    }
}
