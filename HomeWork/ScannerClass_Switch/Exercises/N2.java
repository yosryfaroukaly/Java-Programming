package ScannerClass_Switch.Exercises;

import java.util.Scanner;

public class N2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Write a program that asks the user to enter 3 angle numbers ( can be
floating numbers )
Determine if the angles make a triangle, which means the angles add to
180.0
and
Determine if the angles make a circle, which means the angles add to
360.0
         */
        System.out.println("Enter your first angle");
        float firstAngle = input.nextFloat();
        System.out.println("Enter your second angle");
        float secondAngle = input.nextFloat();
        System.out.println("Enter your third angle");
        float thirdAngle = input.nextFloat();

        double ifTheAnglesMakeATriangle = firstAngle+secondAngle+thirdAngle;
        double ifTheAnglesMakeACircle = firstAngle+secondAngle+thirdAngle;

        boolean a = ifTheAnglesMakeATriangle < 180;
        boolean b = ifTheAnglesMakeATriangle > 360;


        System.out.println("if The Angles Make A Triangle= " + a +"\n if The Angles Make A Circle= "+ b) ;
        



        

        
        
    }
}
