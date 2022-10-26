package String_Classes.Exercise;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words");
        String firstWord = input.nextLine();
        String secondWord = input.nextLine();
        String thirdWord = input.nextLine();
        String longestWord = "";

        if (firstWord.contains("a") && firstWord.length() > longestWord.length()) {
            longestWord = firstWord;
        }
        if (secondWord.contains("a") && secondWord.length() > longestWord.length()) {
            longestWord = secondWord;
        }
        if (thirdWord.contains("a") && thirdWord.length() > longestWord.length()) {
            longestWord = thirdWord;
        }
        System.out.println(longestWord);



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
    }
}
