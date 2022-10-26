package Loops.Recap;

public class reca {
    public static void main(String[] args) {

        String s = "asdfg123MMMkjhHJH^5fsHfg";
        int upper = 0;
        int lower = 0;
        int number = 0;

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);

            if (letter >= 'A' && letter <= 'Z') {
                upper++;

            } else if (letter >= 'a' && letter <= 'z') {
                lower++;
            } else if (letter >= '1' && letter <= '9') {
                number++;
            }
        }
        System.out.println("upper = " + upper);
        System.out.println("lower = " + lower);
        System.out.println("number = " + number);
    }
}
