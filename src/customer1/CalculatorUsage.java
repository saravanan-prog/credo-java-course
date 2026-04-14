package customer1;

import common.calc.Calculator;

public class CalculatorUsage {

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        double result = obj.add(100,100);
        System.out.println("result===>" + result);
    }

}
