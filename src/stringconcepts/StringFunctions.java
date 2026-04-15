package stringconcepts;

public class StringFunctions {
    public static void main(String[] args) {
        String text = "I love country india is a my country";

        System.out.println("Length ====>" + text.length());
        System.out.println("UpperCase===> " + text.toUpperCase());
        System.out.println("lowercase===> " + text.toLowerCase());
        System.out.println("substring===>" + text.substring(18,26) );
        System.out.println("string contains checking ===>" + text.contains("country") );
        System.out.println("string Index checking ===>" + text.indexOf("country") );
        System.out.println("string Last Index checking ===>" + text.lastIndexOf("country") );


        String newStr = text.replace("india","united states");

        System.out.println("text=====>" + text);


    }
}
