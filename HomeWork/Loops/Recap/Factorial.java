package Loops.Recap;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int result = 1;

        while (num > 1) {
            System.out.println(result+"*"+num);
            result *= num;
            num--;
           
        }
        System.out.println(result);
    }
}
