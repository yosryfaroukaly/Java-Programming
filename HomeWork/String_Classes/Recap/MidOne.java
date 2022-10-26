package String_Classes.Recap;

public class MidOne {
    public static void main(String[] args) {
        /*
        [Middle char]
Given a String, write a program to display the middle character of a
string
a) If the length of the string is even there will be two middle
characters. b) If the length of the string is odd there will be one middle
character.
Ex:
Input: elephant
Output: The middle characters: ph
         */

        String name = "yosryy";
        int n = name.length()/2;

        if (name.length() % 2 == 0){
            char firstMid = name.charAt(n-1);
            char second =name.charAt(n) ;
            System.out.println(""+firstMid+second);
        } else if (name.length() % 2 == 1) {
                char firstMid = name.charAt(n);
                char second =name.charAt(n) ;
                System.out.println(""+firstMid+second);

        }else {
            System.out.println("Nothing ");
        }


    }
}
