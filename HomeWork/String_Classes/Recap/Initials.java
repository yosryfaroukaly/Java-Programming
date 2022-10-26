package String_Classes.Recap;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter fist name");
        String fName = input.next().toUpperCase();
        System.out.println("Enter last name");
        String lName = input.next().toUpperCase();

        System.out.println(""+fName.charAt(0)+lName.charAt(0));





    }
}
