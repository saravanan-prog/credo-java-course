package Interfaces.Example2;

@FunctionalInterface
interface Hotel{
    void menuCard();
}

public class Main {
    public static void main(String[] args) {
        Hotel obj = () -> {
            String menu [] = {"idly","dosa","vada","poori"};
            for(String item : menu){
                System.out.println( "item====>" + item);
            }

        };

        obj.menuCard();
    }
}
