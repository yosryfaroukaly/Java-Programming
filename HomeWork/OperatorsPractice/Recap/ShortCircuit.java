package OperatorsPractice.Recap;

public class ShortCircuit {
    public static void main(String[] args) {
        System.out.println(true || 5/0 == 0);
    }
}
