package If_Statment.Exercises;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your 1st Number ");
        double number1 = input.nextDouble();
        System.out.println("pick operators ( + - * / % )");
        String operator = input.next();
        System.out.println("Enter number 2");
        double number2 = input.nextDouble();

        double result = 0;
        boolean inValidCal = true;

        switch (operator) {

            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "%":
                if (number2 != 0) {
                    result = number1 % number2;
                }
                break;
            case "/":
                if (number2 != 0) {
                    result = number1 / number2;
                }
                break;
            default:
                System.out.println(operator + "is not valid");
                inValidCal = false;
        }
        if (inValidCal)
            System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
        /*
        create a class Calculator
- do it without Scanner
             declare and assign 2 number variables
declare and assign a char variable for an operator
create a calculator based on the operator picked
+ : add num1 and num2
- : minus num1 and num2
* : multiply num1 and num2
/ : divide num1 and num2
any other char: "invalid operator"
         */

    }
}