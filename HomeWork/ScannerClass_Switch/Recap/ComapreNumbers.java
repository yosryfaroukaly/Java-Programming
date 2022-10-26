package ScannerClass_Switch.Recap;

import java.util.Scanner;

public class ComapreNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number 1 ");
        int number1 = input.nextInt();
        System.out.println("Enter your number 2 ");
        int number2 = input.nextInt();
        System.out.println(number2>=number1);
    }
}
