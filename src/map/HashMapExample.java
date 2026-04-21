package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {
    public static void main(String[] args) {
        //hashmap
        Map<String,String> countryList = new TreeMap<>();
        countryList.put("UK","united kingdom");
        countryList.put("PK","pakisthan");
        countryList.put("IN","india");

        for(String item : countryList.keySet()){
            System.out.println("item====>" + item + " value====>" + countryList.get(item));
        }

    }
}
