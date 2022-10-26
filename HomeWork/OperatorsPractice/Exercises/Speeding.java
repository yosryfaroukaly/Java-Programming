package OperatorsPractice.Exercises;

public class Speeding {
    public static void main(String[] args) {
        /*
        create a class called Speeding, and write a program to determine if the
car is speeding
declare 3 variables:
current speed, speed limit, speeding boolean
print
"Are you speeding? " true/false
         */

        int currentSpeed = 100;
        int speedLimit = 55;
        boolean speeding =true;

        boolean ifTheCareIsSpeeding = currentSpeed >= speedLimit;
        System.out.println("Are you speeding = " + ifTheCareIsSpeeding);

    }
}
