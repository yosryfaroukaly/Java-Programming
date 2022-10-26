package day32_arrays;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {

        String [][] cydeo = new String[4][];
        //String [][] cydeo = new String[4][3];
        //[[null, null, null], [null, null, null], [null, null, null], [null, null, null]] --> 4 inner arrays that each have a size of 3
        System.out.println(Arrays.deepToString(cydeo));

        String [] groupOne = {"Emre", "Yasir","hhhh","hdhghd"};
        cydeo[0] = groupOne;

        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("adding group 2");

        String [] groupTwo = {"Basri", "Demet", "Shina", "Ismayil","hhhh"};
        cydeo[1] = groupTwo;
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("adding group 3");
        cydeo[2] = new String[]{"Mustafa", "Lima"};  // syntax to create an array without a reference
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("same group 3 as group 4");
        cydeo[3] = cydeo[1];
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println();

        for(String [] innerArray : cydeo){  // loops through the 2d array, cydeo

            for (int i = 0; i < innerArray.length; i++) {
                System.out.println(innerArray[i]);

            }

           for(String eachWord : innerArray){ // loops through every String element in each 1d inner array
                System.out.println(eachWord);
        }
            System.out.println(Arrays.toString(innerArray));

        }

    }
}
