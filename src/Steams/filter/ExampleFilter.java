package Steams.filter;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleFilter {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ramesh","Suresh","kamalesh","Rajesh","vaitheshwaran","Abi","Archana");
        List<Integer> numbers = Arrays.asList(100,500,600,700,800);

        System.out.println("Name  list start with A letter");

        List<String> startsNamesAlettercandiates = names.stream()
                .filter(e -> e.startsWith("A"))
                .toList();

        startsNamesAlettercandiates.stream()
                        .forEach(System.out::println);

        System.out.println("Numbers List greater then  200");

        numbers.stream()
                .filter(x -> x > 200 )
                .forEach(System.out::println);
    }
}
