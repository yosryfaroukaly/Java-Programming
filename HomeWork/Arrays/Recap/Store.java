package Arrays.Recap;

import java.util.Arrays;

public class Store {
    public static void main(String[] args) {
        String [] items = {"Jacket","t-shirt","short","underwear"};
        boolean hasJacket = false;
        for (int i = 0; i < items.length; i++) {

            if (items[i].equalsIgnoreCase("Jacket")){
                hasJacket=true;
                break;
            }
        }
        System.out.println(hasJacket?"jacket in stock":"jacket out of stock");
        System.out.println(Arrays.toString(items).contains("Jacket"));
    }
}
