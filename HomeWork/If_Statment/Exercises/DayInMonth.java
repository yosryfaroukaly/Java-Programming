package If_Statment.Exercises;

import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many days are in that month");
        String month = input.nextLine();
        String months = "" ;

        switch (month) {
            case "February":
                months ="28 days";
                break;
            case "April":
            case " June":
            case "September":
            case "November":
              months="30 days";
                break;
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                months="31 days";
                break;
            default:
                months="Not Accepted";
                break;
        }
        System.out.println(months);
        /*
        Days In Month (slightly different version than before)

Write a program that will accept a month name and outputs how many days are in that month

data:

    February: 28 days
    April, June, September, November: 30 days
    January, March, May, July, August, October, December: 31 days
         */
    }
}
