package wrapperClass;

public class AutoBoxing {
    public static void main(String[] args) {

        //auto boxing
        Integer a = 100;
        Integer b = 500;
        Integer c = a + b;
        System.out.println(c);

        // autboxing

        int price = 100;
        Integer actualPrice = price;           // primitive to wrapper class


        //unboxing

        Integer offer = 10;
        int percentage = offer;    //wraper class to primitive  -> unboxing


    }
}
