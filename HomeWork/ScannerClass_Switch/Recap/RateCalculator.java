package ScannerClass_Switch.Recap;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter a Salary");
        double salary = input.nextDouble();

        System.out.println("How many hour work in a week ");
        int hours = input.nextInt();

        double hourlyRate = salary / (hours * 52);

        System.out.println("With the Salary of " + salary + "and working for " + hours + "hours your hourly rate is :$ " + hourlyRate);



    }
}
