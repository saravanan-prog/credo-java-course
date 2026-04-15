package stringconcepts;

public class StringCompare {
    public static void main(String[] args) {
        String s1 = "hello";   // 2000
        String s2 = "hello world";   // 2000

        boolean result = (s1.equals(s2));


        String text1 =  new String("Java is a heart");    // 3000
        String text2 =  new String("Java is a heart");    // 4000

        System.out.println("Result====>" + (text1 == text2));

        System.out.println("value compare===>" + text1.equals(text2));
    }
}
