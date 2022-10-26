package OperatorsPractice.Recap;

public class Casting {
    public static void main(String[] args) {
        long num1= 100l;
        short num2= (short) num1;
        System.out.println(num2);

        short num3=8;
        byte num4=(byte) num3;
        System.out.println(num4);

        double n = 5.5;
        int n1 = (int) n;
        System.out.println(n1);

        char q = 'A';
        int q1 = q;
        System.out.println(q1);
        System.out.println((int)q);
        System.out.println((char) 66);
        System.out.println((int)' ');
    }
}
