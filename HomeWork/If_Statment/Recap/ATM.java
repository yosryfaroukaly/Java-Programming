package If_Statment.Recap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ATM \nChoose a language");
        System.out.println("1-English \n2-Arabic \n3-Spanish");
        int select = input.nextInt();
        if (select == 1) {
            System.out.println("English");
            if (select == 2) {
                System.out.println("Arabic");
                if (select == 3) {
                    System.out.println("Spanish");
                    if (select < 3) {
                        System.out.println("Again");
                    }
                }
            }
            int pinCode = 1234;

            System.out.println("enter your pinCode");
            int chooseList = input.nextInt();

            if (chooseList == pinCode) {

                System.out.println("choose of list 1-Withdraw 2-Cheeking 3-Saving 4-CreditCard");

            } if (chooseList == 1) {
                System.out.println("Withdraw ");
            } if (chooseList == 2) {
                System.out.println("Cheeking");
            }    if (chooseList == 3) {
                System.out.println("Saving");
            }   if (chooseList == 4){
                System.out.println("CreditCard");
            }
            double cheeking = 1000000;
            double amount = input.nextDouble();
            double withdraw= cheeking - amount;
            withdraw-=amount;
            System.out.println("Enter How much you need From your cheeking account");
            double negativeNumber = input.nextDouble();
            if (amount <= cheeking) {
                System.out.println("Accept Transaction \n"+"you have in your account " + cheeking + "\nTotal amount Now " + withdraw);

            }
            if (amount > cheeking) {
                System.out.println("You Don't have Enough Amount ");

            } else {

            }
            System.out.println("Thank you To Choose This Bank");
        }
    }
}

