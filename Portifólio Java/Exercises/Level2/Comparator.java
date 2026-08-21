package Level2;

import java.util.Scanner;

public class Comparator{
    public static void main(String[] args) {

        //Instancing an object
        Scanner sc = new Scanner(System.in);

        //Setting input variables
        System.out.print("Type the first number: ");
        var a = sc.nextInt();

        System.out.print("Type the second number: ");
        var b = sc.nextInt();

        //logic if-else
        if(a > b) {
            System.out.println("The biggest number in here: " + a);
        } else if (b > a) {
            System.out.println("The biggest number in here: " + b);
        } else {
            System.out.println("They are equal");
        }
    }
}
