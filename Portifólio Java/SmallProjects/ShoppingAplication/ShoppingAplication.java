package SmallProjects.ShoppingAplication;


import java.util.List;
import java.util.ArrayList;

public class ShoppingAplication {

    //Setting Attributes

    private int cardLimit;
    private double balance;
    private List<ShoppingAplication> shoppingList;

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
}
