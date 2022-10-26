package If_Statment.Exercises;

import java.util.Scanner;

public class ex_4 {
    public static void main(String[] args) {
        Scanner person = new Scanner(System.in);
        System.out.println("Are you CitizenShip?");
        boolean citizen = person.nextBoolean();
        System.out.println("Are you a resident?");
        boolean res = person.nextBoolean();
        System.out.println("How older you ?");
        int age = person.nextInt();
        System.out.println("are you have Diploma");
        boolean dep = person.nextBoolean();

        if ((citizen || res) && (age > 18 && age < 35 ) || dep == true) {
            System.out.println("You are qualified for the Army");
        } else {
            if (!citizen || !res) {
                System.out.println("You must be a citizen or a resident");
            }
            if (age > 18 && age < 35) {
                System.out.println("Your age must be between 18 to 35 years old");
            }
            if (!dep){
                System.out.println("You must have a high school diploma");
            } else {
                System.out.println("Not Qualify");
            }
        }
    }
}
        /*
        Declare and assign these variables: Citizenship(boolean), resident
(boolean), and has high school diploma (boolean), and age(int). Determine
if the person is qualified to join the army.

- The person must be a citizen or a resident
-> If not print: You must be a citizen or a resident
- Their age must be between 18 and 35
-> If not print: Your age must be between 18 to 35 years
old
- They must have a high school diploma
-> If not print: You must have a high school diploma
> If all the criteria is met print: You are qualified for the Army
         */

