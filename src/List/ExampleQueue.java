package List;

import java.util.LinkedList;
import java.util.Queue;

public class ExampleQueue {
    public static void main(String[] args) {
        Queue<Integer> number = new LinkedList<>();  // FIFO order

        number.add(10);
        number.add(5);
        number.add(3);

        System.out.println("Before Remove queue st===>" + number);

        number.remove();   // delete the first node

        System.out.println("After Remove queue st===>" + number);

        System.out.println("current head ====>" + number.poll());



    }
}
