package day61_maps;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveWhileLooping {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(
                2, 3, 5, 6, 12, 6, 35, 6, 2, 5, 6, 2, 3, 1, 4, 5
        ));

        // traditional loop with removing doesn't, but because indexs/elements get shifted, so it could skip some elements
//        for(int i = 0; i < list.size(); i++){
//            if(list.get(i) < 5){
//                list.remove(i);
//            }
//        }

        // removing in a for each loop is also not valid, because we cannot change the size of the arraylist/collection when looping in for each loop
//        for(int each : list){
//            if(each < 5){
//                list.remove(each);
//            }
//        }

        System.out.println(list);


    }
}
