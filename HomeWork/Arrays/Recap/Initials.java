package Arrays.Recap;

public class Initials {
    public static void main(String[] args) {
        String [] names = {"Yosry Farouk","Rasha Ghanawi"};
        for (int i = 0; i < names.length; i++) {
            String fullName = names[i].trim();
            String lastName =fullName.substring(fullName.indexOf(" ")).trim();
            System.out.println(""+fullName.charAt(0)+ lastName.charAt(0));

        }
    }
}
