package OperatorsPractice.Recap;

public class House {
    public static void main(String[] args) {
         String houseType ;
         byte numberOfBedrooms;
         byte numberOfBathrooms;
         byte numberOfKitchens;
         boolean isThereaBasement;
         boolean isThereAnAttic;
         boolean isThereHavePool;
         boolean isTheHouseForSale;
         boolean isTheHouseForRent;
         double costOfTheHouse;
         String address;
         int zipCode;
         boolean isParkNearBy ;
         byte ratingOfSurroundingSchoolDistricts;

         houseType = "Flate";
         numberOfBedrooms= 2;
         numberOfBathrooms=2;
         numberOfKitchens=1;
         isThereaBasement=false;
         isThereAnAttic=false;
         isThereHavePool=true;
         isTheHouseForSale=false;
         isTheHouseForRent=true;
         costOfTheHouse=2_000_000.99;
         address = "1521 Boyd Pointe Way Apt#1105 , VIENNA VA"  ;
         zipCode = 22182;
         isParkNearBy=true;
         ratingOfSurroundingSchoolDistricts= 8;

         String fullDetalies = "The"+ houseType +"on" + address +" ,"+ zipCode +" costs$"+ costOfTheHouse +"\n the" + houseType +" has "+ numberOfBedrooms + "bedroom," + numberOfBathrooms +"bathroom,"+ numberOfKitchens + " Kitchen\n has basement?" +isThereaBasement+ ", has an attic"+  isThereAnAttic + ", has a pool " + isThereHavePool + "and is on sale " + isTheHouseForSale +"or on rent ?" +isTheHouseForRent + "The Schools in the area have a rating of "+ ratingOfSurroundingSchoolDistricts;
        System.out.println(fullDetalies);

         
         


         
         
         

    }
}
