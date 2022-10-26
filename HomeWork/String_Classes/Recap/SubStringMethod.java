package String_Classes.Recap;

public class SubStringMethod {
    public static void main(String[] args) {

        String s = "sunday";
        System.out.println(s.substring(3));
        System.out.println(s);
        System.out.println("Mon" + s.substring(3));

        System.out.println(s.substring(2, 4));
        System.out.println(s.substring(0, 5));
        System.out.println(s.substring(0, 6));


    }
}
