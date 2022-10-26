package If_Statment.Recap;

import java.util.Scanner;

public class LogInApp {
    public static void main(String[] args) {
        /*
        inputs:
declare and assign a 4 digit pin code
declare and assign the last 4 digits of ssn: 1234

declare and assign expected values for both
	example expected:
		pin: 1552
		ssn: 1234

outputs:

	when the pincode and ssn match the expected print:
		Authentication successful

	when the pincode or ssn are not correct print:
		Authentication failed

	when the pincode was not correct print:
		incorrect pin code

	when the ssn is not correct print:
		invalid ssn
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you pin code");
        int pinCodeOriginal = input.nextInt();
        System.out.println("Enter you ssn ");
        int ssnOriginal = input.nextInt();
        int pinCode = 1234, ssn = 2345;


        if (pinCodeOriginal == pinCode && ssnOriginal == ssn) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication failed");

            if (pinCodeOriginal != pinCode) {
                System.out.println("incorrect pin code");

            }
            if (ssnOriginal != ssn) {
                System.out.println("invalid ssn");
            }
        }
    }
}


