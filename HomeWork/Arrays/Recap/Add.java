package Arrays.Recap;

public class Add {
    public static void main(String[] args) {
        int[] number = {3, 6, 10};
        int count = 0;

        for (int i = 0; i < number.length; i++) {
           count+= number[i] ;


        }
        System.out.println(count);


    }
}