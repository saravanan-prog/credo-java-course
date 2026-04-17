package throwExample;

public class throwUnderstand {
    public static void main(String[] args) {

        System.out.println("Program started");
       boolean isProdcutAvailble = false;

       try{
           if(isProdcutAvailble){
               System.out.println("product is available");
           }
           else {
               throw new RuntimeException("Product is out of stock");
           }

       }
       catch (RuntimeException e){
           System.out.println("Runtime Error:::"+e.getMessage());
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       }

       System.out.println("Program End");

    }
}
