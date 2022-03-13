package day29_arrays;

public class Store {
    public static void main(String[] args) {
        String [] items = { "Shoes", "Jackets", "Gloves", "AirPod", "Ipod", "Backpack"};
        double [] prices = { 89.99, 150.0, 999.99, 250.0, 439.5, 39.99 };
        int [] itemIds = { 12345, 12346, 12347, 12348, 12349, 12350 };

        // print the catalog

        for(int i = 0; i < items.length; i++){

            System.out.println("Item ID: " + itemIds[i] + " are " + items[i] + " and they cost $" + prices[i]);

        }

        System.out.println();

        // Task: Find the index of Gloves





    }
}
