package practicalworkout;

import java.util.Set;
import java.util.TreeSet;

public class ArraySorting {
    public static void main(String[] args) {
        // [10,5,4,3,2,1,8,10,4,9]      -> remove duplicate from sorting

        int arr[] = {10,5,4,3,2,1,8,10,4,9};
        Set<Integer> elements = new TreeSet<>();

        for(int item : arr){
            elements.add(item);
        }

        System.out.println("Elements====>" + elements);

     }
}
