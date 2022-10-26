package String_Classes.Recap;

import java.util.Scanner;

public class web {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the URL");
        String url = input.nextLine();

        String website = url.substring(4,url.length()-4) ;
        System.out.println(website);
    }
}
