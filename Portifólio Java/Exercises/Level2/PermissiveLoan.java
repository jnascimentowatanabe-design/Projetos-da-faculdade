package Level2;

import java.util.Scanner;

public class PermissiveLoan {
    public static void main(String[] args) {

        //Instancing an object
        Scanner sc = new Scanner(System.in);

        //Setting input variables
        System.out.print("Type the value of your loan: U$ ");
        var question = sc.nextDouble();

        //Logic
            //Block if-else
        if (question >= 1000 && question <= 5000) {
            System.out.println("You can access your loan! ");
        } else {
            System.out.println("This value isn't allowed ");
        }


    }
}
