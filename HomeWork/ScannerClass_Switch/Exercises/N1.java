package ScannerClass_Switch.Exercises;

import java.util.Scanner;

public class N1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Write a program that asks the user to enter a price and quantity and then
        calculate the revenue. revenue = price Ã— quantity.
         */

        System.out.println("enter a price");
        int enterPrice = input.nextInt();

        System.out.println("enter a Quantity");
        int enterQuantity = input.nextInt();
        double revenue = enterPrice*enterQuantity ;

        String concatination ="ToTal\nPrice of this iteam "+ enterPrice + "$ opposite this quantity = "+ revenue ;
        System.out.println(concatination);

    }
}
