package If_Statment.Recap;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Temperature");
        int temperature = input.nextInt();


        if (temperature>=670){
            System.out.println("Go out side , but with your laptop to code java");
        }else {
            System.out.println("Its too cold \nCode more java");
        }
    }
}
