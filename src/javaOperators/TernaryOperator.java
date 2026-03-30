package javaOperators;

public class TernaryOperator {
    public static void main(String[] args) {
        /*  ? - TrueBlock
        *   : - False Block
        * */

        int firstValue = 100;
        int secondValue = 200;

        String result = (firstValue == secondValue ) ? "Equal" : "Not-Equal";

        System.out.println("Result=====>" + result);

        int age = 18;
        String voteEligbleResult = (age >= 18) ? "Eligible" : "Not-Eligible";
        System.out.println("VoterEligbleResult=====>" + voteEligbleResult);









    }
}
