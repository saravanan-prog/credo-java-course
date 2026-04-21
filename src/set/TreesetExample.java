package set;

import java.util.Set;
import java.util.TreeSet;

public class TreesetExample {
    public static void main(String[] args) {
        Set<String> nameList = new TreeSet<>();    // sorting order + unique
        nameList.add("zeebra"); // 0
        nameList.add("zeebra"); // 1
        nameList.add("lion");   // 2
        nameList.add("goat");   // 3
        nameList.add("monkey"); // 4

        System.out.println("nameList====>" + nameList);
    }
}
