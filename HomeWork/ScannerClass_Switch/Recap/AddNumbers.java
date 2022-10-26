package ScannerClass_Switch.Recap;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you 3 numbers. hit enter after eash");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        System.out.println("The Sum numbers = " + (number1 + number2 + number3));
    }
}
