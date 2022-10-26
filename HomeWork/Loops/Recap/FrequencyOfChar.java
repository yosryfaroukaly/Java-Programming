package Loops.Recap;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String s = "apple";
        String check = "";

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            char letter = s.charAt(i);

            if (check.contains(""+letter)){
                continue;
            }

            for (int j = 0; j < s.length(); j++) {
                char eashLetter = s.charAt(j);
                if (letter == eashLetter) {
                    count++;

                }
            }
            System.out.println(letter+" - "+count);
            check+=letter;
        }
    }
}
