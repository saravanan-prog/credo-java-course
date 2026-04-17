package exception;

public class ExceptionHandling {


    public static void main(String[] args) {
        System.out.println("Program is start");
        try {
            int a = 10;
            int b  = 0;
            int c = a / b;                      // Found Exception
            System.out.println("c====>" + c);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }






        System.out.println("Program is End");
    }
}
