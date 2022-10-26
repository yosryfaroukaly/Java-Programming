package OperatorsPractice.Recap;

public class Discount {
    public static void main(String[] args) {
        boolean isItWeekend = true;
        boolean teacher = false;
        boolean policeOfficer = false;
        boolean fireFighter= false;

        boolean getDiscount =  isItWeekend && (teacher || policeOfficer || fireFighter);
        System.out.println(getDiscount);

    }
}
