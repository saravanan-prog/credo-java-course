package exception;

public class ArrayException {
    public static void main(String[] args) {
        int[] number = new int[3];
        number[0] = 10;
        number[1] = 2;
        number[2] = 3;


        ArrayException obj = new ArrayException();

        try {
            System.out.println(number[2]);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Error" + e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("IndexBound ex :" + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Error:::" + e.getMessage());
        }
        finally {

            System.out.println("Finally block calling");

        }


        int a = 10;
        int b = 0;


        try{
            int c = a / b;
            System.out.println("c====>" + c);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }





    }
}
