package ScannerClass_Switch.Exercises;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         Ask the user to enter a year. Determine if the year is a leap year or not.
You can assume a leap year is a year that is divisible by 4. Print true or
false.
Hint: use remainder operator
         */
        System.out.println("Enter your year ");
        int year = input.nextInt();
        boolean leapYear = year % 4 == 0;
        boolean leapYear1 = year % 4 != 0;

        System.out.println(leapYear);
        System.out.println(leapYear1);


    }

}
