package If_Statment.Exercises;

import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("determine how much time is left ");
        int minuteValue = input.nextInt();
        String result = "";
        boolean rangeMatch = true;

        /*
           declare and assign a minutes variable
use the minutes value to determine how much time is left in the soccer
game
use these ranges to determine the outputs:
- any number less than 0 and more than 90 are not valid:
when the minutes is less than 0:
print: minutes cannot be a negative number
when the minutes is more than 90:
print: games cannot be longer than 90 minutes
- when the minutes are between 90 - 75
print: just getting started
- when the minutes are between 74 - 60
print: players are doing their best
- when the minutes are between 59 - 30
print: middle of the game is going great
- when the minutes are between 29 - 0
print: the end of the same is approaching
         */
        if (minuteValue >= 0 && minuteValue <= 90) {
            System.out.println("not valid");

            if (minuteValue > 0) {
                result = "minutes cannot be a negative number";

            } else if (minuteValue < 90) {
                result = "games cannot be longer than 90 minutes";

            } else if (minuteValue >= 75) {
                result = "just getting started";
            } else if (minuteValue >= 60) {
                result = "players are doing their best";
            } else if (minuteValue >= 30) {
                result = "middle of the game is going great";
            } else {
                result = "the end of the same is approaching";


                rangeMatch = true;

            }
            if (rangeMatch){
                String message = "In minutes " + minuteValue + " till now you " + result;
                System.out.println(message);
            }
        }
    }
}
