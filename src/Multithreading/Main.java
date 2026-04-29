package Multithreading;

class PlayMusic implements Runnable{
    public void run() {
        try{
            Thread.sleep(500);
            System.out.println("vijay alothota boopathi song Music is playing");

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}

class DownloadMovie implements Runnable{
    public void run(){
        System.out.println("Movie is downloading");
    }
}

class Typecoding implements Runnable{
    public void run(){
        System.out.println("code is typing");
    }
}


public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PlayMusic());
        Thread t2 = new Thread(new DownloadMovie());
        Thread t3 = new Thread(new Typecoding());

        t1.start();
        t2.start();
        t3.start();

    }
}
