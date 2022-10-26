package Arrays.Recap;

import java.util.Arrays;

public class reverse_word {
    public static void main(String[] args) {
        String str = "java always fun";
        String[] words = str.split(" ");
        String reverse = "";
        char[] midle = words[1].toCharArray();
        for (int i = midle.length - 1; i >= 0; i--) {
            reverse += midle[i] + "";
        }
        System.out.println(words[0]+" "+reverse+" "+words[2]);

    }
}
