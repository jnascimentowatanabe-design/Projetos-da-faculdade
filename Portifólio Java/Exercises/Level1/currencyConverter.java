package Level1;

import java.util.Scanner;

public class currencyConverter {
    public static void main(String[] args) {

        //Instancing an object
        Scanner sc = new Scanner(System.in);

        //Setting input variables
        System.out.print("Type your currency money: R$ ");
        double yourCurrency = sc.nextDouble();

        //Logic
        double uSCurrency = yourCurrency / 5.25;

        //printing the result
        System.out.printf("R$ %.2f --> U$ %.2f", yourCurrency, uSCurrency);

    }
}
