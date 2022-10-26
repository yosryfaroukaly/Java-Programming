package OperatorsPractice.Exercises;

public class TimeConvert {
    public static void main(String[] args) {
        int sec = 3695;
        int day, hours, minutes, seconds , total;

        day = 24 * 3600;
        hours = sec / 3600;
        minutes = sec % 3600 / 60;
        seconds = sec % 60;

        total =  day - (hours - minutes - seconds);
        System.out.println(total);
        
        // System.out.println("day  " + day + " h " + " hour" + hours + " minutes " + minutes + " second " + seconds);


    }
}
