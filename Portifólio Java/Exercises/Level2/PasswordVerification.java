package Level2;

import java.util.Scanner;

public class PasswordVerification {
    public static void main(String[] args) {

        //Instancing an object
        Scanner sc = new Scanner(System.in);

        //Setting input objects
        System.out.print("Type the password: ");
        var password = sc.nextLine();
        var passwordTry = "";

        while (!passwordTry.equals(password)) {
            System.out.println("Try the password: ");
            passwordTry = sc.nextLine();

            if (passwordTry.equals(password)) {
                System.out.println("Correct Password! :)");
                break;
            }else {
                System.out.println("Wrong password. Try again");
                continue;
            }
        }
    }
}
