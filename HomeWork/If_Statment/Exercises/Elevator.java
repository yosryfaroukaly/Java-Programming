package If_Statment.Exercises;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("which floor you want the elevator to go to");
        int floor = input.nextInt();
        int num = 0;
        String message = "";


        switch (floor) {
            case 1:
                System.out.println("Lobby, StarBucks, Amazon pick up");
                break;
            case 2:
                System.out.println("NASA \nCydeo \nDiscover");
                break;
            case 3:
                System.out.println("Uber \nLyft \nChase");
                break;
            case 4:
                System.out.println("Rooftop \nLounge");
                break;
            default:
                System.out.println("Invalid Floor Selected");
                break;

        }


        /*
        declare and assign a floor number variable. The floor number represent which floor you want the elevator to go to. After getting to each floor show the information of which companies are on that floor. Use the following data:

	floor 1 --> Lobby, StarBucks, Amazon Pick Up
	floor 2 --> NASA, Cydeo, Discover
	floor 3 --> Uber, Lyft, Chase
	floor 4 --> Rooftop, Lounge

	any other floor value --> Invalid Floor Selected
         */

    }
}
