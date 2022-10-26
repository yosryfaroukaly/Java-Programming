package If_Statment.Recap;

public class NastedIfStatment {
    public static void main(String[] args) {
        int salary = 30000;
        int jobYears = 2;
        String message;

        if (salary >= 30000) {
            if (jobYears >= 2) {
                System.out.println("You qualify for the loan");
            } else {
                System.out.println("You must have been on job at least 2 years");
            }
        } else {
            System.out.println("lll");
        }
    }
}
