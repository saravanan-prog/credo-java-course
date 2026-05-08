package Interfaces.ExampleInterfaceThread;

public class Main {

    public static void main(String[] args) {
        Runnable obj1 = () -> System.out.println("Thread 1  is running");
        Thread t1 = new Thread(obj1);
        t1.start();


        Runnable obj2 = () -> System.out.println("Thread 2  is running");
        Thread t2 = new Thread(obj2);
        t2.start();


        Runnable obj3 = () -> {
            int a = 100;
            int b = 500;
            int c  =  a + b;
            System.out.println("c====>" + c);
        };
        Thread t3 = new Thread(obj3);
        t3.start();

    }
}
