package Level3;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        // Instancing an object
        Scanner scanner = new Scanner(System.in);

        // Setting input and another variables nature
        System.out.print("Type a number: ");
        var number = scanner.nextInt();
        var total = 1;

        for (int i = number; i > 0 ; i--) {
            total *= i;
        }

        System.out.printf("Factorial result: %d", total);

    }
}
