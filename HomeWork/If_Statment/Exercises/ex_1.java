package If_Statment.Exercises;

import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
           declare and assign an age variable
             use these ranges to determine which age group you belong to
               if the given age value is less than 0 or more than 120:
                 print: Invalid age
           otherwise uses these to determine the age group
             Baby (2 years and below)
             Toddler (3 - 5)
             Kid (6 - 9
             Pre-Teen (10 - 12)
             Teenager (13 - 17)
             Young Adult (18 - 20)
             Adult (21 - 35)
             Middle-Aged Adult (36 - 55)
             Senior Citizen (55+)
         */

        System.out.println("Which age you Belong to ");
        int age = input.nextInt();
        String name = "", range = "";
        boolean isAvailable = true;

        if (age < 0 || age > 120) {
            System.out.println("Invalid age");

        } else {

            if (age <= 2) {
                name = "baby ";
                range = "(2 years and below)";

            } else if (age >= 3 && age <= 5) {
                name = "toddler";
                range = "(3 - 5)";

            } else if (age >= 6 && age <= 9) {
                name = "kid";
                range = "(6 - 9)";

            } else if (age >= 10 && age <= 12) {
                name = "pre tean";
                range = "(10 - 12)";

            } else if (age >= 13 && age <= 17) {
                name = "Teen ager";
                range = "(13 - 17)";

            } else if (age >= 18 && age <= 20) {
                name = "Young Adult";
                range = "(18 - 20)";

            } else if (age >= 21 && age <= 35) {
                name = "Adult";
                range = "(21 - 35)";

            } else if (age >= 36 & age <= 55) {
                name = "Middle Aged Adult";
                range = "(36 - 55)";

            } else if (age > 55) {
                name = "Senior Citizan";
                range = "(55+)";


            } else {
                isAvailable = true;

            }
            if (isAvailable) {
                String ad = "if the age " + range + "\n type of age " + name;
                System.out.println(ad);

            }
        }
    }
}
