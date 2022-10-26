package ScannerClass_Switch.Recap;

import java.util.Scanner;

public class Revanue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much this ?");
        double price = input.nextDouble();
        System.out.println("how many iteam you have ?");
        int quantity = input.nextInt();


        System.out.println("The total Revenue = " + (price*quantity) + "$");
        
    }
}
