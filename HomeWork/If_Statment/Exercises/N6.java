package If_Statment.Exercises;

public class N6 {
    public static void main(String[] args) {
        /*
          create a int variable to represent the month number, where 1 is Janurary
and 12 is Decemeber.
use the month number input to determine how many days are in that month.
use the following data to help you determine the number of days in each
month:
Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
Months that has 30 days: 4, 6, 9, 11
Month that has 28 days: 2
ex:
12
31 days
ex:
9
30 days
         */
        int monthNumber= 7;
        boolean has31Days = monthNumber==1 || monthNumber==3  || monthNumber==5 || monthNumber==7  || monthNumber==8 || monthNumber==10  || monthNumber==12 ;
        boolean has30Days = monthNumber==4 || monthNumber==6  || monthNumber==9 || monthNumber==11;
        boolean has28Days = monthNumber==2;

        if (has31Days){
            System.out.println("has 31 days");

        }  else if (has30Days){
            System.out.println("has 30 days");

        } else if (has28Days) {
            System.out.println("has 28 days");
        }
    }
}
