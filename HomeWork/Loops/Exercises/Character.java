package Loops.Exercises;

import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String list = "Shopping list :";
        String addMore;

        do {
            System.out.println("Enter the name of the item ");
            list += "\n> "+input.nextLine();
            System.out.println("Do you want to add more to your shopping list ? ");
            addMore = input.nextLine();

        }   while (addMore.toUpperCase().equalsIgnoreCase("yes")||addMore.toUpperCase().equalsIgnoreCase("y"));

        System.out.println(list.toUpperCase());

        }
    }
