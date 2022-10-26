package OperatorsPractice.Recap;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Yosry Aly";
        boolean isCitizen  = true , criminalBackground= false;
        int age = 35;

        boolean isEligibleToVote= age>=18 && isCitizen && !criminalBackground;
        System.out.println(name+ " isE ligible To Vote ? = " + isEligibleToVote);


    }
}
