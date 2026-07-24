package SmallProjects.ShoppingAplication;

public class ShoppingProduct implements Comparable<ShoppingProduct> {
    
    private String productDescription;
    private double productValue;

    //Constructor

    public ShoppingProduct(String productDescription, double productValue) {
        this.productDescription = productDescription;
        this.productValue = productValue;
    }

    //getters

    public String getProductDescription() {
        return productDescription;
    }

    public double getProductValue() {
        return productValue;
    }

    @Override
    public String toString() {
        return "Product Description: " + productDescription + "(Product Value: " + productValue + ")" + ", \n";
    }

    @Override 
    public int compareTo (ShoppingProduct otherShopping) {
        return Double.valueOf(this.productValue).compareTo(otherShopping.productValue);
    }
}
