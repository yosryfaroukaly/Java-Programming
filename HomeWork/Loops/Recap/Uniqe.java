package Loops.Recap;

public class Uniqe {
    public static void main(String[] args) {
        String s = "abcabc";
        String uniqe = "";

        for (int i = 0; i < s.length(); i++) {

            if (!uniqe.contains(""+ s.charAt(i))){
                uniqe+= s.charAt(i);
                
            }
        }
        System.out.println("uniqe = " + uniqe);
    }
}
