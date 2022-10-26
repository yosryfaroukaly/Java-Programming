package String_Classes.Exercise;

import java.util.Scanner;

public class UserAndPass {
    public static void main(String[] args) {
         /*
         create a class UserAndPass
ask the user to enter a username and password. Check if they are valid

based on the following requirements:
- The password cannot be less than 5 characters
If it is less print: "Password cannot be less than 5 characters"
If it is more than or equal to 5 print: "Valid password"



- Also, the password should not contain the username
If the password has the username in it print: "Invalid password,

username should not be in it" and in that case change the password to have
the value: "password"

Print the information in the end
          */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter user name ");
        String userName = input.nextLine();
        System.out.println("Enter your password");
        String password = input.nextLine();

        if (password.length() < 5) {
            System.out.println("Password cannot be less than 5 characters");

        } else if (password.length() >= 5) {
            System.out.println("Invalid password");
        } else if (password.contains(userName)) {
            System.out.println("Invalid password");
        } else {
            System.out.println("password");
        }
    }
}
