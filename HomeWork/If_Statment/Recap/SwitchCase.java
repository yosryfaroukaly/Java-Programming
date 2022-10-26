package If_Statment.Recap;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        System.out.println("Enter you number ");
        int number = input.nextInt();

        switch (number) {
            case (1):
                System.out.println("one");
                break;
            case (2):
                System.out.println("Two");
                break;
            case (3):
                System.out.println("Three");
                break;
            default:
                System.out.println("not allowed till now");

        }
    }
}
