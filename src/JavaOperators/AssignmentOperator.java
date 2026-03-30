package JavaOperators;

public class AssignmentOperator {
    public static void main(String[] args) {
        int firstNumber = 100;
        int secondNumber = 300;

        firstNumber = firstNumber + secondNumber; /* old techique */
        firstNumber += secondNumber; //addition-assignment operator.

        System.out.println("FirstNumber ====>" +firstNumber);
    }
}
