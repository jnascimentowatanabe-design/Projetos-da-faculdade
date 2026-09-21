package Level3;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ListOfInvitations {
    static void main() {

        // Instancing an object
        Scanner sc = new Scanner(System.in);
        ArrayList<String> invitations = new ArrayList<>();

        // Setting input and others variables nature

        while (true) {
            System.out.println("Select one option typing it\n(type a name for add a new pearson)\n('view' for view invitations list)");
            String select = sc.nextLine();

            if (select.equalsIgnoreCase("exit")) {
                break;
            }

            if (!select.equalsIgnoreCase("view")) {
                invitations.add(select);
            } else if (select.equalsIgnoreCase("view")) {
                System.out.println(invitations);
            }

        }

        System.out.println("The program comes to the end!");





    }
}
