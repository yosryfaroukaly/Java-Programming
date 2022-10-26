package ScannerClass_Switch.Exercises;

import java.util.Scanner;

public class N6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Ask the user to enter an int number. Determine if the number is even or
odd
Print a boolean for both even and odd
         */

        System.out.println("write number");
        int num = input.nextInt();

        boolean isEven = num % 2 == 0;
        boolean isOdd = num % 2 != 0;


        System.out.println(num + " is even: " + isEven);
        System.out.println(num + " is odd: " + isOdd);
    }
}
