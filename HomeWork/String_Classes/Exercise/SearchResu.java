package String_Classes.Exercise;

public class SearchResu {
    public static void main(String[] args) {
         /*
        Task 2 : Assume that you searched a word in Google  Search Engine.After that you took a result message like this


	   "About 3,640,000,000 results (0.78 seconds)"

		According to this result print out search Time and number of Result

		Input :  "About 640,000,000 results (0.78 seconds)"

		Output:
					Result number is 640,000,000
					Response time is 0.78 seconds
         */

        String result ="About 640,000,000 results (0.78 seconds)";

        int first = result.indexOf(" ");
        int sec = result.indexOf(" ",first+1);

        String res = result.substring(first+1,sec);

        System.out.println("res = " + res);

        first=result.indexOf("(");
        sec=result.indexOf(")");

        String time = result.substring(first+1,sec);
        System.out.println("time = " + time);


    }
}
