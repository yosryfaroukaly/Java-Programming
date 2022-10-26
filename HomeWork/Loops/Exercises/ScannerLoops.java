package Loops.Exercises;

import java.util.Scanner;

public class ScannerLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char num = 1;
        char total=0 ;

        while (num<=5){
            System.out.println("enter your number ");
            num++;
            total+= input.nextInt();


        }
        System.out.println(total);
    }
}
