package If_Statment.Exercises;

public class Diver {
    public static void main(String[] args) {
               /*
               create a class Diver
You are diving in the ocean. Your oxygen tank has a certain level (number)
declare and assign a int variable about the oxygen level in the tank and
print a message based on the oxygen level:
Above 90 - Your tank is full
Above 80 - Still okay
Above 70 - Don't go too far
Above 60 - Start to head back
Above 50 - Be careful now you at at 50%
                */
        int oxygenTank = 110;
        String message ;

        if (oxygenTank>=90){
           message = "Your tank is full";
        } else if (oxygenTank>=80) {
            message = "Still okay";

        } else if (oxygenTank>=70) {
            message = "Don't go too far";

        } else if (oxygenTank>=60) {
            message = "Start to head back";

        }else if (oxygenTank>=50) {
            message = "Be careful now you at at 50%";

        } else {
            message = "Warning";
        }
        System.out.println(message);
    }
}
