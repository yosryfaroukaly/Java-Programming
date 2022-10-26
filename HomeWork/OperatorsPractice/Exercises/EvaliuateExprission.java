package OperatorsPractice.Exercises;

public class EvaliuateExprission {
    public static void main(String[] args) {
        /*
        Evaluate the expressions step by step. NOT in intellij, do it yourself
int x = 2 + 3 * 2 / 1;
what is x?
         */
        int x = 2 +  3 * 2 / 1;
         //             6/1
        //               6
        //       2+6
        //  8
        System.out.println("x = " + x);

        /*_________________________________________________
Evaluate the expressions step by step. NOT in intellij, do it yourself
int y = ( 2 + 3 ) * 2;
what is y?
         */
        int y = ( 2 + 3 ) * 2;
        //          5 *2
        //            10
        System.out.println("y = " + y);

        /*_____________________________________________________
Evaluate the expressions step by step. NOT in intellij, do it yourself
int w = 78 / 2 * 2 + 3 - 5 % 5;
what is z?
         */
        int w = 78 / 2 * 2 + 3 - 5 % 5;
        int z = 0;
        System.out.println("z = " + z);

        /*____________________________________________________
Evaluate the expressions step by step. NOT in intellij, do it yourself
int i = 8 + 2 + 3 + 5 - 2 - 1- 0 + 1 * 2;
what is i?
         */
        int i = 8 + 2 + 3 + 5 - 2 - 1- 0 + 1 * 2;
        //                                   2
        //                           -3
        //         18
        //         18 - 3 + 2
        //             17
        System.out.println("i = " + i);

        /*___________________________________________
Evaluate the expressions step by step. NOT in intellij, do it yourself
int a = 8;
int b = a--;
what is a?
what is b?

 */
        int a = 8;
        int b = a--;
        System.out.println("a = " + a); //7
        System.out.println("b = " + b);  //8

        /*_____________________________________________________
Evaluate the expressions step by step. NOT in intellij, do it yourself
int a =1
int b = -a-- + a++ / -a-- * --a;
what is a?
what is b?

         */
        int a1 = 1 ;// 1   +  0  / -1   *  0
        int b1 =      -a-- + a++ / -a-- * --a;
        //            -0   +  1  / -0   *  -1
        //                  1    /    -0
        //                       0

        System.out.println("a1 = " + a1);
        System.out.println("b1 = " + b1);

        /*_____________________________________________________
Evaluate the expressions step by step. NOT in intellij, do it yourself
int A = 50;
int B = --A + A++ + A-- + A++;
what is A?
what is B?
         */
        int A = 50;   // 49  50  49  50
        int B = --A + A++ + A-- + A++;
        //      49 + 49 + 50 + 49
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        /*_____________________________________________________
Evaluate the expressions step by step. NOT in intellij, do it yourself
int X = 4;
int Y = X * 4 - X++;
what is X?
what is Y?
         */
        int X = 4;   //5
        int Y = X * 4 - X++;
        //      4 * 4 - 4
        //        16  - 4
        //            12
        System.out.println("x = " + X);
        System.out.println("y = " + Y);

        /*____________________________________________________
Evaluate the expressions step by step. NOT in intellij, do it yourself
int t = 100;
int p = - ++t * -t-- / t++ + --t;
what is t?
what is p?
         */
        int t = 100;
        int p = - ++t * -t-- / t++ + --t;

        /*____________________________________________________
Evaluate the expressions step by step. NOT in intellij, do it yourself
int R = 20;
int W = -R-- + -R++ + --R * R-- % 2;
what is R?
what is W?
         */
        int R = 20; // -20 +  -19  +  19 * 19 % 2
        int W =        -R-- + -R++ + --R * R-- % 2;
           //          -19 +  -20  +  19 * 18 % 2
        System.out.println("R = " + R);
        System.out.println("W = " + W);

        /*_____________________________________________________
Evaluate the expressions step by step. NOT in intellij, do it yourself
int M = 300;
int N = 400;
int U = ++M + N++ - M-- % 2 + --N % 2;
what is M?
what is N?
what is U?
         */
        int M = 300;
        int N = 400;
        int U = ++M + N++ - M-- % 2 + --N % 2;
        //       301+ 400 - 300 % 2 + 399 % 2
        System.out.println("M = " + M);
        System.out.println("N = " + N);
        System.out.println("U = " + U);
    }
}
