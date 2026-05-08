package Steams.foreach;

import java.util.*;

public class ForEachExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ramesh","Suresh","kamalesh","Rajesh","vaitheshwaran");
        List<Integer> numbers = Arrays.asList(100,500,600,700,800);

        System.out.println("Name  List");

        names.stream()
                .forEach(System.out::println);

        System.out.println("Numbers List");
        numbers.stream()
                .forEach(System.out::println);


    }
}
