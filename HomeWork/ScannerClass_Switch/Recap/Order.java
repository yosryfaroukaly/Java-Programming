package ScannerClass_Switch.Recap;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the product name ");
        String productName = input.nextLine();
        System.out.println("Enter the price of the " + productName);
        double price= input.nextDouble();
        System.out.println("How many "+ productName + "'s do you want to buy ");
        int quantity = input.nextInt();
        input.nextLine();
        System.out.println("What is the full name for the order ");
        String fullName = input.nextLine();

        double totalCost = price*quantity;

        String order = fullName + ", your order for " + quantity + "" + productName + " 's has been placed. your total is "+ totalCost;
        System.out.println(order);


    }
}
