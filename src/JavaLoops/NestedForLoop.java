package JavaLoops;

public class NestedForLoop {
    public static void main(String[] args) {
        System.out.println("1. left traingle Pattern");

        for(int i=1; i<=5; i++){
            for(int j=1; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("2. reverse traingle Pattern");

        for(int i=1; i<=5; i++){
            for(int j=5; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("3. left traingle Pattern with numnber");

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("3. reverse traingle Pattern with numnber");

        for(int i=1; i<=5; i++){
            for(int j=5; j>=i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
