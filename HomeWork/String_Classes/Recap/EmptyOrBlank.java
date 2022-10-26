package String_Classes.Recap;

public class EmptyOrBlank {
    public static void main(String[] args) {
        String str = "last example";
        System.out.println(str.isEmpty());
        str ="";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());

    }
}
