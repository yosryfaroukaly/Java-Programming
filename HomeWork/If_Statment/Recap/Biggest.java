package If_Statment.Recap;

public class Biggest {
    public static void main(String[] args) {
        int num1 = 20 , num2 = 30 , num3= 40;

        if (num1>=num2 && num1>=num3){
            System.out.println(num1+ "is the biggest");
        } else if (num2>=num1&&num2>=num3) {
            System.out.println(num2+ "is the biggest");

        }else {
            System.out.println(num3+"is the biggest");
        }
    }
}
