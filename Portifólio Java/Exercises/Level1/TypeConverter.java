package Level1;

import java.util.Scanner;

public class TypeConverter {
    public static void main(String[] args) {
        //instancing object
        Scanner sc = new Scanner(System.in);

        //setting variables
        System.out.println("set a value for the unit (double type): ");
        double unitSystem = sc.nextDouble();

        //casting the type
        System.out.println("the integer value of the product is " + (int) unitSystem);
    }
}
