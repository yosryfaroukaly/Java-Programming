package OperatorsPractice.Recap;

public class MyName {
    public static void main(String[] args) {
        /*
	create a class MyName
	create a main method
	create multiple char variables, one for each letter of your name
	print your name
		print each letter in a different line
		print your name in the same line
     */
        char firstLitter ='Y';
        char secondLitter='O';
        char threeLitter='S';
        char fourLitter='R';
        char fiveLitter='Y';
        System.out.println(firstLitter);
        System.out.println(secondLitter);
        System.out.println(threeLitter);
        System.out.println(fourLitter);
        System.out.println(fiveLitter);
        System.out.println();
        System.out.println(""+firstLitter+secondLitter+threeLitter+fourLitter+fiveLitter);
        System.out.println();
        String name =""+firstLitter+secondLitter+threeLitter+fourLitter+fiveLitter;
        System.out.println("My name is = " + name);

    }
}
