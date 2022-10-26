package If_Statment.Recap;

public class OverTimeSameClass {
    public static void main(String[] args) {
        double hourlyRate = 20.5;
        double numberOfHours = 44;
        double netpay;

        if (numberOfHours > 40) {
            double overTime = numberOfHours - 40;
            netpay = 40 * hourlyRate;
            netpay+= overTime*hourlyRate*1.5;



        } else {
            netpay = numberOfHours * hourlyRate;

        }

        System.out.println(netpay);
    }
}
