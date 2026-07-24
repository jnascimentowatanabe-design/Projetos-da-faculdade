package SmallProjects.ShoppingAplication;
import java.util.Scanner;



public class MainShoppingAplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the card limit: ");
        int cardLimit = scanner.nextInt();
        ShoppingAplication shoppingAplication = new ShoppingAplication(cardLimit);

        while (true) {
            System.out.print("Enter product description (or 'exit' to finish): ");
            String description = scanner.next();
            if (description.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Enter product value: ");
            double value = scanner.nextDouble();
            ShoppingProduct product = new ShoppingProduct(description, value);
            if (shoppingAplication.buyProduct(product)) {
                System.out.println("Product purchased successfully!");
            } else {
                System.out.println("Insufficient balance to purchase this product.");
            }
        }

        System.out.println("""
                Purchased Products:
                """ + shoppingAplication.getShoppingList());

        System.out.printf("Shopping completed. Remaining balance: %.2f", shoppingAplication.getBalance());
        scanner.close();
    }
}
