package String_Classes.Recap;

import java.util.Scanner;

public class Title {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name , with title");
        String name = input.nextLine().toLowerCase();
        String message = "";


        if (name.startsWith("mr ") || name.startsWith("mister ")) {
            message = "Hello Sir";
        } else if (name.startsWith("ms ") || name.startsWith("madam ")) {
            message = "Hello Ma'am";
        } else if (name.startsWith("dr ")) {
            message = "Hello Doctor";
        }
        System.out.println(message);

        if (name.endsWith(" sr")) {
            message = "Nice to meet you Senior ";
        } else if (name.endsWith(" jr")) {
            message = "Nice to meet you Junior ";
        }
        System.out.println(message);
    }
}
