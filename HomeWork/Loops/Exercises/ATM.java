package Loops.Exercises;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcom ATM ");
        int validPass= 0000;
        int userPin ;
        int attempt = 0 ;

        do {
            System.out.println("Enter your PIN ");
            userPin = input.nextInt();
            attempt++ ;
        }while (attempt<3 && userPin!=validPass);
        
        if (userPin==validPass){
            System.out.println("LOOGED IN");

        }  else {
            System.out.println("stop");
        }
    }
}
