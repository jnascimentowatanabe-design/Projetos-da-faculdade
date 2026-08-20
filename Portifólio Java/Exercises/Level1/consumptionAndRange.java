package Level1;

import java.util.Scanner;

public class consumptionAndRange {
    public static void main(String[] args) {

        //Instancing an object
        Scanner sc = new Scanner(System.in);

        //setting input variables
        System.out.print("Type the average consumption (km/l):  ");
        var avaregeComsumption = sc.nextDouble();
        System.out.print("Type the total fuel capacity (l): ");
        var totalCapacity = sc.nextDouble();
        System.out.print("Type the current fuel you can use (l): ");
        var currentFuel = sc.nextDouble();
        System.out.print("Type the distance (km): ");
        var distance = sc.nextDouble();

        //logic process
        var maximumRange = avaregeComsumption * totalCapacity;
        var currentRange = avaregeComsumption * currentFuel;

        System.out.println("Maximum Range: " + maximumRange + " km\nCurrent Range: " + currentRange + " km");

            //if-else
        if (currentRange < distance) {
            System.out.println("You can't complete this trip without fuel\n " +
                    ":(");
        } else {
            System.out.println("You can complete this trip! Enjoy it\n ;)");
        }

    }
}
