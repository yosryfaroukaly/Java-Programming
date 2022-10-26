package Loops.Exercises;

public class Fizzbuzz {
    public static void main(String[] args) {
        /*
        write a program that will check all the numbers from 1 - 50 and apply
fizzbuzz logic to it (see previous task from class if you are not sure)
1.  For numbers which are divisible by 3, print "Fizz" instead of
the number.
2.  For numbers which are divisible by 5, print "Buzz" instead of
the number
3.  For numbers which are a divisible by both 3 and 5, print
"FizzBuzz" instead of the number

         */
        int n = 1;
        while (n<=50){
            System.out.println(n);
            n++;
            if(n % 3 == 0 && n % 5 == 0) {
                System.out.print("FizzBuzz"+" ");
            } else  if(n % 3 == 0){
                System.out.print("Fizz"+" ");
            } else if(n % 5 == 0){
                System.out.print("Buzz"+" ");
            } else {
                System.out.print(n+" ");
            }

        }
    }
}
