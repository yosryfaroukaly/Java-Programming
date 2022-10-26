package Loops.Exercises;

public class ManyWords {
    public static void main(String[] args) {
        /*
        Given a sentence determine how many words are in the String.
Ex:
Input:
This has multiple words
Output:
4
         */
//        String input = "This has multiple words";
//        input.length();
//        int length = input.length();
//        int start = 0 ;
//        int count = 1;
//
//        while (start<length){
//            if (input.charAt(start)==' '){
//                count++;
//
//            }
//                start++;
//
//        }
//        System.out.println(count);
       /*
       Given a String separated by dashes calculate how many syllables the
words are
Ex:
Input:
ja-va
Output:
2
        */

        String word = "Ja-va";
        int start = 0;
        int end = word.length();
        int count = 1;

        while (start < end) {
            if (word.charAt(start) == '-') {
                count++;
            }
            start++;
        }
        System.out.println(count);

    }
}
