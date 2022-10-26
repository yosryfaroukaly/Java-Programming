package If_Statment.Exercises;

public class N1 {
    public static void main(String[] args) {
                  /*
                  Create two number variables
Find and print which number is bigger between the two
ex:
50
45
output:
50 is bigger
                   */

        int no1 = 50, no2 = 45;

        if (no1 >= no2) {
            System.out.println(no1+" is bigger");
        }  else {
            System.out.println(no1+" is smallest");
        }
    }
}
