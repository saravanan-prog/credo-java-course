package TypeCasting;

public class ImplictandExplicitconversation {
    public static void main(String[] args) {
        /**
         *  Implicit casting -> small-Type to big-Type
         */

         int a = 100;
         double result = a;
        System.out.println("result====>" + result);

        /* Explict conversation - Big to small */

        double value = 1000;
        float floatResult = (float) value;
        System.out.println("float Result====>" + floatResult);


    }
}
