package ScannerClass_Switch.Recap;

import java.util.Scanner;

public class UsingNext {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is today ");
        String day = input.nextLine();
        
        System.out.println("Enter your First Name");
        String firstName = input.next();

        System.out.println("Enter your Last Name");
        String lastName = input.next();

        input.nextLine();

        System.out.println("What is your address");
        String address = input.nextLine();

        System.out.println("day " + day);
        System.out.println("FirstName  " + firstName);
        System.out.println("LastName  " + lastName);
        System.out.println("address = " + address);


    }
}
