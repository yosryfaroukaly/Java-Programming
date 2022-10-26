package ScannerClass_Switch.Recap;

import java.util.Scanner;

public class Angle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 angle number ");
        float number1 = input.nextFloat();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        double sum = number1+number2+number3;

       boolean trangle = (sum==180) ;
       boolean circle = (sum==360);

        System.out.println("Is Triangle :" + trangle);
        System.out.println("Is circle :" + circle);

    }
}
