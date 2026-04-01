package JavaMethods;

public class Methods {

    int addition(){
        int a = 10;
        int b = 5;
        int c = a + b;
        return c;
    }
    int subraction() {
        int a = 100;
        int b = 50;
        int c = a - b;

        return c;
    }

    /* Main Method */
    public static void main(String[] args) {

        Methods obj = new Methods();
        int additionResult = obj.addition();
        int subractionResult = obj.subraction();

        System.out.println("result=====>" + additionResult);
        System.out.println("subractionResult=====>" +subractionResult);




    }
}
