package Steams.map;

import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ramesh","Suresh","kamalesh","Rajesh","vaitheshwaran","Abi","Archana");

        List captialNames = names.stream()
                .map(x -> x.toUpperCase())
                .toList();


        captialNames.stream()
                .forEach(System.out::println);


    }
}
