package If_Statment.Recap;

import java.util.Scanner;

public class RealEstate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        We are buying a house
        ask the user for their budget (single number, max)
        

        Find the area that the user's budget fits into and provide all the information of the neighborhood

        extra condition: if the user gives a budget value below 0, it is invalid, so print: "That is not a valid budget". If the budget is more than 300,000 print "Too much money for this agency"

        Data based on neighborhood name:
            name - Hills
            average price - 80,000 - 100,000
            rating - 4.0
            gated - no
            allow pets - yes

            name - Oaks
            average price - 55,000 - 75,000
            rating - 3.5
            gated - no
            allow pets - yes

            name - Highland
            average price - 120,000 - 150,000
            rating - 4.5
            gated - yes
            allow pets - no

            name - Canyon
            average price - 160,000 - 201,000
            rating - 4.8
            gated - yes
            allow pets - yes

            If the budget is no in any range print: "No available houses"
         */


        System.out.println("what is your max budget");
        double budget = input.nextDouble();

        String name = "", avarage = "";
        double rat = 4.8;
        boolean gates = true, allowPets = false, isAvailable = true;

        if (budget > 0 && budget < 300_000) {
            System.out.println("Looking for house");

            if (budget >= 55_000 && budget >= 75_000) {

                name = "Hills";
                avarage = "55,000 - 75,000";
                rat = 4.0;
                gates = false;
                allowPets = true;

            } else if (budget >= 80_000 && budget >= 100_000) {
                name = "Okas";
                avarage = "80_000 - 100_000";
                rat = 3.5;
                gates = false;
                allowPets = true;
            } else if (budget >= 120000 && budget >= 150000) {
                name = "Highland";
                avarage = "120_000 - 150_000";
                rat = 4.5;
                gates = true;
                allowPets = false;

            } else if (budget >= 160_000 && budget >= 201_000) {
                name = "Canyon";
                avarage = "160,000 - 201,000";
                rat = 4.8;
                gates = true;
                allowPets = true;
            } else {
                System.out.println("No available houses");
                isAvailable = false;
            }
            if (isAvailable) {

                String massage = "Name of the neighborhood: " + name + "\nprice avarage: " + avarage + "\nrange " + rat + "\nGated: " + (gates ? "Yes" : "No") + "\n" + (allowPets ? "They allow pets" : "They don't allow pets");
                System.out.println(massage);
            }


        } else {
            if (budget > 0) {
                System.out.println("That is not a valid budget");
            } else {
                System.out.println("Too much money for this agency");
            }
        }
    }
}

