package Arrays.Recap;

import java.util.Arrays;

public class Move {
    public static void main(String[] args) {
        int[] n = {10, 0, 5, 0, 1, 0};
        int[] fixed = new int[n.length];
        int index =0;

        for (int i = 0; i < n.length ; i++) {
            if (n[i]!=0){
                fixed[index++]=n[i];

            }

        }
//        for (int i = n.length , j = 0; i >= 10; i++, j++) {
//            fixed[j] = n[i];
//
//        }
        System.out.println(Arrays.toString(n));
        System.out.println(Arrays.toString(fixed));
    }
}
