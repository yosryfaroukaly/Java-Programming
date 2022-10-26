package If_Statment.Exercises;

public class TernaryExample {
    public static void main(String[] args) {
        int a = 3;
        String result = a % 2 == 0 ? "even" : "odd";
        System.out.println(result);

        int num = -9;
        String positive = num > 0 ? "positive" : num < 0 ? "negative" : "nill";
        System.out.println(positive);


        int time = 12;
        double price = time>=12 && time<=15 ? 7.99 : 10.99 ;
        System.out.println(price);

    }
}
