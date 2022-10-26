package Arrays.Recap;

import java.util.Arrays;
import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        /*
        all String types
        0 -> id
        1 -> first name
        2 -> last name
        3 -> batch number

     */

        String[] student1 = {"001", "yosry", "aly", "B26"};
        System.out.println(Arrays.toString(student1));

        String[] student2 = new String[4];
        System.out.println(Arrays.toString(student2));
        student2[0] = "002";
        student2[1] = "A";
        student2[2] = "B";
        student2[3] = "B26";

        System.out.println(student2.length);
        System.out.println(Arrays.toString(student2));

       // String[] student3 = new String[3] ;
        Scanner input = new Scanner(System.in);
//        System.out.println("enter you id ");
//        student3[0]= input.nextLine();
//        System.out.println("enter your initial-name");
//        student3 [1]= input.nextLine();
//        System.out.println(Arrays.toString(student3));


        String[] student4= new String[3];
        String [] questions = {"Enter your id ","enter your initial name "} ;
        for (int i = 0; i < student4.length; i++) {
            System.out.println(questions[i]);
            student4[i]= input.nextLine();
        }
        System.out.println(student4);

        


    }
}
