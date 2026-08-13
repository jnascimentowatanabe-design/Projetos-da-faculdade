package Level1;

//import the scanner
import java.util.Scanner;

public class StudentStatus {
    public static void main(String[] args) {
        // instancing the object (scanner)

        Scanner sc = new Scanner(System.in);
        // setting values for our student

        String name = sc.nextLine();
        int yearsOld = sc.nextInt();
        double high = sc.nextDouble();
        boolean studentStatus = sc.nextBoolean();
        // print our output

        System.out.printf("""
                Name: %s
                Years old: %d
                high: %.2f
                Student: %bool""", name, yearsOld, high, studentStatus);
    }
}
