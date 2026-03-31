package JavaLoops;

public class ContinueStatement {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++){
            if(i==25 || i==1 || i==5)
                continue;

            System.out.println("i===>" + i);
        }

    }
}
