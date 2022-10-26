package String_Classes.Exercise;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me your address ");
        String address = input.nextLine().trim().toUpperCase();
        if (address.startsWith("500")){
            System.out.println("house on the right side");
            System.out.println("house on drive");
        } else if (address.startsWith("600")) {
            System.out.println("house on the right side");
            System.out.println("house on drive");

        } else {
            System.out.println("not available ");
        }



        /*
check which street the house is on and which side of street
handle any extra spaces in the beginning or end of input address
at the end also print the address as all uppercase letters
houses that have a house number starting with the numbers 500 are on
the right side of the street while the address that start with the number
600 are on the left side of the street
the street they are on is given in the address
print the street by checking for these streets:
drive: house on drive
lane: house on lane
ave: house on avenue
Ex:
Input:
500312 road w drive, 98404
Output:
500312 ROAD W DRIVE, 98404
house on the right side
house on drive
Ex:
Input:
600134 South lane, 500415
Output:
600134 SOUTH LANE, 500415
house on the right side
house on drive


         */
    }
}
