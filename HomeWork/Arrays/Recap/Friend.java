package Arrays.Recap;

import java.util.Arrays;
import java.util.Scanner;

public class Friend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many friends you have ?");
        int size = input.nextInt();
        String[] friendsLst = new String[size];
        for (int i = 0; i < friendsLst.length; i++) {
            System.out.println("enter f name");
            friendsLst[i] = input.next();
        }
        System.out.println(Arrays.toString(friendsLst));
    }
}
