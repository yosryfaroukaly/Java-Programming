package String_Classes.Recap;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter user name ");
        String name = input.nextLine();
        name = name.toLowerCase();
        System.out.println("Enter your password ");
        String password = input.nextLine();
        password = password.toUpperCase();
        String validPassword = "yoooo" + (int) 0000;
        String out;
        if (password.length() >= 9 && password.equals(validPassword.toUpperCase())) {
            out = "process";
        } else {
            out = "Not Matches";
        }
        System.out.println(out);

    }
}
