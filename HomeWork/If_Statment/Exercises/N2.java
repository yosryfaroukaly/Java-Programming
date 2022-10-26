package If_Statment.Exercises;

public class N2 {
    public static void main(String[] args) {
        /*
        an int value for the time of the day.Use a 24 hour format
        use the given time of day to display a message
        hint:
        use seperate if statements
        if the hours are from 6 - 11, print:Good morning
        if the hours are from 12 - 16, print:Good evening
        if the hours are from 17 - 23, print:Good night

         */

        int timeOfDay = 24;

        if (timeOfDay<=6&&timeOfDay>=11) {
            System.out.println("Good Morning");
        } else if (timeOfDay>=12&&timeOfDay<=16) {
            System.out.println("good evening");
        } else if (timeOfDay>=17&&timeOfDay<=23){
            System.out.println("good night");
            }else {
            System.out.println("wrong value");
        }


    }
}
