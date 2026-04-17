package throwsExample;

class Calculator {

    int add(int a, int b) throws Exception{
        return a + b;
    }

    int sub(int a, int b) throws Exception{
        return a - b;
    }
    int div(int a, int b) throws ArithmeticException{
        return a / b;
    }

}

public class ThrowsExample {
    public static void main(String[] args) {
        try{
            Calculator obj = new Calculator();
            int result  = obj.div(10,0);

            System.out.println("result====>"+ result);
        }
        catch(Exception e){
            System.out.println("Error ::: "+e.getMessage());
        }

    }
}
