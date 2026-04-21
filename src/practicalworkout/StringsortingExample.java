package practicalworkout;

import java.util.*;

public class StringsortingExample {
    public static void main(String[] args) {
        String nameList[] = {"saravanan","suren","sanjay","kishore","kumar","arun","rajesh"};

        Set<String> dataSet = new TreeSet<>();

        for(String item : nameList){
            dataSet.add(item);
        }

        System.out.println("Sorted Name List===>" + dataSet);




    }
}
