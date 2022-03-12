package day28_arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        // with normal variables

        String cityOne = "Chicago";
        String cityTwo = "New York";
        String cityThree = "Houston";
        String cityFour = "Denver";
        String cityFive = "Pittsburgh";

        // declare array with values

        String [] cities = { "Chicago", "New York" , "Houston", "Denver", "Pittsburgh" };

        String [] cities2 = {cityOne, cityTwo, cityThree, cityFour, cityFive};

        System.out.println(cities); // this doesn't print the array how we want

        // how to access each element in the array

        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);


    }
}
