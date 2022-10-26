package If_Statment.Recap;

public class OverTime {
    public static void main(String[] args) {
        double hourlyRate = 20;
        double numberOfHours = 45;
        double netPay;
        double totalHours;
        double time;
        double totallAfterOver;


        if (numberOfHours > 40) {

            double overTime = numberOfHours - 40;
            

            netPay = hourlyRate * numberOfHours;
            totallAfterOver=netPay+overTime /24;
            System.out.println("You have more hours");
            totalHours = netPay + overTime;
            System.out.println(totalHours);
            
            time = totalHours /24;
            time -= numberOfHours;
            System.out.println("How many hour overtime");
            System.out.println(time);

        } else {
            System.out.println("you work ");
//            netPay+=
//
//        } else {
//            netPay = overTimeHours*numberOfHours;
//
//            System.out.println("Less Rate");
//        }
//        System.out.println();


        }
    }
}
