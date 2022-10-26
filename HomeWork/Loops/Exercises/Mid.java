package Loops.Exercises;

public class Mid {
    public static void main(String[] args) {
        /*
        Middle char]
Given a String, write a program to display the middle character of a
string
a) If the length of the string is even there will be two middle
characters. b) If the length of the string is odd there will be one middle
character.
Ex:
Input: elephant
Output: The middle characters: ph
         */
        String n = "elephant";
        int mid = n.length() / 2;

        if (n.length() % 2 == 0) {
            char first = n.charAt(mid - 1);
            char last = n.charAt(mid);

            System.out.println("with chart " + first + last);
            System.out.println("With substring: " + n.substring(mid - 1, mid + 1));

        } else {
            char middle = n.charAt(mid);

            System.out.println("With charAt: " + middle);
            System.out.println("With substring: " + n.substring(mid, mid + 1));

        }
    }
}
