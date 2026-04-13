package F_Polymorphism.compiletime.Example1;

class Calculator {

    int add(int a,int b){
        return  a + b;
    }
    int add(int a,int b,int c){
        return  a + b;
    }
    float add(float a, float b){
        return a + b;
    }
    double add(double a, double b){
        return a + b;
    }
    String add(String a , String b){
        return a + b;
    }

}



public class MainPolymorphism {

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int wholeValueResult = obj.add(10,20);
//        double result =  obj.add(20.5,20);
//        String strResult = obj.add("100","100");

        System.out.println("wholeValueResult====>" + wholeValueResult);
    }

}
