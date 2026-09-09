package Level3;

import java.util.Scanner;


public class ValidName {
    public static void main(String[] args) {

        //Instancing an object
        Scanner sc = new Scanner(System.in);

        // Setting input and others variables nature
        System.out.print("Type your name: ");
        String[] name = sc.nextLine().split("");
        var statusName = true;

        if (name.length < 3) {
            statusName = false;
        }

        for (String letter : name) {
            if (letter.matches("\\d")) {
                statusName = false;
                break;
            }
        }

        if (!statusName) {
            System.out.println("There is something wrong (The name is too small or there is a number)");
        } else {
            System.out.println("This name is okay! Welcome " + String.join("", name));
        }
    }
}
