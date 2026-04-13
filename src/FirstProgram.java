//import common.Calculator;
//import common.Shapes;

import common.*;

public class FirstProgram {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int addResult = obj.add(10, 10);
        System.out.println("additionResult====>" + addResult);

        Shapes sobj = new Shapes();
        int circleArea = sobj.getCircleRadius(20);

        System.out.println("circleArea====>" + circleArea);

    }

}
