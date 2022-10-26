package If_Statment.Recap;

import java.util.Scanner;

public class ActualDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Day");
        String day = input.next();
        String massage = "";
        switch (day) {
            case "Monday":
            case "Mon":
            case "monday":
                massage = "We have Java with Saim at 7 pm EST";
                break;

            case "Tuesday":
            case "Wednesday":
                massage = "We have Java with Saim at 7 pm EST, but we also have office at 5:30";
                break;

            case "Thursday":
                massage = "We have soft skills with Nadir at 7 pm EST.";
                break;
            case "Friday":
                massage = "Today is day off, or as Nadir says soft skill studying day";
                break;
            case "Saturday":
            case "Sunday":
                massage = "We have full day of java with Saim from 10 am est to 5 pm est";
                break;

            default:
                massage = "Not Valid";

        }
        System.out.println(massage.toUpperCase());
    }
}
