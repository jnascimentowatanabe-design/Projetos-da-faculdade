package Level3;

import java.util.Scanner;


public class TheBiggestNumber {
    public static void main(String[] args) {

        // Instancing an object
        Scanner scanner = new Scanner(System.in);

        // Setting input and another variables nature
        System.out.print("Type some numbers using a space to split them: ");
        String[] numbersStr = scanner.nextLine().split(" ");
        int biggest = Integer.MIN_VALUE;

        // Logic
        for (String number : numbersStr) {
            int num = Integer.parseInt(number);

            if (num > biggest) {
                biggest = num;
            }
        }
        System.out.printf("The biggest number is: %d", biggest );
        scanner.close();

    }
}
