package Level1;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        // instancing the object
        Scanner sc = new Scanner(System.in);

        // setting the attributes
        System.out.println("type the tempurature in Celcius");
        var celcius = sc.nextInt();

        // Fahrenheit converter
        double fahrenheit =  ((double) celcius * 9/5) + 32;

        // Print the output
        System.out.println("The temperature in Fahrenheit is " + fahrenheit);


    }
}
