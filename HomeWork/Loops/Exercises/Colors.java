package Loops.Exercises;

import java.util.Scanner;

public class Colors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  color = 0;
        String uniqueColor = "";

        while (color<3){
            System.out.println("pick a color");
            String colors = input.nextLine();
             color++;
             uniqueColor+=colors+" ";
            //System.out.println(uniqueColor);
        }
        System.out.println(uniqueColor);
    }
}
