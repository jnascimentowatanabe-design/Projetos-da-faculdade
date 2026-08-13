package Level1;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        //instancing object
        Scanner sc = new Scanner(System.in);

        //setting variable
        double grade = 0.0;
        double sum = 0.0;

        //logic process
        for(int counter = 0; counter <= 2; counter ++ ) {
            System.out.println("Type the student grade: ");
            grade = sc.nextDouble();
            sum += grade;
        }

        double average = sum / 3;
        System.out.println("avarege grade: " + average);

    }
}
