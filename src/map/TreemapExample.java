package map;

import java.util.Map;
import java.util.TreeMap;

public class TreemapExample {
    public static void main(String[] args) {
        Map<Integer,String> foodMenu = new TreeMap<>();
        foodMenu.put(3,"rava-dosai");
        foodMenu.put(1,"dosai");
        foodMenu.put(2,"idly");


        for(Integer item : foodMenu.keySet()){
            System.out.println("key===>" +item + " values====>" +foodMenu.get(item));
        }

        System.out.println("Food menu====>" + foodMenu.values());
    }
}
