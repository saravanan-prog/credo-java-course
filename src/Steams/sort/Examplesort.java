package Steams.sort;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Examplesort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ramesh","Suresh","kamalesh","Rajesh","vaitheshwaran","Abi","Archana");

        names.stream()
                .filter(x -> x.length() > 4)
                .map(x-> x.toUpperCase())
                .sorted()
                .forEach(System.out::println);

    }
}
