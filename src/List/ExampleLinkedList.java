package List;

import java.util.*;

public class ExampleLinkedList {
    public static void main(String[] args) {

        List<Integer> num = new LinkedList<>();
        num.add(10);
        num.add(5);
        num.add(5);
        num.add(6);
        num.add(1,3);
        num.add(null);



        System.out.println("num===>"+num);
        System.out.println("size===>"+num.size());
        num.remove(4);
        System.out.println("after 6th index deleted list===>" + num);
        num.clear();
        System.out.println("after clear===>" + num);

    }
}
