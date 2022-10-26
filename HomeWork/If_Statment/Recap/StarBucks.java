package If_Statment.Recap;

import java.util.Scanner;

public class StarBucks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter which size drink they want");
        String cub = input.nextLine();
        String size ="";
        double price= 0;
        int calories=0;
        boolean ifAvailbale = true;

        switch (cub){
            case "tall": case "small":
                size = "tall";
                price = 2.50;
                calories= 100;
                break;
            case "grande" :
                size= "grande";
                price = 4.00;
                calories=150;
                break;
            case "venti" :
                size="venti";
                price= 4.50;
                calories=200;
                break;
            default:
                System.out.println("We don't have that size");
        }
        if (ifAvailbale){
            System.out.println("Your order for a " + size + " coffee is $" + price + " and has " + calories + " calories");
        }
        /*
        Declare price and calories variables

    Ask the user to enter which size drink they want

    Based on the drink size determine the price and calories of the order

    At the end print the details of the order

        data:

            size: tall
            price: 2.50
            calories: 100

            size: grande
            price: 4.00
            calories: 150

            size: venti
            price: 4.50
            calories: 200
         */

    }
}
