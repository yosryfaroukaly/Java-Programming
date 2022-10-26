package ScannerClass_Switch.Recap;

import java.util.Scanner;

public class YourInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age ");
        byte age = input.nextByte();
        System.out.println("Enter your Favorite number ");
        long favNum = input.nextLong();
        System.out.println("Enter your Fav Book ");
        String favBook= input.next();
        System.out.println("My age " + age  +" "+ "My Favorite Number " + favNum +" "+ "My Favorite Book " + favBook);


    }
}
