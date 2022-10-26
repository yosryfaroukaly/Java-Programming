package Loops.Recap;

public class CharInString {
    public static void main(String[] args) {
         /*
    Characters in String
        Given a String print the ascii value codes for each character
        Ex:
        Input:
        java
        Output:
        106 97 118 97
     */

        String s = "123gsgsfd454jHGDDSkjhgsHHGGGk544";
        int lower = 0;
        int upper = 0;
        int number = 0;

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (letter >= 'A' && letter <= 'Z') {
                upper++;
            } else if (letter >= 'a' && letter <= 'z') {
                lower++;
            } else if (letter >= '0' && letter <= '9') {
                number++;
            }
        }
        System.out.println("upper = " + upper);
        System.out.println("lower = " + lower);
        System.out.println("number = " + number);
    }
}
