package String_Classes.Recap;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        /*
        create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word
that also contains 'a'
Ex:
"java"
"mouse"
"computer"
Output: java
Challenge: Instead of just checking for "a" add another variable that can
be used to check for any character.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 String");
        String oneWord = input.nextLine();
        String twoWord = input.nextLine();
        String threeWord = input.nextLine();
        String longestWord = "";
        if (oneWord.contains("a") && oneWord.length() > longestWord.length()) {
            longestWord = oneWord;
        }
        if (twoWord.contains("a") && twoWord.length() > longestWord.length()) {
            longestWord=twoWord;

        }
        if (threeWord.contains("a") && threeWord.length() > longestWord.length()) {
            longestWord=threeWord;
        }
        System.out.println(longestWord.isEmpty()? "no single largest": longestWord+ " is the longest word");
    }
}
