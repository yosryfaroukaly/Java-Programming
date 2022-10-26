package If_Statment.Recap;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Account Balance");
//        double accountBalance = input.nextDouble();
//        System.out.println("How much you want to withdraw");
//        double haveInAccount = input.nextDouble();
//        if (accountBalance<=haveInAccount){
//            System.out.println("Accept");
//        }else {
//            System.out.println("No have balance enough");
//        }
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome Bank Of America\ncan you insert your card");
//        String welcome = input.nextLine();
//        System.out.println("Withrow or check or saving");
//        String choose = input.next();
//        System.out.println("can you add amount you needed");
//        double withdraw = input.nextDouble();

//      double account = 1000;
//      //double withdraw = 110;
//      account-=withdraw ;
//        System.out.println(account);
//        if (withdraw==1000){
//            System.out.println("Pass\nThank you");
//        }else if (withdraw<=1000) {
//           System.out.println("Pass");
//        } else {
//            System.out.println("Empty");
//        }
        double account = 1000;
        double withdraw = 1400;
        System.out.println(account);
        account -= withdraw;
        if (account > 1000) {
            System.out.println("No have balance");

        }
        System.out.println("balance $"+account);
    }
    }
