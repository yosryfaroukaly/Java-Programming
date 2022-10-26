package Loops.Exercises;

public class Loops {
    public static void main(String[] args) {
        /*
        write a program that will print all the alphabet letters in lowercase from
        'a' to 'z'
         */

        char litter = 'Z';
        while (litter >= 'A') {

            System.out.print(" " + litter);
            litter--;
        }
    }
}
