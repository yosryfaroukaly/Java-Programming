package String_Classes.Recap;

import day28_arrays.StudentInformation;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         /*
    Ask the user to enter a website
    check if it is a valid website

	- it is valid if it begins with:
		www.

	- it is valid if the end is:
		.com
		.edu
		.gov
		.net

      in cases it is not valid, tell the reason why

     */

        System.out.println("Enter your URL ");
        String url = input.nextLine();
        boolean validStart = url.startsWith("www.");
        boolean validEnd = url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov") || url.endsWith(".net");
        if (validStart && validEnd) {
            System.out.println(url + " is a valid website");
        } else {
            
            if (!validStart){
                System.out.println("url need to start with www.");
            }
            if (!validEnd){
                System.out.println("url need to end with .....");
            }
        }
    }
}
