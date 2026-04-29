package ThreadExample.Example3;



class Main{
    public static void main(String[] args) {
        Thread t1 = new Thread( () -> {
            try{
//                Thread.sleep(6000);
                System.out.println("Thread 1 is executting....");
            }
            catch(Exception e){
                e.printStackTrace();
            }

        });

        Thread t2 = new Thread( () -> {
            System.out.println("Thread 2 is executting....");
        });

        Thread t3 = new Thread( () -> {
            System.out.println("Thread 3 is executting....");
        });

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Thread1 Status====>"+ t1.isAlive());
        System.out.println("Thread2 Status====>"+ t1.isAlive());
        System.out.println("Thread3 Status====>"+ t1.isAlive());




    }
}