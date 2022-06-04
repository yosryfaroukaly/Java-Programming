package day65_streams;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class Recap {
    public static void main(String[] args) {

/*
        1.1 Create a function that can check if two array are equal and contains the same elements
                ex: arr1 = {3,2,1}
                    arr2 = {2,1,3}

                output: true

 */

        BiPredicate<int [], int []> arrayIsEqual = (arr1, arr2) -> {

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1, arr2);
        };

        int [] arr1 = {3, 2, 5};
        int [] arr2 = {2, 1, 3};
        System.out.println(arrayIsEqual.test(arr1, arr2));
        System.out.println(Arrays.toString(arr1));


    }
}
