package If_Statment.Exercises;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();
        String message;

        if (number % 3 == 0 && number % 5 == 0) {
            message = "FizzBuzz";
        } else if (number % 3 == 0) {
            message = "Buzz";
        } else if (number % 5 == 0) {
            message = "Fizz";
        } else {
            message = "number";
        }
        System.out.println(message);
    }
}
