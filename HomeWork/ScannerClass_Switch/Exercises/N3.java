package ScannerClass_Switch.Exercises;

import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           /*
           Ask the user to enter their age (byte),
ask them to enter their favorite number (long),
and ask them to enter their favorite book
Print all the values from the inputs
            */
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Enter your fav number ");
        long favNumber = input.nextLong();
        System.out.println("Enter your fav book");
        String favBook= input.next();

        System.out.println("My age "+ age + "\n My Fav Number "+ favNumber + "\n My Fav Book " + favBook );
    }
}
