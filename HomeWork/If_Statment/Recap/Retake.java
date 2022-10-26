package If_Statment.Recap;

import java.util.Scanner;

public class Retake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What was the grade");
        double grade = input.nextDouble();
        System.out.println("Which attempt number is it ");
        int attempt = input.nextInt();
        boolean ava = attempt<4 && attempt>0;



        if (attempt==1){
            grade-=grade*0.1;
            

        } else if (attempt==2) {
            grade-=grade*0.2;
        } else if (attempt==3) {
            grade-=grade*0.35;
        }else {
            System.out.println("Not valid");
        }
        if (ava){
            System.out.println(grade);
        }
    }
}
