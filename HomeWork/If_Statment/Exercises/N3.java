package If_Statment.Exercises;

public class N3 {
    public static void main(String[] args) {
       /*
       create a sales amount variable
use the sales amount to determine the bonus you get at end of the month

if your sales amount is less than 10000 you don't get any bonus

if your sales amount is more than or equal to 10000 and less than
15000 you get a bonus of 5000

if your sales amount is more than or equal to 15000 you get a bonus
of 7000

print your bonus number
        */
        double saleAmount =100;
        double bouns =saleAmount;
        if (saleAmount < 10000) {
            System.out.println("you dont get any bonus you get at end of the month");
        } else if (saleAmount >= 10000 && saleAmount < 15000) {
            System.out.println("you get a bonus of 5000");
        } else if (saleAmount >= 15000) {
            System.out.println("you get a bonus of 7000");
        }    else {
            System.out.println("nothing do");
        }
        System.out.println(bouns);


    }
}
