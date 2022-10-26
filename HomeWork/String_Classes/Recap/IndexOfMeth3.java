package String_Classes.Recap;

public class IndexOfMeth3 {
    public static void main(String[] args) {

        String name= "definition";
        System.out.println("first i : "+ name.indexOf("i"));
        System.out.println("Last i : "+ name.lastIndexOf("i"));

        System.out.println("Second i : "+name.indexOf("i",4));
    }
}
