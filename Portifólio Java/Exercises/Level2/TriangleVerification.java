package Level2;

import java.util.Scanner;

public class TriangleVerification {
    public static void main(String[] args) {

        //Instancing an object
        Scanner sc = new Scanner(System.in);

        //setting input variables
        System.out.print("Type the first side: ");
        var firstSide = sc.nextInt();
        System.out.print("Type the second side: ");
        var secondSide = sc.nextInt();
        System.out.print("Type the third side: ");
        var thirdSide = sc.nextInt();

        //logic
            // block if-else
        if (firstSide + secondSide > thirdSide || secondSide + thirdSide > firstSide || thirdSide + firstSide > secondSide) {
            System.out.println("This is a triangle ");
        } else {
            System.out.println("This isn't a triangle ");
        }
    }
}
