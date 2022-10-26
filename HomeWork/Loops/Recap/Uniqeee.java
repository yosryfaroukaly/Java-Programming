package Loops.Recap;

public class Uniqeee {
    public static void main(String[] args) {
        String s = "aabbcddeef";

        // count = 1 because unique dont wanna repet

        for (int i = 0; i < s.length(); i++) {
            char litter = s.charAt(i);
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                char inner = s.charAt(j);
                if (litter == inner) {
                    count++;
                }
            }
            if (count==1){
                System.out.print(litter);
            }
        }
    }
}
