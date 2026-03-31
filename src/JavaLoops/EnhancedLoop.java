package JavaLoops;

public class EnhancedLoop {
    public static void main(String[] args) {
        String[] candidateNames = {"arjun","vimal","gayathiri","sharmila"};

        for(String name : candidateNames){
            System.out.println("names====>" + name);
        }

        System.out.println("------------------------------------");

        int[] numbers = {100,400,500,600,800,900};

        for(int item : numbers){
            System.out.println("item=====>" + item);
        }
    }
}
