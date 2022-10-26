package If_Statment.Recap;

public class OverTime2 {
    public static void main(String[] args) {
        /*
        create a double variable for your hourly rate
        create a double variable for the number of hours worked

        calculate your net pay, with consideration of overtime pay

            if you worked more than 40 hours you get overtime pay for the hours past 40. Overtime pay is 1.5 the normal rate
                (if you worked 43 hours, you will get 40 hours normal pay and 3 hours overtime pay)
         */

        double hourlyRate= 20.5;
        double numberOfHours =44;
        double netpay ;

        if (numberOfHours>40){
        //   double overTime =  numberOfHours-40;
            netpay =40 * hourlyRate;
            netpay+= (numberOfHours-40) *hourlyRate*1.5;
        }   else {
            netpay = numberOfHours*hourlyRate;
        }
        System.out.println(netpay);

    }
}
