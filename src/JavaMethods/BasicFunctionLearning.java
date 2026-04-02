package JavaMethods;

class FunctionsUnderstand{
    int addition(){
        int a = 10;
        int b = 5;
        return a + b;
    }
    double subraction(){
        double a = 10.55;
        double b = 20.55;
        return a - b;
    }
    String welcomeMessage(){
        return "Mathematical Subject";
    }
    boolean studentStatus(){
        boolean result = true;
        return result;
    }
    void printSomeData(){
        System.out.println("Welcome to java world");
    }
}



public class BasicFunctionLearning {
    public static void main(String[] args) {
        FunctionsUnderstand obj = new FunctionsUnderstand();
        System.out.println("additon method calling===>" + obj.addition());
        System.out.println("subraction method calling===>" + obj.subraction());
    }
}
