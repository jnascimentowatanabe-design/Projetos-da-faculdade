package Level3;

import java.util.Scanner;
import java.util.ArrayList;

public class SumAll {
    public static void main(String[] args){

        //Instancing an object
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listOfValues = new ArrayList<>();

        //Setting the input another variables nature
        var status = true;
        var sum = 0;

        while(status){
            System.out.print("Do you wanna put a value in your sum list?\nAnswer --> ");
            var ask = sc.nextBoolean();

            if (!ask) {
                break;
            }

            System.out.print("Put a value of your sum list: ");
            var value = sc.nextInt();

            listOfValues.add(value);

            sum = 0;
            for(int number : listOfValues) {
                sum += number;
            }
        }

        System.out.println("List: " + listOfValues + "\nSum: " + sum);

    }
}
