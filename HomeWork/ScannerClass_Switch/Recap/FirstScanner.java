package ScannerClass_Switch.Recap;

import java.util.Scanner;

public class FirstScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();
        System.out.println("Enter your First name");
        String firstName= input.next();
        System.out.println("Enter your Last name");
        String lastName= input.next();

        System.out.println(firstName + " " + lastName);
        
    }
}
