package javaOperators;

public class LogicalOperator {
    public static void main(String[] args) {
        int firstValue = 500;
        int secondValue = 500;

        int thridValue = 600;
        int fourthValue = 601;

        boolean isProductAvailable = true;

        System.out.println("Logical AND (&&) ====>" + (( firstValue==secondValue ) && (thridValue==fourthValue)));
        System.out.println("Logical and (||) ====>" + (( firstValue == secondValue ) || (thridValue==fourthValue)));
        System.out.println("Logical Not (!) =====>" + (!isProductAvailable));



    }
}
