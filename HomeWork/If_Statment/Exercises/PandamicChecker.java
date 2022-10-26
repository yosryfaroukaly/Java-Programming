package If_Statment.Exercises;

import java.util.Scanner;

public class PandamicChecker {
    public static void main(String[] args) {
        int years = 1771;
        String pandemic = years >= 1346 && years <= 1353 ? "The Black Death" : years >= 1665 && years <= 1666 ? "Great Plague of London" : years >= 1770 && years <= 1772 ? "Russian plague" : years >= 1889 && years <= 1890 ? "Flue pandemic" : years == 1916 ? "American polio epidemic" : years >= 1918 && years <= 1920 ? "Spanish Flue" : years >= 2009 && years <= 2010 ? "H1N1 Swine Flue pandemic" : years >= 2014 && years <= 2016 ? "West African Ebola epidemic" : years >= 2020 && years <= 2022 ? "Covid-19" : "nill";
        System.out.println(pandemic);


    }
}
