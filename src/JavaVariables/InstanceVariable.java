package JavaVariables;

public class InstanceVariable {

    int firstNumber = 100;
    int secondNumber = 200;

    public static void main(String[] args) {

        InstanceVariable obj = new InstanceVariable();
        System.out.println("first Number ===>" + obj.firstNumber + " " + "secondNumber====>" + obj.secondNumber);

    }
}
