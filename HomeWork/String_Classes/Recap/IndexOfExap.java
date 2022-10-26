package String_Classes.Recap;

public class IndexOfExap {
    public static void main(String[] args) {
        String name= "banana";

        int first = name.indexOf('a');
        System.out.println(first);
        int second = name.lastIndexOf('a');
        System.out.println(second);
        int three =name.indexOf('a',first+1);
        System.out.println(three);
        int four = name.indexOf('a',three+1)  ;
        System.out.println(four);
        

//        System.out.println(name.indexOf('a'));
//        System.out.println(name.lastIndexOf('a'));
//        System.out.println(name.indexOf("a",2));
    }
}
