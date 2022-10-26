package String_Classes.Recap;

public class StringClass {
    public static void main(String[] args) {
        String name ="yosry";
        String name1 ="yosrY";
        System.out.println(name1.equals(name));


        String name2= "yosry";
        String name3= new String("yosry")  ;
        System.out.println(name2.charAt(1));


        System.out.println("......");


        String namee= "sNOw" ;
        System.out.println(namee.length()+" "+namee.toUpperCase()+" "+namee.charAt(1)+" "+namee.substring(3 ).length());
    }
}
