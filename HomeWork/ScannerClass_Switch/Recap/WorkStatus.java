package ScannerClass_Switch.Recap;

import java.util.Scanner;

public class WorkStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Whats you First Name ?");
        String firstName = input.next();
        System.out.println("Whats you Last Name ?");
        String lastName = input.next();
        System.out.println("are you employee?");
        boolean employee = input.nextBoolean();
        System.out.println("are you student?");
        boolean student = input.nextBoolean();
        String details = firstName+ " " +lastName+ " " + employee + " " + student;
        System.out.println(details);
        //System.out.println(employee || !student);


        
    }
}
