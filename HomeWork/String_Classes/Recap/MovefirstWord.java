package String_Classes.Recap;

import java.util.Scanner;

public class MovefirstWord {
    public static void main(String[] args) {
          /*
    [Move first word]
        Given a sentence. Display the sentence with the first word moved to the end of the sentence.
        Ex:
        Input: Java is a fun language
        Output: is a fun language Java
        Hint: Use indexOf and substring
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentences");
        String sentence = input.nextLine().trim();

        int space = sentence.indexOf(' ');
        String word = sentence.substring(0,space).trim();
        String result =  sentence.substring(space).trim() + " " + word;
        System.out.println(result);


//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your sentences");
//        String sentences = input.nextLine().trim();
//
//        int space = sentences.indexOf(' ');
//        String firstWord = sentences.substring(0,space).trim();
//       // firstWord+= " java";
//        String result = sentences.substring(space).trim()+ " " + firstWord;
//        System.out.println(result);


//        String sentence = "Java is a fun language";
//
//        sentence = sentence.substring(5);
//
//        System.out.println(sentence + " " + "java");

    }
}
