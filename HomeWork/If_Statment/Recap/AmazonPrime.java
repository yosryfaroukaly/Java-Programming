package If_Statment.Recap;

public class AmazonPrime {
    public static void main(String[] args) {
        double price = 15;
        boolean hasPrime = false;
        double shippingFee = 3.99;
        price += 3.99;
        String message;

        if (hasPrime) {
            message = "Eligible for 2 days shipping";
        } else {
            if (price >= 25) {
                message = "Eligible for regular free shipping";
            } else {
                message = "not eligible for free shipping " + shippingFee + "$" + " Total price =" + price;
            }
        }
        System.out.println(message);
    }
}

