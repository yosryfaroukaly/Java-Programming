package If_Statment.Exercises;

public class Retake {
    public static void main(String[] args) {
        /*
        create a class Retake
declare and assign a grade variable
declare and assign an attempt number
Doing a retake for the assignment will reduce the grade by a percentage
based on the number of attempts taken:
If its the first attempt -> subtract 10%
If its the second attempt -> subtract 20%
If its the third attempt -> subtract 35%
Based on the retake attempt number calculate the final grade

         */
        int grade = 180;
        int attempt = 8;
        String finalGrate;

        if (attempt == 10) {
            finalGrate = grade - 0.1 + " %";
        } else if (attempt >=8) {
            finalGrate = grade - 0.20 + " %";
        } else if (attempt >=5) {
            finalGrate = grade - 0.3 + " %";
        } else {
            finalGrate = "nill";
        }
        System.out.println(finalGrate);


    }
}
