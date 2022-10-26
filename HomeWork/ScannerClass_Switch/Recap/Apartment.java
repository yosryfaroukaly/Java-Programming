package ScannerClass_Switch.Recap;

import java.util.Scanner;

public class Apartment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String address , nameOfOwner, ownerPhoneNumber ;
        int numberOfUnits , numberOfWashersAndDryer , lengthOfLease , totalNumberOfResidents , numberOfFloors , numberOfParkingSpaces ;
        double averageSizeOfEashUnit , monthRentAmount ,numberOfReviewStars;
        boolean allowPetsOrNo , hasAPool , isNearAGasStation ,hasABasement , hasAirConditioning , hasWheelchairAccess;

        System.out.println("Enter the address ");
        address= input.nextLine();
        System.out.println("Enter the name of the owner ");
        nameOfOwner= input.nextLine();
        System.out.println("Phone  "+ nameOfOwner + "'s phone number");
        ownerPhoneNumber = input.next();
        System.out.println("Please enter the number of unite");
        numberOfUnits= input.nextInt();
        System.out.println("Please enter the number of washers and dryers");
        numberOfWashersAndDryer = input.nextInt();
        System.out.println("Please enter the number of length Of Lease");
        lengthOfLease = input.nextInt();
        System.out.println("Please enter the number of total Number Of Residents");
        totalNumberOfResidents = input.nextInt();
        System.out.println("Please enter the number of number Of Floors ");
        numberOfFloors = input.nextInt();
        System.out.println("Please enter the number of number Of Parking Spaces");
        numberOfParkingSpaces = input.nextInt();
        System.out.println("Please enter the average size of the units");
        averageSizeOfEashUnit = input.nextDouble();

        
        System.out.println("Please enter month Rent Amount");
        monthRentAmount = input.nextDouble();
        System.out.println("Please enter number Of Review Stars");
        numberOfReviewStars = input.nextDouble();


        System.out.println("allow Pets Or No");
        allowPetsOrNo= input.nextBoolean();
        System.out.println("has A Pool");
        hasAPool= input.nextBoolean();
        System.out.println("is Near A Gas Station");
        isNearAGasStation= input.nextBoolean();
        System.out.println("hasABasement");
        hasABasement= input.nextBoolean();
        System.out.println("has Air Conditioning");
        hasAirConditioning= input.nextBoolean();
        System.out.println("has Wheel chair Access");
        hasWheelchairAccess= input.nextBoolean();

        double rateAfter3Years = monthRentAmount * 0.9;
        double rateAfter6Years = monthRentAmount * 0.8;
        int averageNumberOfResidenceOfUnit= totalNumberOfResidents/numberOfUnits;
        int averageNumberOfParkingSpots = numberOfParkingSpaces/ numberOfUnits;
        int averageNumberOfUnitPerFloor = numberOfUnits/ numberOfFloors;





        


    }
}
