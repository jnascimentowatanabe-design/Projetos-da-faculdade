package Level1;

import java.util.Scanner;

public class Classification {
    public static void main(String[] args) {

        // Instancing an object
        Scanner sc = new Scanner(System.in);

        // Setting input variables
        System.out.print("Type the name of the product: ");
        var product = sc.nextLine();
        System.out.print("Type the price of the product: ");
        var price = sc.nextDouble();

        //block if-else
        if (price <= 50) {
            System.out.println("Economic product: " + product);
        } else if (price >= 50.01 && price <= 200 ) {
            System.out.println("Intermediate product: " + product);
        } else {
            System.out.println("Premium product: " + product);
        }


    }
}
