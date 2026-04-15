package stringconcepts;

public class StringBufferLearning {
    public static void main(String[] args) {

        String name = "Saravanan Durai";

        StringBuffer text = new StringBuffer(name);
        text.insert(9,",");

        System.out.println("text=====>" + text);
        System.out.println("Reversed text=====>" + text.reverse());
    }
}
