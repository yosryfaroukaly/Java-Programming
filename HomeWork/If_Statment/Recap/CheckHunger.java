package If_Statment.Recap;

import java.util.Scanner;

public class CheckHunger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("you are hungry? true or false");
        boolean isHungry = input.nextBoolean();

        if (isHungry) {
            System.out.println("you are hungry ");
        }else {
            System.out.println("Great, then practice java");
        }
    }
}
