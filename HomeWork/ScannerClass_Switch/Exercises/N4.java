package ScannerClass_Switch.Exercises;

import java.util.Scanner;

public class N4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
           Ask the user to enter a number. Check if that number is evenly divisible
by 2, 3, and 5. Print the boolean values
Ex:
Enter a number
65
65 is divisible by 2: false
65 is divisible by 3: false
65 is divisible by 5: true
         */

        System.out.println("Enter your number");
        int num = input.nextInt();
        int no1 = num /2 ;
        int no2 = num /3;
        int no5= num /5;
        boolean num1 = no1>65;
        boolean num2 = no1>=65;
        boolean num3 = no1<65;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);


    }
}
