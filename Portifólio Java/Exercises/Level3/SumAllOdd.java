package Level3;

import java.util.Scanner;

public class SumAllOdd {
    public static void main(String[] args){

        //Instancing an object;
        Scanner scanner = new Scanner(System.in);

        //Setting input and another variables nature
        System.out.print("type a number: ");
        var last = scanner.nextInt();
        var sum = 0;

        for (int i = 0; i <= last; i++) {
            if (i % 2 == 0) {
                sum += i;
            } else {
                continue;
            }
        }

        System.out.printf("the sum of odds for 1 to %d is %d", last, sum);

    }
}
