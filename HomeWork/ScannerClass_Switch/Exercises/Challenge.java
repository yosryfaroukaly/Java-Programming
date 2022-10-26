package ScannerClass_Switch.Exercises;

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
- Place an order
- Ask the user the enter the product name (String, multiple words)
- Ask the user to enter the price (double)
- Ask the user to enter the quantity(int)

- Ask the user to enter their full name (String, multiple word)
- Print in the following format:
"$firstName, your order for $quantity $productName has been
placed. Your total is $totalCost(price * quantity)."
Ex:
Input: "Apples" , 1.5, 5. "Luke"
Output: Luke, your order for 5 Apples has been places. Your total
is 7.5.
         */

        System.out.println("Enter product name");
        String productName = input.nextLine();
        System.out.println("Enter price");
        double price = input.nextDouble();
        System.out.println("Enter Quantity");
        int quantity = input.nextInt();
        System.out.println("Enter Full Name");
        String fullName= input.nextLine();
        input.nextLine();
        



    }
}
