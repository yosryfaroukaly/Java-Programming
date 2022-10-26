package String_Classes.Recap;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First name");
        String firstname = input.next();
        System.out.println("Enter Last name");
        String lastName = input.next();


        firstname = firstname.trim().toLowerCase();
        lastName = lastName.trim().toLowerCase();

        String first = firstname.substring(0, 1).toUpperCase() + firstname.substring(1);
        String second = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        System.out.println(first + " " + second);


    }
}
