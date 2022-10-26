package OperatorsPractice.Exercises;

public class GalonsToLiters {
    public static void main(String[] args) {
        /*
        create a class called GalonsToLiters, and write a program that can convert
the gallons to litters
Ex:
gallon = 10;
output:
10 gallons equal to 37.8541 liters
gallon = 20
output:
20 gallons equal to 75.7082 liters
         */
        String gallon = "10 Gallon equal to "  , gallon2 = "20 Gallon equal to ";
        int gallonA= 10, gallonB= 20;
        double liters = 3.78541;
        double totalLiters = gallonA * liters;
        double totalLitters1 = gallonB * liters;


        System.out.println(gallon + totalLiters +" liters");
        System.out.println(gallon2 + totalLitters1+" liters");

    }
}
