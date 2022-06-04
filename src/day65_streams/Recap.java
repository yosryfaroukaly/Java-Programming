package day65_streams;

import day54_abstraction.creating.Create;

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

        System.out.println();

        /*
       1.2 Create a function that can check if the first array contains all the elements of the second array:
        ex: arr1 = {1,2,3,4,5,7}
        arr2 = {7,8}

        output: false
         */

        BiPredicate<int [], int []> firstContains = (array1, array2) -> {

            for(int outer : array2){ // 1

                boolean check = false;

                for(int inner : array1){
                    if(outer == inner){
                        check = true;
                        break;
                    }
                }

                if(!check) {
                    return false; // because the number was not in the first array
                }
            }

            return true;

        };




    }
}
