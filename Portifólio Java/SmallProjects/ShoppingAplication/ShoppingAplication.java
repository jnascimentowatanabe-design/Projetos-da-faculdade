package SmallProjects.ShoppingAplication;



public class ShoppingAplication {

    //Setting Attributes

    private int cardLimit;
    private String productDescription;
    private double productValeu;
    private double resultLimit;
    private double balance;

    //Constructor
    public ShoppingAplication(int cardLimit,double balance) {
        this.cardLimit = cardLimit;
        this.balance = balance;
    }
    
    //Getters and Setters

        //Getters

    public int getCardLimit() {
        return cardLimit;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public double getProductValeu() {
        return productValeu;
    }

        //Setters

    public void setCardLimit(int cardLimit) {
       this.cardLimit = cardLimit;
    } 

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setProductValeu(double productValeu) {
        this.productValeu = productValeu;
    }

    // Calculating Method 

    public double calculatingLimit(int cardLimit, double productValue) {
        if (productValue > cardLimit) {
            System.out.println("You don't have enough limit to buy this product");
            return 0;
        } else {
            System.out.println("Purchased Succesfully!");
            double result = cardLimit - productValue;
            this.resultLimit = result;
            return this.resultLimit;
        }
    }

    public void informationLimit(int cardLimit, String ProductDescription, double ProductValeu) {
        
        System.out.printf("""
            |*************Result of the shopping*************|
            |                                                |
            | Card Limit: %d                                 |
            | Product Description: %s                        |
            | Product Value: %.2f                            |
            | Result Limit: %.2f                             |
            |________________________________________________|
        """, cardLimit, ProductDescription, ProductValeu, resultLimit);
        
    }
}
