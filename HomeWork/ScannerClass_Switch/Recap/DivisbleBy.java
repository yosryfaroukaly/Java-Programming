package ScannerClass_Switch.Recap;

import java.util.Scanner;

public class DivisbleBy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number ");
        int num = input.nextInt();

        boolean by2 = num %2 ==0 || num %3 ==0 || num %5 ==0 ;

        System.out.println(by2);
      

    }
}
