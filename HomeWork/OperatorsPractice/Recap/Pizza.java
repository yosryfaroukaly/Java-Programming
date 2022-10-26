package OperatorsPractice.Recap;

public class Pizza {
    public static void main(String[] args) {
        String typeOfPizza = "Cheese";
        int numberOfSlices= 8;
        int numberOfPeopleEating = 4;
        int slicesPerPerson =   numberOfSlices/numberOfPeopleEating;
        int slicesLeftOver = numberOfSlices%numberOfPeopleEating;

        String report = "We ordered " + typeOfPizza + " pizza with " + numberOfSlices + " slices, " + numberOfPeopleEating + " people ate " + slicesPerPerson + " each with " + slicesLeftOver + " left over";

        System.out.println(report);



    }
}
