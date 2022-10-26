package Loops.Recap;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        /*
        write a program that asks user to enter 5 numbers and returns the biggest and smallest numbers from those 5
        repeated steps:

            ask for a number

            check is it the biggest

            check is it the smallest
     */

        Scanner input = new Scanner(System.in);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);

        int n = 0;
        int max = -2147483648;
        int min = 2147483647;

        while (n < 5) {
            n++;

            System.out.println("Enter a number ");
            int numb = input.nextInt();
            if (numb > max) {
                max = numb;
            }
            if (numb < min) {
                max = numb;
            }
        }
        System.out.println("Max " + max);
        System.out.println("Min " + min);


    }
}
