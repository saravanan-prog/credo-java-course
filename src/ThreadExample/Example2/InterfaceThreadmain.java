package ThreadExample.Example2;

class Tamilmovie{
    public String movieName = "Gilli movie";
}


class DownloadMovie extends Tamilmovie implements Runnable{
    public void run(){
        System.out.println(movieName + " Downloding ....");
    }
}


public class InterfaceThreadmain {
    public static void main(String[] args) {
        Thread obj = new Thread(new DownloadMovie());
        obj.start();

    }
}
