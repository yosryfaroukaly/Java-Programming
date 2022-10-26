package If_Statment.Exercises;

import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what kind of clothes to wear based on the month");
        int month = input.nextInt();
        int numb =0;
        String message = "";
        switch (month){
            case 12 : case 1: case 2: message="Winter";break;
            case 3: case 4: case 5:message="Spring";break;
            case 6: case 7: case 8:message="Summer";break;
            case 9: case 10: case 11:message="Fall";break;
            default:
                message="Not Valid" ;
        }
        System.out.println(message);

        /*
        declare and assign a month number. Bases on the below data determine what season it is and what kind of clothes to wear. You can create your own expectations of what kind of clothes to wear based on the month


	12, 1, 2 	--> Winter
	3, 4, 5 	--> Spring
	6, 7, 8 	--> Summer
	9, 10, 11 	--> Fall

Ex:
	2
	It is winter, so wear a winter coat, gloves and a hat
         */
    }
}
