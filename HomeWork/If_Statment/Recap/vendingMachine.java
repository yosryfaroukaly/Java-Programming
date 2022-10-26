package If_Statment.Recap;

import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\"Welcome to the vending machine.\"\nPlease select one of the following:\n\tDrinks\n\tSnacks\n\tGum");
        String choose = input.nextLine();
        String item = "";
        int price = 0;

        switch (choose) {
            case "Drinks":
                System.out.println("You chose drinks: press a number:\n\t1)Water\n\t2)Soda\n\t3)Juice");
                int drinks = input.nextInt();
                if (drinks == 1) {
                    item = "Water";
                } else if (drinks == 2) {
                    item = "Soda";
                } else if (drinks == 3) {
                    item = "Juice";
                }
                break;
            case "Snacks":
                System.out.println("You chose snacks: press a number:\n\t4)Chips\n\t5)Cookies");
                int Snacks = input.nextInt();
                if (Snacks==4){
                    item = "Chips";
                    System.out.println("1)cheese,2)spicy");
                    int chips = input.nextInt();
                    if (chips==1){
                        item= "cheese";
                    } else if (chips==2) {
                        item="spicy" ;
                    }

                } else if (Snacks==5) {
                    item="Cookies";
                }

                break;
            case "Gum":
                item="Generic gum";
        }
        System.out.println(item);
    }
}
