package day65_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {

        // Creating Streams

        int [] arr = {1, 2, 3, 4, 5};
        Arrays.stream(arr);

        List<Integer> list = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 2));
        list.stream();

        // distinct(): remove duplicates
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 2, 4, 4, 5, 5, 6, 1, 1, 2, 2));
        System.out.println("distinct method: " + list2.stream().distinct().collect(Collectors.toList()));
        /*
            .stream() converts the list to a stream
            .distinct() remove duplicate values
            .collect((Collectors.toList()) converts the stream back to a list

            list2 = list2.stream().distinct().collect(Collectors.toList()); // reassigning is fine
         */

        System.out.println("original list " + list2); // original list is the same, not changed




    }
}
