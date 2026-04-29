package ThreadExample.Example1;

class PlayMusic extends Thread {

    public void run(){
        for(int i=0; i<5; i++) {
            System.out.println("Play music");

        }
    }

}




public class BasicThreadMain {
    public static void main(String[] args) {
        PlayMusic pm = new PlayMusic();
        pm.start();
    }
}
