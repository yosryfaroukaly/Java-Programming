package OperatorsPractice.Recap;

public class off01 {
    public static void main(String[] args) {
        String name = "Yosry";
        byte age = 35 ;
        char gender = 'M';
        boolean isStudent = true;
        Short numberOfSibling= 5 ;
        Long favoriteNumber= 10000000000l;
        int numberOfSeasons = 4, year = 1987;
        double birthDate= 09.27;
        String favoriteQuote="Never Give Up";
        String fullBirthDay= "0" +birthDate+"."+year;
        System.out.println(fullBirthDay);


        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("favoriteQuote = " + favoriteQuote);


        System.out.println(".....Escape Seq......");

        System.out.printf("\tname : "+name+"\n\tage :"+age+"\n\tgender : "+gender);

        


    }
}
