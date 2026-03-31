package JavaLoops;

public class DoWhileLoop {
    public static void main(String[] args) {
        /* Exit control loop */
        int i =1;

        do{
            System.out.println(i + " * 2 = " + i*2);
            i++;
        }
        while(i <= 100);
    }
}
