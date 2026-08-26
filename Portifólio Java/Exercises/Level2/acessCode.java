package Level2;

import java.util.Scanner;

public class acessCode {
    public static void main(String[] args) {

        //Instancing an object
        Scanner sc = new Scanner(System.in);

        //Setting input variables
        System.out.print("Type the access number: ");
        var tryAcess = sc.nextInt();
        System.out.print("Type the your level: ");
        var level = sc.nextInt();

        //setting variables
        var status = true;

        //Logic
            //block if-else

        if (tryAcess != 2023) {
            status = false;
        }

        if (level != 1 && level != 2 && level != 3 ) {
            status = false;
        }

        if (status) {
            System.out.println("access granted " );
        } else {
            System.out.println("access denied ");
        }
    }
}
