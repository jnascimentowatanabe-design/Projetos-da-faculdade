package Level2;

import java.util.Scanner;

public class BloodDonorScreening {
    public static void main(String[] args) {

        //Instancing an object
        Scanner sc = new Scanner(System.in);

        //Setting input variables
        System.out.println("how much you weight: ");
        var weight = sc.nextDouble();
        System.out.println("how older are you: ");
        var age = sc.nextInt();


        //setting variables
        boolean  status = true;

        //Logic
            //block if-else
        if (!(age >= 18)) {
            status = false;
            System.out.println("You can't donate blood because of your age");
        }

        if (weight < 50) {
            status = false;
            System.out.println("You can't donate blood because of your weight");
        }

        if (status) {
            System.out.println("you can donate blood");
        }

    }
}
