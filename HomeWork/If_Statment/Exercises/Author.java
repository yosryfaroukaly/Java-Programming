package If_Statment.Exercises;

import java.util.Scanner;

public class Author {
    public static void main(String[] args) {
        /*
You are an author. You are writing a book and want to figure out some information related to the genre of book you are writing.

Given the genre name figure out: average page length, average profit, average number of sequels, average number of countries published in. Find and print the information based on the genre.

Make variables for all of that information. Given empty defaults for all the variables

    Data based on genre:

        genre - Fantasy
        page length - 500
        profit - 1,000,000
        sequels - 5
        countries - 50

        genre - Detective
        page length - 350
        profit - 700,000
        sequels - 3
        countries - 45

        genre - Science Fiction
        page length - 720
        profit - 900,500
        sequels - 4
        countries - 30

        genre - Short Story
        page length - 150
        profit - 300,000
        sequels - 1
        countries - 40

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Write your genre");
        String genre = input.nextLine();

        String genr = "", message = "";
        int pageLength = 0, sequels = 0, countries = 0;
        double profit = 0;
        boolean ifAvalible= true;

        if (genre == "Fantasy") {
            pageLength = 500;
            profit = 1_000_000;
            sequels = 5;
            countries = 50;
            message = "Fantasy";

        } else if (genre == genr) {
            pageLength = 350;
            profit = 7_000_000;
            sequels = 3;
            countries = 30;
            message = "Detective";

        } else if (genre == genr) {
            pageLength = 720;
            profit = 9_500_000;
            sequels = 4;
            countries = 30;
        } else if (genre == genr) {
            pageLength=150;
            profit=3_000_000;
            sequels=1;
            countries=40;


        }else {
            message="nothing";

        }
        
        message= "if genre "+ genre + " page lenght =" + pageLength +  " my profit $="+ profit;
        System.out.println(message);


    }
}
