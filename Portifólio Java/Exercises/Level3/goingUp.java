package Level3;

import java.util.Scanner;

public class goingUp {
    public static void main(String[] args){

        //Instancing an object
        Scanner sc = new Scanner(System.in);

        //Setting input and another variables nature
        var top = sc.nextInt();

        //logic
            //for loop
        for (int i = 0; i <= top; i++) {
            System.out.println("climbing the step: " + i);

            if (i == top) {
                System.out.println("You're in the of the stair");
            }
        }
    }
}
