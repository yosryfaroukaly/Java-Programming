package Arrays.Recap;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5, 6,};
        int[] r = new int[n.length];

        for (int i = n.length-1, j=0; i >= 0 ; i--,j++) {
            r[j]=n[i];

        }
        System.out.println(Arrays.toString(n));
        System.out.println(Arrays.toString(r));

    }
}
