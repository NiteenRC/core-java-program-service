package java8.collection;

import java.util.Arrays;

/**
 * Given a list of numbers,
 * square them and
 * filter the numbers which are greater 10000
 * and then find average of them
 */
public class Average {
    public static void main(String[] args) {
        int[] intArr = {100, 24, 13, 44, 114, 200, 40, 112};

        Arrays.stream(intArr).boxed()
                .mapToInt(x -> x * x)
                .filter(x -> x > 10000)
                .average()
                .ifPresent(System.out::println);
    }
}
