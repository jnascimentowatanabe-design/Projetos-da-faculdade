package SmallProjects.ShoppingAplication;
import java.util.Scanner;
import java.util.ArrayList;


public class MainShoppingAplication {
    public static void main(String[] args) {
        
        //Creating Scanner
        Scanner scanner = new Scanner(System.in, "CP1252");

        //Creating ArrayList
        ArrayList<ShoppingAplication> shoppingList = new ArrayList<>();

        //Creating Object
        ShoppingAplication shopping = new ShoppingAplication();

        //Asking for user input
        System.out.println("Insert your card limit: ");
        int cardLimit = scanner.nextInt();
        shopping.setCardLimit(cardLimit);

        System.out.println("----Do you want to buy a product?----/n(1 - Yes / 0 - No)");
        int option = scanner.nextInt();

        do {
            if (option == 1) {

                System.out.println("Insert the product description: ");
                scanner.nextLine(); // Consume the newline character
            String productDescription = scanner.nextLine();
                shopping.setProductDescription(productDescription);

                System.out.println("Insert the product value: ");
                double productValue = scanner.nextDouble();
                shopping.setProductValeu(productValue);

                //Calculating limit
                shopping.calculatingLimit(cardLimit, productValue);
                shoppingList.add(shopping);
            }

            System.out.println("----Do you want to buy a product?----/n(1 - Yes / 0 - No)");
            option = scanner.nextInt();
        } while (option != 0);

        System.out.println("----Shopping List----");
        for (ShoppingAplication item : shoppingList) {
            item.informationLimit(item.getCardLimit(), item.getProductDescription(), item.getProductValeu());
        }

        System.out.println("Thank you for using our application!");
        scanner.close();
    }
}
