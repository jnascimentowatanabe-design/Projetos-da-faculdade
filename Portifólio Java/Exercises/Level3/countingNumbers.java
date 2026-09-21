package Level3;

import java.util.Scanner;

public class countingNumbers {
    static void main() {

        // Instancing an object
        Scanner sc = new Scanner(System.in);

        // Setting input and others variables nature
        int requestNumber = sc.nextInt();

        // Logic
        for (int i = 1; i <= requestNumber; i++) {
            System.out.print(i + " ");
        }

    }
}
