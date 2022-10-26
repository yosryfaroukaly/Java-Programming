package Arrays.Recap;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] n = {500, 120, -80, 90, 250, -10};
        int max = n[0];
        int min = n[0];

        for (int i = 0; i < n.length; i++) {
            int number = n[i];


            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
