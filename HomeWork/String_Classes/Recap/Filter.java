package String_Classes.Recap;

import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a massage ");
        String message = input.nextLine();
        message = message.trim();
        message=message.toLowerCase();


        if (message.contains("java is bad") || message.contains("quit") || message.contains( "have fun") || message.contains( "crying")) {
            System.out.println("message failed to send ");

        } else {
            System.out.println(message + " message sent");

        }

    }
}
