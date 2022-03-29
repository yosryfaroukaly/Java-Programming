package day38_arraylist;

import java.util.ArrayList;

public class RemoveExample {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("water");
        list.add("sun");
        list.add("wind");
        list.add("wood");
        System.out.println(list); // [water, sun, wind, wood]

        list.remove(0); // returns: water, but we didn't use it
        System.out.println(list); // [sun, wind, wood]

        System.out.println(list.remove(list.size() - 1));
        //list.size() - 1 --> last index
        // remove(last index) --> remove element: wood
        // prints the removed element: wood

        System.out.println(list); // [sun, wind]

    }
}
