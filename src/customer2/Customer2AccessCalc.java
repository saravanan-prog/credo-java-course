package customer2;

import common.calc.Calculator;

public class Customer2AccessCalc {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        double result = obj.add(250,250);
        System.out.println("result===>" + result);
    }
}
