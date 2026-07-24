package SmallProjects.ShoppingAplication;


import java.util.List;
import java.util.ArrayList;

public class ShoppingAplication {

    //Setting Attributes

    private int cardLimit;
    private double balance;
    private List<ShoppingProduct> shoppingList;

    //Constructor
    public ShoppingAplication(int cardLimit) {
        this.cardLimit = cardLimit;
        this.balance = cardLimit;
        this.shoppingList = new ArrayList<>();
    }

    //Getters and Setters

    public int getCardLimit() {
        return cardLimit;
    }

    public double getBalance() {
        return balance;
    }

    //Method to verify if the product can be purchased based on the card limit and balance

    public boolean buyProduct(ShoppingProduct product) {
        if (this.balance >= product.getProductValue()) {
            this.balance -= product.getProductValue();
            this.shoppingList.add(product);
            return true;
        } 
        return false;
    }
}
