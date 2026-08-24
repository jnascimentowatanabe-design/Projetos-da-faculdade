package Level2;

import java.util.Scanner;

public class DiscountVerification {
    public static void main(String[] args) {

        //Instancing an object
        Scanner sc = new Scanner(System.in);

        //Setting input variables
        System.out.print("Type the price: U$ ");
        var price = sc.nextDouble();

        //Logic
            //Block if-else

        if (price >= 100) {
            var discount = price * 0.10;
            price -= discount;

            System.out.println("You received a discount of 10%\nNew price: U$ " + price);
        } else {
            System.out.println("You didn't receive a discount\nprice: U$" + price);
        }

        System.out.println("\nThank you for buying");
    }
}
