package SmallProjects;

import java.util.Scanner;

public class BanckCount{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "CP1252");

        //Start with ask some information (name, type of count, initial balance)
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Type of Count: ");
        String typeOfCount = scanner.nextLine();
        System.out.print("Initial Balance: ");
        double initialBalance = scanner.nextDouble();
        String menu = """
                1 - check your balance
                2 - earn money or recieve money
                3 - transfer money
                4 - quit
                """;

        
        //Show user data updated
         System.out.printf("""
                *********************************
                Your data:

                Name: %s
                Type of count: %s
                Initial Balance: R$%.2f
                *********************************
                """, name, typeOfCount, initialBalance);

        //Suggest capable offers
        System.out.println(menu);
            
        System.out.println("Choose an option: ");
        int option = scanner.nextInt();
        while (option != 4) {
            //Conditional Structre (options)
            if (option == 1) {
                System.out.println("Your balence is: R$" + initialBalance);
            } else if (option == 2) {
                System.out.println("How much do you earned or recived: ");
                double earnedMoney = scanner.nextDouble();
                initialBalance += earnedMoney;
                System.out.println("updated balence: R$" + initialBalance);
            } else if (option == 3) {
                System.out.println("How much will you pay: ");
                double payMoney = scanner.nextDouble();
                if (initialBalance > payMoney) {
                    initialBalance -= payMoney;
                    System.out.println("Updated balance: R$" + initialBalance);
                } else {
                    System.out.println("Insufficient funds.");
                }
            } else {
                System.out.println("Invalid option."); 
            }
            System.out.printf("""
                    
                    *********************************
                    Your data:

                    Name: %s
                    Type of count: %s
                    Initial Balance: R$%.2f
                    *********************************
                    """, name, typeOfCount, initialBalance);

            //Suggest capable offers
            System.out.println(menu);
            
            System.out.println("Choose an option: ");
            option = scanner.nextInt();
        }  

        System.out.println("Thank you for using our services.");
        
        scanner.close();
    
    }
}