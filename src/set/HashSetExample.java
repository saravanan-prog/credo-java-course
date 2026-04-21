package set;

import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> dataItems = new HashSet<>();        // any order +  unique
        dataItems.add(10);
        dataItems.add(10);
        dataItems.add(3);
        dataItems.add(4);
        dataItems.add(4);
        dataItems.add(3);
        dataItems.add(10);


        for(Integer item : dataItems){
            System.out.println("item====>" + item);
        }


    }
}
