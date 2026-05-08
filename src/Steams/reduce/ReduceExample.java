package Steams.reduce;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(100,500,600,700,800);

        int sum = numbers.stream().reduce( 0, (a,b) -> a + b);

        System.out.println("sum====>" + sum);
    }
}
