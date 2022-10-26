package Loops.Recap;

public class Multiply {
    public static void main(String[] args) {
        int n = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));

        }
        System.out.println(".........String..........");

        String name = "YOSRY";


        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));

        }

        System.out.print(".........Reverse chart ........");

        for (char i = 'z'; i >= 'a'; i--) {
            System.out.println(i+" ");

        }


        System.out.println(".........Sylla......");

        /*
    Syllables
        Given a String separated by dashes calculate how many syllables the words are
        Ex:
        Input:
        ja-va Output:
        2
     */
        String str = "ja-va";
                int syll = 0;


        for (int i = 0; i < str.length() ; i++) {

            if (str.charAt(i)== '-'){
                syll++;
            }

        }
        System.out.println(syll);


        

    }
}
